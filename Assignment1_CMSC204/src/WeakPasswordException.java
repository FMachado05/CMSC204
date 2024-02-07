/*
 * Class: CMSC204 - 30377
 * Instructor: Khandan Vahabzadeh Monshi
 * Description: Exception JUnit Test cases
 * Due: 2.6.2024
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: Felipe Machado
*/
public class WeakPasswordException extends Exception {
	public String getMessage() {
		return "The password is OK but weak - it contains fewer than 10 characters";
	}
}
