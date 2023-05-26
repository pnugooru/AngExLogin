package gov.irs.aoic.test.pages;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import gov.irs.aoic.test.steps.Common;

public class AddUpdatePOAPage extends Common{
		
	public void addPOAEntity() throws InterruptedException {

		getWebDriver().findElement(By.xpath("//*[@id=\"bodySection\"]/div[1]/ul/li[9]/a")).click();
		test.log(LogStatus.PASS, "Clicked on POA");
		getWebDriver().findElement(By.xpath("//*[@id=\"bodySection\"]/div[2]/div[1]/a")).click();
		test.log(LogStatus.PASS, "Clicked on Add POA");
		getWebDriver().findElement(By.name("poaBO.cafNumber")).sendKeys("987654321");
		getWebDriver().findElements(By.name("poaBO.includeInCorrespondence")).get(0).click();
		getWebDriver().findElement(By.name("poaBO.name1")).sendKeys("POA smooth");
		getWebDriver().findElement(By.name("poaBO.address1")).sendKeys("4175 Final Road");
		getWebDriver().findElement(By.name("poaBO.city")).sendKeys("Austin");
		getWebDriver().findElement(By.name("poaBO.state")).sendKeys("TX");
		getWebDriver().findElement(By.name("zipCode1")).sendKeys("78748");
		getWebDriver().findElement(By.name("workNumber1")).sendKeys("512");
		getWebDriver().findElement(By.name("workNumber2")).sendKeys("999");
		getWebDriver().findElement(By.name("workNumber3")).sendKeys("9999");
		getWebDriver().findElement(By.name("faxNumber1")).sendKeys("512");
		getWebDriver().findElement(By.name("faxNumber2")).sendKeys("555");
		getWebDriver().findElement(By.name("faxNumber3")).sendKeys("5555");
		getWebDriver().findElement(By.className("flat-button-nf")).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "Clicked Submit");
		Thread.sleep(1000);
		validateUpdatePOA();
		validateUpdateLink();
		
		getWebDriver().findElement(By.xpath("//*[@id=\"bodySection\"]/div[2]/div[1]/a")).click();
		test.log(LogStatus.PASS, "Clicked on Add POA");
		getWebDriver().findElement(By.name("poaBO.cafNumber")).sendKeys("1234-12345R");
		getWebDriver().findElement(By.xpath("//*[@id=\"TABLE_5\"]/tbody/tr[1]/td[2]/span/a")).click();

		String pw = getWebDriver().getWindowHandle();
		Set<String> s1 = getWebDriver().getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext()) {
			String cw = i1.next();
			if(!pw.equals(cw)) {
				getWebDriver().switchTo().window(cw);
				getWebDriver().findElement(By.name("1")).click();
				
			}
		}
		getWebDriver().switchTo().window(pw);
		getWebDriver().findElements(By.name("poaBO.includeInCorrespondence")).get(0).click();
		getWebDriver().findElement(By.className("flat-button-nf")).click();
		validateDeleteLink();
	
	}

	private void validateUpdatePOA() throws InterruptedException {
		Thread.sleep(2000);
		
		int size  = getWebDriver().findElements(By.linkText("Update")).size();
		WebElement element = getWebDriver().findElement(By.xpath("//*[@id=\"TABLE_5\"]/tbody/tr["+size+"]/td[1]/a[1]/b"));
		scrollToElementAndClick(element);
		
		
		test.log(LogStatus.PASS, "Clicked on Update POA");
	}
	
	public void validateUpdateLink() throws InterruptedException {
		Thread.sleep(2000);
		getWebDriver().findElement(By.name("poaBO.name1")).clear();
		getWebDriver().findElement(By.name("poaBO.name1")).sendKeys("POA Smith");
		test.log(LogStatus.PASS, "Clicked on Update Link");
		getWebDriver().findElement(By.xpath("//*[@id=\"bodySection\"]/fieldset[2]/form/div/input[2]")).click();
    }
	
	public void validateDeleteLink() throws InterruptedException {
		Thread.sleep(2000);
		int size  = getWebDriver().findElements(By.linkText("Delete")).size();
		WebElement element = getWebDriver().findElement(By.xpath("//*[@id=\"TABLE_5\"]/tbody/tr["+(size-1)+"]/td[1]/a[2]/b"));
		scrollToElementAndClick(element);
		getWebDriver().switchTo().alert().accept();
		test.log(LogStatus.PASS, "clicked on Delete Link");
    }
	
	private void scrollToElementAndClick(WebElement element) {
		
		((JavascriptExecutor)getWebDriver()).executeScript("arguments[0].scrollIntoView(true);",element); 
		element.click();
		
	}
}	
