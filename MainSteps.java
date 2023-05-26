package gov.irs.aoic.test.steps;

import gov.irs.aoic.test.impl.AOOfferStepsImpl;
import gov.irs.aoic.test.impl.LoginStepsImpl;
import io.cucumber.java.en.Then;

public class MainSteps {
	
	@Then("Main page is displayed")
	public void main_page_is_displayed() throws InterruptedException{
		
		try {
		    // Write code here that turns the phrase above into concrete actions
		    LoginStepsImpl mainImpl = new LoginStepsImpl();
		    
		    // logout from MainPage
		    mainImpl.validMain();
		} catch(Exception e) {
			Common.LogFailedTestScreenCapture(e.getMessage());
			throw e;
		}
	}
	
	@Then("Main page is displayed and update Location")
	public void main_page_is_displayed_and_update_Location() throws InterruptedException{
		try {
			//Note:For this test case make sure the user has been created first time in Database
			//If the user already exists remove and recreate it with central maint setup
			
		    // Write code here that turns the phrase above into concrete actions
		    LoginStepsImpl mainImpl = new LoginStepsImpl();
		    
		    mainImpl.updateOICLocation();
		    
		    // logout from MainPage
		    mainImpl.validMain();
		} catch(Exception e) {
			Common.LogFailedTestScreenCapture(e.getMessage());
			throw e;
		}
	    
	}
	
	@Then("Main page is displayed and LogonToAO")
	public void main_page_is_displayed_and_LogonToAO() throws InterruptedException{
		try {
			//Note:For this test case make sure the user has been created first time in Database
			//If the user already exists remove and recreate it with central maint setup
			
		    // Write code here that turns the phrase above into concrete actions
		    LoginStepsImpl mainImpl = new LoginStepsImpl();
		    
		    mainImpl.validLogonToAO();
		    
		    // logout from MainPage
		    mainImpl.validMain();
		} catch(Exception e) {
			Common.LogFailedTestScreenCapture(e.getMessage());
			throw e;
		}
	}
	
	@Then("Main page is displayed and DoClearLetters")
	public void main_page_is_displayed_and_DoClearLetters() throws InterruptedException{
		try {
			//Note:For this test case make sure the user has been created first time in Database
			//If the user already exists remove and recreate it with central maint setup
			
		    // Write code here that turns the phrase above into concrete actions
		    LoginStepsImpl mainImpl = new LoginStepsImpl();
		    
		    mainImpl.validateDoClearLetters();
		    
		    // logout from MainPage
		    mainImpl.validMain();
		} catch(Exception e) {
			Common.LogFailedTestScreenCapture(e.getMessage());
			throw e;
		}
	}
	
	@Then("Main page is displayed and ValidateAddUpdateDeleteRemarks")
	public void main_page_is_displayed_and_ValidateAddUpdateDeleteRemarks() throws InterruptedException{
		
		try {
			//Note:For this test case make sure the user has been created first time in Database
			//If the user already exists remove and recreate it with central maint setup
			
		    // Write code here that turns the phrase above into concrete actions
			LoginStepsImpl mainImpl = new LoginStepsImpl();
		    AOOfferStepsImpl remarksImpl = new AOOfferStepsImpl();
		    
		    remarksImpl.validateAddUpdateDeleteRemarks();
		    
		    // logout from MainPage
		    mainImpl.validMain();
		} catch(Exception e) {
			Common.LogFailedTestScreenCapture(e.getMessage());
			throw e;
		}
	}
	
	@Then("Main page is displayed and CheckCCCUpdateEntity")
	public void main_page_is_displayed_and_CheckCCCUpdateEntity() throws InterruptedException{
		try {
			//Note:For this test case make sure the user has been created first time in Database
			//If the user already exists remove and recreate it with central maint setup
			
		    // Write code here that turns the phrase above into concrete actions
			LoginStepsImpl mainImpl = new LoginStepsImpl();
		    AOOfferStepsImpl remarksImpl = new AOOfferStepsImpl();
		    
		    remarksImpl.checkCCCUpdateEntity();
		    
		    // logout from MainPage
		    mainImpl.validMain();
		} catch(Exception e) {
			Common.LogFailedTestScreenCapture(e.getMessage());
			throw e;
		}
		    
	}
	
	@Then("Main page is displayed and AddUpdatePOA")
	public void main_page_is_displayed_and_AddUpdatePOA() throws InterruptedException{
		try {
			//Note:For this test case make sure the user has been created first time in Database
			//If the user already exists remove and recreate it with central maint setup
			
		    // Write code here that turns the phrase above into concrete actions
			LoginStepsImpl mainImpl = new LoginStepsImpl();
		    AOOfferStepsImpl poaImpl = new AOOfferStepsImpl();
		    
		    poaImpl.addUpdatePOA();
		    
		    // logout from MainPage
		    mainImpl.validMain();
		} catch(Exception e) {
			Common.LogFailedTestScreenCapture(e.getMessage());
			throw e;
		}
	}
	
	@Then("Main page is displayed and GenerateRejectLetter")
	public void main_page_is_displayed_and_GenerateRejectLetter() throws InterruptedException{
		try {
			//Note:For this test case make sure the user has been created first time in Database
			//If the user already exists remove and recreate it with central maint setup
			
		    // Write code here that turns the phrase above into concrete actions
			LoginStepsImpl mainImpl = new LoginStepsImpl();
		    AOOfferStepsImpl poaImpl = new AOOfferStepsImpl();
		    
		    poaImpl.generateRejectLetter();
		    
		    // logout from MainPage
		    mainImpl.validMain();
		} catch(Exception e) {
			Common.LogFailedTestScreenCapture(e.getMessage());
			throw e;
		}
	}

}
