package lambdaexpression;

import org.junit.Assert;
import org.junit.Test;

public class ValidationTest implements UserValidation {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		boolean result = UserValidation.validateFirstName("Kalyan");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstLetterSmall_CheckForValidation_ReturnFalse() {
		boolean result = UserValidation.validateFirstName("kalyan");
		Assert.assertFalse(result);
	}

	@Test
	public void givenTwoLetters_CheckForValidation_ReturnFalse() {
		boolean result = UserValidation.validateFirstName("ka");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLasrName_CheckForValidationForLName_ReturnTrue() {
		boolean result = UserValidation.validateLastName("Tanniru");
		Assert.assertTrue(result);
	}

	@Test
	public void givenTwoSmalls_CheckForValidationForLName_RetrunFalse() {
		boolean result = UserValidation.validateLastName("tanniru");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmail_CheckForValidationForEmail_RetrunTrue() {
		boolean result = UserValidation.validateEmails("xyz.abc@bl.com");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmail_CheckForValidationForEmail_RetrunFalse() {
		boolean result = UserValidation.validateEmails("xyz.abc@bl");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmail_CheckForValidationForMobile_RetrunTrue() {
		boolean result = UserValidation.validateMobile("91 9604224348");
		Assert.assertTrue(result);
	}

	@Test
	public void WithoutSpace_CheckForValidationForMobile_RetrunFalse() {
		boolean result = UserValidation.validateMobile("919604263284");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword_CheckForValidationForPasswordRule4_RetrunTrue() {
		boolean result = UserValidation.validatePassword("Kalyanabc@123");
		Assert.assertTrue(result);
	}

	@Test
	public void withoutRule4_CheckForValidationForPasswordRule4_ReturnFalse() {
		boolean result = UserValidation.validatePassword("Kalyan1234");
		Assert.assertFalse(result);
	}

}