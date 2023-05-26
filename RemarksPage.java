package gov.irs.aoic.test.pages;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import gov.irs.aoic.test.steps.Common;

public class RemarksPage extends Common {


	public void validateAddUpdateDeleteRemarks() throws InterruptedException{
		getWebDriver().findElement(By.xpath("//*[@id=\"bodySection\"]/div[1]/ul/li[4]/a")).click();
		test.log(LogStatus.PASS, "Clicked on Remarks");
		getWebDriver().findElement(By.xpath("//*[@id=\"navlistStartAnchor\"]")).click();
		getWebDriver().findElement(By.name("remark")).sendKeys("Add remark 1");
		getWebDriver().findElement(By.className("flat-button-nf")).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "Clicked Submit");
		Thread.sleep(1000);
		validateUpdateTodaysRemarks();
		validateUpdateLink();

		Thread.sleep(1000);
		getWebDriver().findElement(By.name("remarkBlock")).clear();
		getWebDriver().findElement(By.name("remarkBlock")).sendKeys("Update remark 2");
		getWebDriver().findElement(By.className("flat-button-nf")).click();
		Thread.sleep(1000);
		validateDeleteLink();
		validateRemarksLink();
		getWebDriver().findElement(By.xpath("//*[@id=\"navlistStartAnchor\"]")).click();
		getWebDriver().findElement(By.name("remark")).sendKeys("11111111111111111111111111111111111111111111111111111111111111111111111111"+
			"22222222222222222222222222222222222222222222222222222222222222222222222222"+
			"33333333333333333333333333333333333333333333333333333333333333333333333333"+
			"44444444444444444444444444444444444444444444444444444444444444444444444444"+
			"55555555555555555555555555555555555555555555555555555555555555555555555555"+
			"66666666666666666666666666666666666666666666666666666666666666666666666666"+
			"77777777777777777777777777777777777777777777777777777777777777777777777777"+
			"88888888888888888888888888888888888888888888888888888888888888888888888888"+
			"99999999999999999999999999999999999999999999999999999999999999999999999999"+
			"00000000000000000000000000000000000000000000000000000000000000000000000000"+
			"11111111111111111111111111111111111111111111111111111111111111111111111111"+
			"22222222222222222222222222222222222222222222222222222222222222222222222222"+
			"33333333333333333333333333333333333333333333333333333333333333333333333333"+
			"44444444444444444444444444444444444444444444444444444444444444444444444444"+
			"55555555555555555555555555555555555555555555555555555555555555555555555555");
		getWebDriver().findElement(By.className("flat-button-nf")).click();
				
	}
	

	
	public void validateUpdateTodaysRemarks() throws InterruptedException {
		Thread.sleep(2000);
		getWebDriver().findElement(By.xpath("//*[@id=\"bodySection\"]/div[2]/div[1]/ul/li[3]/a")).click();
		test.log(LogStatus.PASS, "clicked on Update Today's Remarks"); 
    }
	
	public void validateUpdateLink() throws InterruptedException {
		Thread.sleep(2000);
		for(int i=2;i<100;i++) {
			try {
				getWebDriver().findElement(By.xpath("//*[@id=\"TABLE_4\"]/tbody/tr["+i+"]/td[1]/a[1]/b")).click();
				break;
			} catch(Exception e) {
				if(i==99) {
					throw e;
				}
			}
		}
		test.log(LogStatus.PASS, "clicked on Update Link"); 
		//*[@id="TABLE_4"]/tbody/tr[2]/td[1]/a[1]/b
    }
	
	public void validateDeleteLink() throws InterruptedException {
		Thread.sleep(2000);
		for(int i=2;i<100;i++) {
			try {
				getWebDriver().findElement(By.xpath("//*[@id=\"TABLE_4\"]/tbody/tr["+i+"]/td[1]/a[2]/b")).click();
				break;
			} catch(Exception e) {
				if(i==99) {
					throw e;
				}
			}
		}
		getWebDriver().switchTo().alert().accept();
		test.log(LogStatus.PASS, "clicked on Delete Link"); 
    }
	
	public void validateRemarksLink() throws InterruptedException {
		Thread.sleep(2000);
		getWebDriver().findElement(By.xpath("//*[@id=\"TABLE_1\"]/tbody/tr[2]/td[1]/a[5]")).click();
		test.log(LogStatus.PASS, "clicked on Remarks"); 
    }

	
}

