package gov.irs.aoic.test.steps;

import gov.irs.aoic.test.impl.LoginStepsImpl;
import io.cucumber.java.en.Then;

public class DecisionPointSteps {
	
	@Then("DecisionPoint page is validated")
	public void decisionpoint_page_is_displayed() throws InterruptedException {
		try {
		    // Write code here that turns the phrase above into concrete actions
		    LoginStepsImpl mainImpl = new LoginStepsImpl();
		    // validate Decision Point page
		    mainImpl.validateDecisionPoint();
		    // logout from MainPage
		    mainImpl.validMain();
		} catch(Exception e) {
			Common.LogFailedTestScreenCapture(e.getMessage());
			throw e;
		}
	}

}
