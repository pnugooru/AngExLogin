package gov.irs.aoic.test.pages;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import gov.irs.aoic.test.steps.Common;

public class AreaOfficeMenuPage extends Common {
	
	public void chkAreaOfficeText() throws InterruptedException {
		
		if (getWebDriver().getPageSource().contains("Area Office Menu")) {
	 		  test.log(LogStatus.PASS, "Area Office Text is present in the Area Office Menu Page");
	   		  Thread.sleep(1000);	   		  
	    } 
		else {
			  test.log(LogStatus.FAIL, "Area Office Text is not present in the Area Office Menu Page"+test.addScreenCapture(addScreenshot("AreaOffice")));           
	    }
    }

	public void clickOnOICUser() throws InterruptedException {
		getWebDriver().findElement(By.xpath("//*[@id=\"TABLE_3\"]/tbody/tr/td[2]/span/a")).click();		
		Thread.sleep(1000);
    }
	
	
	// click on Decision Point Page
	public void clickDecisionPoint() throws InterruptedException {
	  Thread.sleep(5000);
	  getWebDriver().findElement(By.xpath("//a[@href='mainMenu.do?method=Submit&selectedMenuItemId=DecisionPoint']")).click();
    }
	
	
}

