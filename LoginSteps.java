package gov.irs.aoic.test.steps;

import gov.irs.aoic.test.impl.LoginStepsImpl;
import io.cucumber.java.en.Given;

public class LoginSteps {
	
	@Given("User1 logs into AOIC as a valid user")
	public void user1_logs_into_AOIC_as_a_valid_user() throws InterruptedException {
		try {
		    // Write code here that turns the phrase above into concrete actions
			LoginStepsImpl loginImpl = new LoginStepsImpl();
			loginImpl.validlogin("user1", "pwd1");
		} catch(Exception e) {
			Common.LogFailedTestScreenCapture(e.getMessage());
			throw e;
		}
	}

	@Given("User2 logs into AOIC as a valid user")
	public void user2_logs_into_AOIC_as_a_valid_user() throws InterruptedException {
		try {
		    // Write code here that turns the phrase above into concrete actions
			LoginStepsImpl loginImpl = new LoginStepsImpl();
			loginImpl.validlogin("user2", "pwd2");
		} catch(Exception e) {
			Common.LogFailedTestScreenCapture(e.getMessage());
			throw e;
		}
	}
	
}
