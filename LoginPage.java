package gov.irs.aoic.test.pages;

import org.openqa.selenium.By;
import com.relevantcodes.extentreports.LogStatus;

import gov.irs.aoic.test.steps.Common;

public class LoginPage extends Common {
	
	public void clickLogin() throws InterruptedException {
		//Thread.sleep(3000);
		//getWebDriver().findElement(By.xpath("//a[@class='signin']")).click();
		//Thread.sleep(3000);
	}
	
	public void login( String user, String pwd) throws InterruptedException {
		getWebDriver().findElement(By.name("loginId")).sendKeys(user);
		//Thread.sleep(1000);
		getWebDriver().findElement(By.name("password")).sendKeys(pwd);
		Thread.sleep(1000);
		getWebDriver().findElement(By.name("logon")).click();
		Thread.sleep(5000);
	}
	
	public void validateLogin() {

		if (getWebDriver().findElements(By.className("loginError")).isEmpty()){
			test.log(LogStatus.PASS, "Logged In Successfully from Validate Login Page");			
		} else {
			test.log(LogStatus.FAIL, "LogIn Failed from Validate Login Page"+test.addScreenCapture(addScreenshot("Login")));
		}
	}

}
