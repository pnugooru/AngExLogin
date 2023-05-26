package gov.irs.aoic.test.steps;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import gov.irs.aoic.test.libs.ConfUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Common {
	
	public static ExtentTest test;
	public static ExtentReports report;
	private static WebDriver driver;
	public static Properties localConf;
	public static final String userDir = System.getProperty("user.dir");
	public static Scenario testScenario;
	
	@Before
	public void setUp(Scenario scenario) throws Exception {
		testScenario = scenario;
		localConf = ConfUtils.loadConf();
		report = new ExtentReports(userDir + ConfUtils.getProperty("extentRptPath") + "_" + getDate() + ".html", false);
		String scenarioName = scenario.getName();
		test = report.startTest(scenarioName);
		getWebDriver().get(ConfUtils.getEnvProperty("url"));
		test.log(LogStatus.INFO, "AOIC Test Started");
	}
	
	@After
	public void tearDown() throws Exception {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
		report.endTest(test);
		report.flush();
		report.close();
	}
	
	public static WebDriver getWebDriver() {
		if (driver==null) {

			System.setProperty("webdriver.edge.driver", userDir + ConfUtils.getProperty("msEdgeDvrPath"));
			EdgeOptions edgeOptions = new EdgeOptions();
			String usrDataPath = "user-data-dir="+System.getProperty("user.home") + ConfUtils.getProperty("usrDataPath");
			edgeOptions.addArguments("--remote-allow-origins=*");
			driver=new EdgeDriver(edgeOptions);
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	public String getDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");  		
		Date curDate = new Date();
		return formatter.format(curDate);
	}
	
	public static String addScreenshot(String fileName) {
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		try {
			//final byte[] screenshot = ((TakesScreenshot)getWebDriver()).getScreenshotAs(OutputType.BYTES);
			//scenario.attach(screenshot, "image/png", "CaseCatCode");
			File src = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File( userDir + ConfUtils.getProperty("screenshotPath")+testScenario.getName()+"_"+fileName+Calendar.getInstance().getTimeInMillis()+".png");
			FileUtils.copyFile(src, destFile);
			return destFile.getAbsolutePath();
		} catch(Exception e) {
			e.printStackTrace();
		} 
		return null;
		
	}
	
	public void cleanupScreenshots() {
		try {
			File destFile = new File( userDir + ConfUtils.getProperty("screenshotPath"));
			FileUtils.cleanDirectory(destFile);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void LogFailedTestScreenCapture(String message) {
		test.log(LogStatus.FAIL, message + Common.test.addScreenCapture(Common.addScreenshot("Exception")));
	}
}
