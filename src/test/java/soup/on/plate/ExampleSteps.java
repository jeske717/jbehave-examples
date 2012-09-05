package soup.on.plate;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static org.junit.Assert.*;

public class ExampleSteps {

	private Validator validator;
	private String result;
	
	@Given("I have a validator")
	public void iHaveAValidator() {
		validator = new Validator();
	}
	
	@When("I validate '$value'")
	@Alias("I validate <value>")
	public void iValidateString(@Named("value") String value) {
		result = validator.validate(value);
	}
	
	@Then("the validation result should be empty")
	public void validationResultShouldBeEmpty() {
		assertEquals("", result);
	}
	
	@Then("the validation result should be '$expected'")
	@Alias("the validation result should be <expected>")
	public void validationResultShouldBeExpected(@Named("expected") String expected) {
		assertEquals(expected, result);
	}
}
