import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook book1,book2;
	@BeforeEach
	void setUp() throws Exception {
		 book1 = new GradeBook(5);
		 book2 = new GradeBook(5);
		
		book1.addScore(5.0);
		book1.addScore(9.0);
		book1.addScore(8.0);
		book1.addScore(7.5);
		book1.addScore(2.0);
		book2.addScore(7.0);
		book2.addScore(8.0);
		book2.addScore(9.0);
		book2.addScore(6.0);
		book2.addScore(6.5);
	}

	@AfterEach
	void tearDown() throws Exception {
		book1 = null;
		book2 = null;
	}

	@Test
	void testAddScore() {
		assertEquals("5.0 9.0 8.0 7.5 2.0 ",book1.toString());
		assertEquals("7.0 8.0 9.0 6.0 6.5 ",book2.toString());
		assertEquals(5,book1.getScoreSize());
		assertEquals(5,book2.getScoreSize());
		
	}

	@Test
	void testSum() {
		assertEquals(31.5,book1.sum());
		assertEquals(36.5,book2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(2.0,book1.minimum());
		assertEquals(6.0,book2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(29.5,book1.finalScore());
		assertEquals(30.5,book2.finalScore());
	}

}
