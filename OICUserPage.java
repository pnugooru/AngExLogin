package gov.irs.aoic.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import gov.irs.aoic.test.steps.Common;

public class OICUserPage extends Common {
	
	public void checkUpdateRecordText() throws InterruptedException {
		if (getWebDriver().findElement(By.linkText("Update Record")).isDisplayed()) {
	 		  test.log(LogStatus.PASS, "Update Record Text is present in the OIC User Page and will be clicked");
	 		  getWebDriver().findElement(By.linkText("Update Record")).click();		
	    } 
		else {
			  test.log(LogStatus.FAIL, "Update Record Text is not present in the OIC User Page"+test.addScreenCapture(addScreenshot("UpdateRecord")));           
	    }
		Thread.sleep(2000);
	}
	
	public void checkOICRecordText() throws InterruptedException {
		
		if (getWebDriver().getPageSource().contains("Update OIC User Location")) {
	 		  test.log(LogStatus.PASS, "Update OIC User Location Text is present in the OIC User Page");
	   		  Thread.sleep(1000);	   		  
	    } 
		else {
			  test.log(LogStatus.FAIL, "Update OIC User Location Text is not present in the OIC User Page"+test.addScreenCapture(addScreenshot("UpdateOICUserLocation")));           
	    }
	}
		
	public void updateOICUserLocation(String loginID, String wNum1, String wNum2, String wNum3, String ext, String locationCd) throws InterruptedException {
		
		getWebDriver().findElement(By.name("loginIdNm")).clear();
		getWebDriver().findElement(By.name("loginIdNm")).sendKeys(loginID);

		/*Select s = new Select(getWebDriver().findElement(By.name("locCd")));
		Thread.sleep(1000);
		s.selectByVisibleText(locationCd);*/
		
		getWebDriver().findElement(By.name("workNum1")).clear();
		getWebDriver().findElement(By.name("workNum1")).sendKeys(wNum1);
		getWebDriver().findElement(By.name("workNum2")).clear();
		getWebDriver().findElement(By.name("workNum2")).sendKeys(wNum2);
		getWebDriver().findElement(By.name("workNum3")).clear();
		getWebDriver().findElement(By.name("workNum3")).sendKeys(wNum3);
		getWebDriver().findElement(By.name("extNum")).clear();		
		getWebDriver().findElement(By.name("extNum")).sendKeys(ext);
		Thread.sleep(5000);
		
		//click the Submit button
		if (!getWebDriver().findElements(By.xpath("//input[@value='Submit']")).isEmpty()){
	 		  test.log(LogStatus.PASS, "Updated OIC User Location values and Submit button is pressed");
	 		 //getWebDriver().findElements(By.xpath("//input[@value='Submit']")).get(0).click();\
	 		getWebDriver().findElement(By.className("flat-button-nf")).click();
		}
		
		Thread.sleep(5000);

    }
}

