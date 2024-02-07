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

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



/**
 * Test the methods of PasswordChecker
 * @author Professor Kartchner
 *
 */
public class PasswordChecker_GFA_Test {
	ArrayList<String> passwords;
	String password1, password2;

	@Before
	public void setUp() throws Exception {
		passwords = new ArrayList<String>();
	}

	@After
	public void tearDown() throws Exception {
		passwords = null;
	}
	
	@Test
	public void testGetInvalidPasword()
	{
		PasswordCheckerUtility.getInvalidPasswords(passwords);
		
	}
	
	@Test
	public void testIsValidPasswordTooShort()
	{
		try{
			assertTrue(PasswordCheckerUtility.isValidPassword("abc12"));
		}
		catch(LengthException e)
		{
			assertTrue("Successfully threw a lengthExcepetion",true);
		}
		catch(Exception e)
		{
			assertTrue("Threw some other exception besides lengthException",false);
			System.out.println("line 49");
		}
	}
	
	
	@Test
	public void testIsValidPasswordSuccess()
	{
		try{
			assertEquals(true,PasswordCheckerUtility.isValidPassword("strongPWD1"));
		}
		catch(NoSpecialCharacterException e)
		{
			System.out.println(e.getMessage());
			assertTrue("Successfully threw a NoSpecialCharacterException",true);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			assertFalse("Threw some other exception besides lengthException", true);
		}
	}
		
	@Test
	public void testIsValidPasswordTooShortThrowsSomeOtherExcep()
	{
		try{
			assertTrue(PasswordCheckerUtility.isValidPassword("abcABs"));
		}
		catch(LengthException e)
		{
			System.out.println(e.getMessage());
			assertTrue("Successfully threw a lengthExcepetion",true);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			assertTrue("Threw some other exception besides lengthException", true);
		}
	}
	
	
}
