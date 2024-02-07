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
public class InvalidSequenceException extends Exception{
	public String getMessage() {
		return "The password cannot contain more than two of the same character in sequence.";
	}
}
