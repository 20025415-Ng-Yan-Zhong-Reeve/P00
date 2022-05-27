import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	int a, b;
	Calculator cal = new Calculator();

	@Before
	public void setUp() throws Exception {
		a = 4321;
		b = 1234;
		Calculator cal = new Calculator();
	}

	@Test
	public void testadd() {
		int actual = cal.add(a, b);
		
		
		int expected = 5555;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubtract() {
		int actual = cal.subtract(a, b);
		
		
		int expected = 3087;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMultiply() {
		int actual = cal.multiply(a, b);
		
		
		int expected = 5332114;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDivide() {
		int actual = cal.divide(a, b);
		
		
		int expected = 3;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDivideWith0Denominator() {
		try {
			cal.divide(a, b);
			fail("Expected an IllegalArgumentException to be thrown");
		} catch (IllegalArgumentException e) {
			assertEquals("Division by zero is not supported", e.getMessage());
		} catch (Throwable t) {
			assertEquals("Expected an IllegalArgumentException to be thrown", t.getMessage());
		}
	}
	
	@After
	public void tearDown() throws Exception {
	}
}
