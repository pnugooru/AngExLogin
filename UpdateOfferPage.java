package gov.irs.aoic.test.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import gov.irs.aoic.test.steps.Common;

public class UpdateOfferPage extends Common {


	public void checkCCCUpdateEntity() throws InterruptedException{
		WebDriver driver = getWebDriver();
		driver.findElement(By.id("navlistStartAnchor")).click();
		test.log(LogStatus.PASS, "Clicked on Update Offer");
		
		WebElement element = driver.findElement(By.name("offer.occCode"));
		Select select = new Select(element);
		List<WebElement> allOptions = select.getOptions();
		
		String[] caseCategoryCodes  = {"1","2","5","6","7","8","10","11","15","19","27","28","29","31","33","40","41","42","43","99"};
		
		List<String> caseCatCodes = Arrays.asList(caseCategoryCodes);
		
		List<String> options = new ArrayList<String>();
		
		for(WebElement webElement : allOptions) {
			options.add(webElement.getAttribute("value"));
		}
		
		for(String catCode : caseCatCodes) {
			if(options.indexOf(catCode)!=-1 ) {
				test.log(LogStatus.PASS, "Case Category code "+catCode +" found");
			} else {
				test.log(LogStatus.FAIL, "Case Category code "+catCode +" not found"+test.addScreenCapture(addScreenshot("CaseCatCode")));

				break;
			}
		}
		
		Select oa = new Select(driver.findElement(By.name("offer.orgAmdInd")));
		oa.selectByValue("A");
		test.log(LogStatus.PASS, "Ammend Selected ");
		driver.findElement(By.className("flat-button-nf")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"bodySection\"]/div[1]/ul/li[11]/a")).click();
		test.log(LogStatus.PASS, "Clicked on Entities tab");
		driver.findElement(By.id("navlistStartAnchor")).click();
		test.log(LogStatus.PASS, "Clicked on Update Offer Entity link");
		
		driver.findElement(By.name("offerEntity.state")).clear();
		Thread.sleep(1000);
		driver.findElement(By.name("offerEntity.state")).sendKeys("00");
		test.log(LogStatus.PASS, "Input State as 00");
		driver.findElement(By.className("flat-button-nf")).click();
		String error = driver.findElement(By.xpath("//*[@id=\"error\"]/ul/strong/font/li")).getText();
		if(error.equals("State is invalid.")) {
			test.log(LogStatus.PASS, "State is Invalid Message displayed");
		} else {
			test.log(LogStatus.FAIL, "State is Invalid Message not displayed"+test.addScreenCapture(addScreenshot("State")));
		}

		
	}

}

