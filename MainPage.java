package gov.irs.aoic.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.relevantcodes.extentreports.LogStatus;

import gov.irs.aoic.test.steps.Common;

public class MainPage extends Common {
	
	public void searchText() throws InterruptedException {
		getWebDriver().findElement(By.name("q")).click();
		//Thread.sleep(1000);
		getWebDriver().findElement(By.name("q")).sendKeys("IRS");
		//Thread.sleep(1000);
		getWebDriver().findElement(By.name("q")).sendKeys(Keys.ENTER);
		//Thread.sleep(1000);
		
	}
	
	public void validateMainPage() throws InterruptedException {
		Thread.sleep(3000);

		if (getWebDriver().findElements(By.xpath("//input[@value='Logout']")).isEmpty()){
			 test.log(LogStatus.FAIL, "LogIn Failed from Validate Main Page" + test.addScreenCapture(addScreenshot("Login")));   
        } else {
            test.log(LogStatus.PASS, "Logged in and logged out Successfully from Validate Main Page");
    		getWebDriver().findElement(By.name("method")).click();
        }
		
		
	}
	
	public void clickAOICMenuLnk() throws InterruptedException {
		Thread.sleep(2000);
		getWebDriver().findElement(By.xpath("//*[@id=\"TABLE_1\"]/tbody/tr[2]/td[1]/a[1]")).click();
		test.log(LogStatus.PASS, "Going back to AOIC Main Menu" );
    }
	
	
	

}
