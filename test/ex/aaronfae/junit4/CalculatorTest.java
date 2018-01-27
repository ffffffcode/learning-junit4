package ex.aaronfae.junit4;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * ≤‚ ‘CalculatorµƒJunit4≤‚ ‘¿‡
 * 
 * @author AaronFae
 *
 */
public class CalculatorTest {

	/*
	 * @Test public void test() { fail("Not yet implemented"); }
	 */

	@Test
	public void testAdd() {
		assertEquals(6, new Calculator().add(3, 3));
	}

	@Test
	public void testSubtract() {
		assertEquals(3, new Calculator().subtract(5, 2));
	}

}
