package lambdaexpression;

import java.util.function.Predicate;

interface UserValidation {

	public static boolean validateFirstName(String firstName) {
		boolean isValid = isValid(firstName, (String info) -> {
			String regexFirst = "^([A-Z]{1}[a-z]{2,})";
			return info.matches(regexFirst);
		});
		return isValid;
	}

	public static boolean validateLastName(String lastName) {
		boolean isValid = isValid(lastName, (String info) -> {
			String regexLast = "^([A-Z]{1}[a-z]{2,})";
			return info.matches(regexLast);
		});
		return isValid;
	}

	public static boolean isValid(String data, Predicate<String> predicate) {
		return predicate.test(data);
	}

	public static boolean validateMobile(String mobileNumber) {
		boolean isValid = isValid(mobileNumber, (String info) -> {
			String regexMobileNumber = "^(\\d{2})( )([7-9]{1})(\\d{9})";
			return info.matches(regexMobileNumber);
		});
		return isValid;
	}

	public static boolean validatePassword(String password) {
		boolean isValid = isValid(password, (String info) -> {
			String regexPassword = "^([A-Z]{1}[a-zA-Z]{8,}[@#$%^&+=]{1}[0-9]{3,})";
			return info.matches(regexPassword);
		});
		return isValid;
	}

	public static boolean validateEmails(String email) {

		boolean isValid = isValid(email, (String info) -> {
			String regexemail = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
			return info.matches(regexemail);
		});
		return isValid;
	}
}