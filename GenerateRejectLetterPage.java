package gov.irs.aoic.test.pages;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import gov.irs.aoic.test.steps.Common;

public class GenerateRejectLetterPage extends Common {
	
	public void generateRejectLetter() throws InterruptedException {
		getWebDriver().findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[2]/a")).click();
		test.log(LogStatus.PASS, "Clicked on Forms & Letters");
		getWebDriver().findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[3]/a")).click();
		test.log(LogStatus.PASS, "Clicked on Acceptance Form 7249 button");
		
		
		getWebDriver().findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[2]/a")).click();
		test.log(LogStatus.PASS, "Clicked on Forms & Letters");
		getWebDriver().findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[3]/a")).click();
		test.log(LogStatus.PASS, "Clicked on  Acceptance Letter (Collectability) - 673 button");
		
	}

}
