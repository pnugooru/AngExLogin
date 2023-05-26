package gov.irs.aoic.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.relevantcodes.extentreports.LogStatus;

import gov.irs.aoic.test.steps.Common;

public class DecisionPointPage extends Common {
	
	public void validateDecisionPoint() throws InterruptedException {
		
		if (getWebDriver().getPageSource().contains("Decision Point Query")) {
	 		  test.log(LogStatus.PASS, "Decision Point Query text is present in the Decision Point Page");           
	    } 
		else {
			  test.log(LogStatus.FAIL, "Decision Point Query text is not present in the Decision Point Page"+test.addScreenCapture(addScreenshot("DecisionPoint")));           
	    }
		
		if (getWebDriver().findElement(By.linkText("Query By Offer")).isDisplayed()) {
	 		  test.log(LogStatus.PASS, "Query By Offer Text is present in the Decision Point Page");           
	    } 
		else {
			  test.log(LogStatus.FAIL, "Query By Offer Text is not present in the Decision Point Page"+test.addScreenCapture(addScreenshot("Offer")));           
	    }
		
		Thread.sleep(2000);
		
		if (getWebDriver().findElement(By.linkText("Query By TIN")).isDisplayed()) {
	 		  test.log(LogStatus.PASS, "Query By TIN Text is present in the Decision Point Page");           
	    } 
		else {
			  test.log(LogStatus.FAIL, "Query By TIN Text is not present in the Decision Point Page"+test.addScreenCapture(addScreenshot("Tin")));           
	    }
		
		//click the Query button
		if (!getWebDriver().findElements(By.xpath("//input[@value='Query']")).isEmpty()){
	 		  test.log(LogStatus.PASS, "Query button on Decision Point Query page is going to be submitted");
	 		 getWebDriver().findElements(By.xpath("//input[@value='Query']")).get(0).click();
		}
		
		Thread.sleep(5000);
	}
		
}

