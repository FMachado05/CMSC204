
/*
 * Class: CMSC204 - 30377
 * Instructor: Khandan Vahabzadeh Monshi
 * Description: Program that checks passwords via GUI
 * Due: 2.6.2024
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: Felipe Machado
*/
import java.util.ArrayList;

public class PasswordCheckerUtility {

	public static void comparePasswords(String password, String passwordConfirm) throws UnmatchedException {
		if (!password.equals(passwordConfirm))
			throw new UnmatchedException();
	}

	public static boolean comparePasswordsWithReturn(String password, String passwordConfirm) {
		return password.equals(passwordConfirm);
	}

	public static boolean hasUpperAlpha(String password) throws NoUpperAlphaException {
		for (char c : password.toCharArray()) { // turn password into an array of chars and iterate through it
			if (Character.isUpperCase(c)) {
				return true;
			}
		}
		throw new NoUpperAlphaException();
	}

	public static boolean isValidLength(String password) throws LengthException {
		if (password.length() < 6)
			throw new LengthException();
		return true;
	}

	public static boolean hasLowerAlpha(String password) throws NoLowerAlphaException {
		for (char c : password.toCharArray()) {
			if (Character.isLowerCase(c))
				return true;
		}
		throw new NoLowerAlphaException();
	}

	public static boolean hasDigit(String password) throws NoDigitException {
		for (char c : password.toCharArray()) {
			if (Character.isDigit(c))
				return true;
		}
		throw new NoDigitException();
	}

	public static boolean hasSpecialChar(String password) throws NoSpecialCharacterException {
		for (char c : password.toCharArray()) {
			if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) // check if any of the chars in the
																				// password is a letter, a digit or a
																				// whitespace. if not, then it must be a
																				// special char and return true
				return true;
		}
		throw new NoSpecialCharacterException();
	}

	public static boolean NoSameCharInSequence(String password) throws InvalidSequenceException {
		for (int i = 0; i < password.length() - 2; i++) {
			if (password.charAt(i) == password.charAt(i + 1) && password.charAt(i) == password.charAt(i + 2)) {
				throw new InvalidSequenceException(); // throw an exception if there are more than 2 repeated chars in
														// sequence
			}
		}
		return false;
	}

	public static boolean isValidPassword(String password) throws LengthException, NoUpperAlphaException,
			NoLowerAlphaException, NoDigitException, NoSpecialCharacterException, InvalidSequenceException {
		return (isValidLength(password) && hasUpperAlpha(password) && hasLowerAlpha(password) && hasDigit(password)
				&& hasSpecialChar(password) && !NoSameCharInSequence(password));
	}

	public static boolean hasBetweenSixAndNineChars(String password) {
		return (password.length() >= 6 && password.length() <= 9);
	}

	public static boolean isWeakPassword(String password) throws WeakPasswordException {
		try {
			if (!hasBetweenSixAndNineChars(password) && isValidPassword(password)) {
				return false;
			} else if (isValidPassword(password) && hasBetweenSixAndNineChars(password)) {
				throw new WeakPasswordException();
			}
		} catch (Exception e) {
			e.getMessage();
		}
		throw new WeakPasswordException();
	}

	public static ArrayList<String> getInvalidPasswords(ArrayList<String> password) {
		ArrayList<String> temp = new ArrayList<String>();
		for (String s : password) {
			try {
				isValidPassword(s);
			} catch (Exception e) {
				temp.add(s + " " + e.getMessage()); // if not a valid password, show the password + message
			}
		}
		return temp;
	}

}
