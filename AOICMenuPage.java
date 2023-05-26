package gov.irs.aoic.test.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import com.relevantcodes.extentreports.LogStatus;

import gov.irs.aoic.test.steps.Common;
import gov.irs.aoic.test.libs.ConfUtils;

public class AOICMenuPage extends Common {
	
	public void clickOICUser() throws InterruptedException {
		getWebDriver().findElement(By.linkText(ConfUtils.getEnvProperty("user"))).click();		
		Thread.sleep(1000);
    }
	
	public void clickOICAccess() throws InterruptedException {
		getWebDriver().findElement(By.linkText("OIC Access")).click();
		test.log(LogStatus.PASS, "clicked on OIC Access"); 		
		Thread.sleep(1000);
    }
	
	
	public void clickOICAreaOffice() throws InterruptedException {
		Thread.sleep(1000);
		getWebDriver().findElement(By.linkText("OIC Area Office")).click();
		test.log(LogStatus.PASS, "clicked on OIC Area Office"); 
    }
	
	public void verifyElementPresentByXpath(String elementXPath, String elementName ) {
		
		if(getWebDriver().findElement(By.xpath(elementXPath)).isDisplayed()) {
			test.log(LogStatus.PASS, elementName + " element present");  
		} else {
			test.log(LogStatus.FAIL, elementName + " element not present"+ test.addScreenCapture(addScreenshot("elementName")));
		}
		
	}
	
	public void validateElementByXpath(String elementXPath, String elementName ) {
		
		getWebDriver().findElement(By.xpath(elementXPath)).click();
		test.log(LogStatus.PASS, " clicked on " + elementName);  
		
	} 
	
	
	/*public void validatePlusImg() {
		getWebDriver().findElement(By.xpath("//*[@id=\"plusImg\"]")).click();
		test.log(LogStatus.PASS, "clicked on plusImg"); 
	}
	
	public void validateMinusImg() {
		getWebDriver().findElement(By.xpath("//*[@id=\"minusImg\"]")).click();
		test.log(LogStatus.PASS, "clicked on minusImg"); 
	}
	
	public void validateResetImg() {
		getWebDriver().findElement(By.xpath("//*[@id=\"resetImg\"]")).click();
		test.log(LogStatus.PASS, "clicked on resetImg"); 
	}
	*/
	
	public void validateUpdateRecord() throws InterruptedException {

		getWebDriver().findElement(By.xpath("//*[@id=\"bodySection\"]/div[1]/div[1]/a")).click();
		test.log(LogStatus.PASS, "clicked on Update Record"); 
		if(getWebDriver().getPageSource().contains("Update OIC User Location")) {
			test.log(LogStatus.PASS, "Update OIC User Location Text present");  
		} else {
			test.log(LogStatus.FAIL, "Update OIC User Location Text not present"+test.addScreenCapture(addScreenshot("UpdateOICUserLocation")));  
			
		}
		Thread.sleep(1000);
		getWebDriver().findElement(By.name("extNum")).clear();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "Cleared existing extNum "); 
		getWebDriver().findElement(By.name("extNum")).sendKeys(ConfUtils.getEnvProperty("extNum"));
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "Entered new extNum ");
		getWebDriver().findElement(By.className("flat-button-nf")).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "Clicked Submit");
		Thread.sleep(1000);
		validateLocationText();
		Thread.sleep(1000);
		validateExtnText();
	}
	
	public void validateLocationText() {
		
		if(ConfUtils.getEnvProperty("locationText").equals(getWebDriver().findElement(By.xpath("//*[@id=\"TABLE_4\"]/tbody/tr[2]/td[2]/span")).getText())) {
			test.log(LogStatus.PASS, "Location Text verified");  
		} else {
			test.log(LogStatus.FAIL, "Location Text not matching"+test.addScreenCapture(addScreenshot("LocationText")));  
		}
		
	}
	
	public void validateExtnText() {
		
		if(ConfUtils.getEnvProperty("extNum").equals(getWebDriver().findElement(By.xpath("//*[@id=\"TABLE_4\"]/tbody/tr[1]/td[6]/span[3]")).getText())) {
			test.log(LogStatus.PASS, "extNum verified");  
		} else {
			test.log(LogStatus.FAIL, "extNum not verified"+test.addScreenCapture(addScreenshot("extNum")));  
		}
		
	}
	
	public void validateFormsAndLetters() {
		getWebDriver().findElement(By.linkText("FORMS & LETTERS")).click();
		test.log(LogStatus.PASS, "Clicked on Forms and Letters");

	}
	
	
	public void validateClearFormsAndLetters() {
		getWebDriver().findElement(By.linkText("Clear Forms & Letters")).click();
		test.log(LogStatus.PASS, "Clicked on Clear Forms and Letters");

	}
	
	public void validateClearLetterFormText() {
		if(getWebDriver().getPageSource().contains("Clear Letter/Form")) {
			test.log(LogStatus.PASS, "Clear Letter/Form Text present");  
		} else {
			test.log(LogStatus.FAIL, "Clear Letter/Form not present"+test.addScreenCapture(addScreenshot("ClearLetter")));  
		}
		
	}
	
	public void validateLetterFormsSelection() throws InterruptedException{
		getWebDriver().findElement(By.name("selectedFormLetter")).click();
		Thread.sleep(1000);
		getWebDriver().findElement(By.xpath("//input[@name='selectedFormLetter' and @value='2844']")).click();
		Thread.sleep(1000);
		getWebDriver().findElement(By.xpath("//input[@name='selectedFormLetter' and @value='tfrp']")).click();
		Thread.sleep(1000);
		getWebDriver().findElement(By.xpath("//input[@name='selectedFormLetter' and @value='673']")).click();
		Thread.sleep(1000);
		getWebDriver().findElement(By.xpath("//input[@name='selectedFormLetter' and @value='1000']")).click();
		Thread.sleep(1000);
		getWebDriver().findElement(By.xpath("//input[@name='selectedFormLetter' and @value='tran']")).click();
		Thread.sleep(1000);
		getWebDriver().findElement(By.xpath("//input[@name='selectedFormLetter' and @value='241']")).click();
		Thread.sleep(1000);
		getWebDriver().findElement(By.xpath("//input[@name='selectedFormLetter' and @value='coob']")).click();
		Thread.sleep(1000);
		getWebDriver().findElement(By.xpath("//input[@name='selectedFormLetter' and @value='tltr']")).click();
		Thread.sleep(1000);
		getWebDriver().findElement(By.xpath("//input[@name='selectedFormLetter' and @value='comb']")).click();
		Thread.sleep(1000);
		getWebDriver().findElement(By.xpath("//input[@name='selectedFormLetter' and @value='Ret']")).click();
		Thread.sleep(1000);
		getWebDriver().findElement(By.xpath("//input[@name='selectedFormLetter' and @value='2515']")).click();
		Thread.sleep(1000);
		getWebDriver().findElement(By.xpath("//input[@name='selectedFormLetter' and @value='7249']")).click();	
		Thread.sleep(1000);
		getWebDriver().findElement(By.xpath("//input[@name='selectedFormLetter' and @value='1271']")).click();	
		Thread.sleep(1000);
		getWebDriver().findElement(By.xpath("//input[@name='method' and @value='Submit']")).click();
		Thread.sleep(2000);
		boolean b = false;
		for(int i =2; i<=15; i++) {
			b="0".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_4']/tbody/tr["+i+"]/td[3]")).getText());
			if(b==false)
				break;
		}
		if(b) {	
			test.log(LogStatus.PASS, "Verified Clear/Form Letters"); 
		} else {
			test.log(LogStatus.FAIL, "Failed Clear/Form Letters verification"+test.addScreenCapture(addScreenshot("ClearLetter"))); 
		}
		Thread.sleep(1000);
	}
	
	public void validateAOMenu() {
		getWebDriver().findElement(By.xpath("//*[@id=\"TABLE_1\"]/tbody/tr[2]/td[1]/a[2]")).click();
		test.log(LogStatus.PASS, "Clicked on AO Menu");

	}
	
	public void validateAOOffers() {
		getWebDriver().findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[2]/a")).click();
		test.log(LogStatus.PASS, "Clicked on AO Offers");

	}
	
	public void validateOfferQuery() {
		getWebDriver().findElement(By.xpath("//*[@id=\"TABLE_1\"]/tbody/tr[2]/td[1]/a[3]")).click();
		test.log(LogStatus.PASS, "Clicked on Offer Query");

	}
	
	public void validateAOOffersQuery(String offerNum) throws InterruptedException{
		getWebDriver().findElement(By.name("offerNum")).sendKeys(offerNum);
		Thread.sleep(1000);
		getWebDriver().findElement(By.xpath("//input[@name='method' and @value='Query']")).click();
		
	}

	public void validateRemarks(String offerNum) throws InterruptedException{
		getWebDriver().findElement(By.xpath("//*[@id=\"bodySection\"]/div[1]/ul/li[4]/a")).click();
		test.log(LogStatus.PASS, "Clicked on Remarks");
		if("1000000312".equals(offerNum)) {
			boolean b = false;
			b=getWebDriver().findElement(By.xpath("//*[@id=\"TABLE_1\"]/tbody/tr[3]/td/span[1]")).getText().equals("Remarks & Case History")
				&& "SYSTEM-NOTE: THE FOLLOWING FILL-IN TEXT WAS USED ON THE Return Ltr".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[5]/td/div[3]/span")).getText().trim())
				&& "Form 1040 1991".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[5]/td/div[4]/span")).getText().trim())
				&& "SYSTEM-NOTE: END OF FILL-IN TEXT WAS USED ON THE Return Ltr".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[5]/td/div[5]/span")).getText().trim())
			    && "SYSTEM-NOTE: THE FOLLOWING FILL-IN TEXT WAS USED ON THE Return Ltr".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[5]/td/div[7]/span")).getText().trim())
			    && "SYSTEM-NOTE: END OF FILL-IN TEXT WAS USED ON THE Return Ltr".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[5]/td/div[9]/span")).getText().trim())
			    && "SYSTEM-NOTE: THE FOLLOWING FILL-IN TEXT WAS USED ON THE Return Ltr".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[5]/td/div[11]/span")).getText().trim())
			    && "Form 1040, U.S. Individual Income Tax Return, for the period(s)".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[5]/td/div[12]/span")).getText().trim())
			    && "SYSTEM-NOTE: END OF FILL-IN TEXT WAS USED ON THE Return Ltr".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[5]/td/div[14]/span")).getText().trim())
			    && "SYSTEM-NOTE: THE FOLLOWING FILL-IN TEXT WAS USED ON THE Return Ltr".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[5]/td/div[16]/span")).getText().trim())
			    && "Form 1040 1993".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[5]/td/div[17]/span")).getText().trim())
			    && "SYSTEM-NOTE: END OF FILL-IN TEXT WAS USED ON THE Return Ltr".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[5]/td/div[18]/span")).getText().trim())
			    ;
			if(b) {
				test.log(LogStatus.PASS, "Passed Remarks Verification");
			} else {
				test.log(LogStatus.FAIL, "Failed Remarks Verification"+test.addScreenCapture(addScreenshot("Remarks")));
			}
		} else if("1000044444".equals(offerNum)) {
			boolean b = false;
			b=getWebDriver().findElement(By.xpath("//*[@id=\"TABLE_1\"]/tbody/tr[3]/td/span[1]")).getText().equals("Remarks & Case History")
				&& "SYSTEM-NOTE: THE FOLLOWING FILL-IN TEXT WAS USED ON THE Additional Info".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[3]/span")).getText().trim())
				&& "Ltr".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[4]/span")).getText().trim())
				&& "The Letter 2844 optional paragraph N had extra spaces after".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[5]/span")).getText().trim())
				&& "some paragraph fill-in entries.  When using paragraph N of the".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[6]/span")).getText().trim())
			    && "Additional Info letter, the word \"you've\" was having the".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[7]/span")).getText().trim())
			    && "apostrophe stripped out in the printing.  These have been".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[8]/span")).getText().trim())
			    && "corrected.".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[9]/span")).getText().trim())
			    && "SYSTEM-NOTE: END OF FILL-IN TEXT WAS USED ON THE Additional Info Ltr".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[10]/span")).getText().trim())
			    && "SYSTEM-NOTE: THE FOLLOWING FILL-IN TEXT WAS USED ON THE Combination Ltr".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[12]/span")).getText().trim())
			    && "COMB-O optional paragraph.".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[13]/span")).getText().trim())
			    && "SYSTEM-NOTE: END OF FILL-IN TEXT WAS USED ON THE Combination Ltr".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[14]/span")).getText().trim())
			    && "SYSTEM-NOTE: THE FOLLOWING FILL-IN TEXT WAS USED ON THE Combination Ltr".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[16]/span")).getText().trim())
			    && "Form 1040, U.S. Individual Income Tax Return, for the period(s)".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[17]/span")).getText().trim())
			    && "ending December 31, 2004, 2005.".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[18]/span")).getText().trim())
			    && "Form 940, Employer's Annual Federal Unemployment Tax Return, for".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[20]/span")).getText().trim())
			    && "the period(s) ending December 31, 2004, 2005.".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[21]/span")).getText().trim())
			    && "Form 941, Employer's Quarterly Federal Tax Return, for the".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[23]/span")).getText().trim())
			    && "quarter(s) ending  December 31, 2004, 2005.".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[24]/span")).getText().trim())
			    && "Form 1065, U.S. Partnership Return of Income for the".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[26]/span")).getText().trim())
			    && "calendar/fiscal year(s) ending 2004, 2005.".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[27]/span")).getText().trim())
			    && "Form 1120, U.S. Corporation Income Tax Return, for".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[29]/span")).getText().trim())
			    && "calendar/fiscal year(s) ending 2004, 2005.".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[30]/span")).getText().trim())
			    && "Form 2290, Heavy Highway Vehicle User Tax Form, for the Period(s)".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[32]/span")).getText().trim())
			    && "beginning July 1, 2004, 2005.".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[33]/span")).getText().trim())
			    && "Form Other 2004 2005".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[35]/span")).getText().trim())
			    && "SYSTEM-NOTE: END OF FILL-IN TEXT WAS USED ON THE Combination Ltr".equals(getWebDriver().findElement(By.xpath("//table[@id='TABLE_5']/tbody/tr[2]/td/div[36]/span")).getText().trim())
			    ;
			if(b) {
				test.log(LogStatus.PASS, "Passed Remarks Verification");
			} else {
				test.log(LogStatus.FAIL, "Failed Remarks Verification"+test.addScreenCapture(addScreenshot("Remarks")));
			}
		}
		 
		
	}
	
}

