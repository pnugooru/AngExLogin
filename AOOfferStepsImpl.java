package gov.irs.aoic.test.impl;

import gov.irs.aoic.test.pages.AOICMenuPage;
import gov.irs.aoic.test.pages.AddUpdatePOAPage;
import gov.irs.aoic.test.pages.GenerateRejectLetterPage;
import gov.irs.aoic.test.pages.RemarksPage;
import gov.irs.aoic.test.pages.UpdateOfferPage;

public class AOOfferStepsImpl {

	AOICMenuPage aoicMenuPage = new AOICMenuPage();
	RemarksPage remarksPage = new RemarksPage();
	UpdateOfferPage offerPage = new UpdateOfferPage();
	AddUpdatePOAPage poaPage = new AddUpdatePOAPage();
	GenerateRejectLetterPage grlPage = new GenerateRejectLetterPage();

	public void validateAddUpdateDeleteRemarks() throws InterruptedException {
		aoicMenuPage.clickOICAreaOffice();
		aoicMenuPage.validateAOOffers();
		Thread.sleep(1000);
		aoicMenuPage.validateAOOffersQuery("1000000312");
		Thread.sleep(1000);
		remarksPage.validateAddUpdateDeleteRemarks();
		Thread.sleep(1000);
		
	}
	
	public void checkCCCUpdateEntity() throws InterruptedException {
		aoicMenuPage.clickOICAreaOffice();
		aoicMenuPage.validateAOOffers();
		Thread.sleep(1000);
		aoicMenuPage.validateAOOffersQuery("1000054444");
		Thread.sleep(1000);
		offerPage.checkCCCUpdateEntity();
		Thread.sleep(1000);
		
	}
	
	public void addUpdatePOA() throws InterruptedException {
		aoicMenuPage.clickOICAreaOffice();
		aoicMenuPage.validateAOOffers();
		Thread.sleep(1000);
		aoicMenuPage.validateAOOffersQuery("1000054444");
		Thread.sleep(1000);
		poaPage.addPOAEntity();
		Thread.sleep(1000);
		
	}
	
	public void generateRejectLetter() throws InterruptedException {
		aoicMenuPage.clickOICAreaOffice();
		aoicMenuPage.validateAOOffers();
		Thread.sleep(1000);
		aoicMenuPage.validateAOOffersQuery("1000044444");
		Thread.sleep(1000);
		grlPage.generateRejectLetter();
		Thread.sleep(1000);
		
	}
	
}
