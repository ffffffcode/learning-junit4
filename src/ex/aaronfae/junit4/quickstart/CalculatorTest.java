package ex.aaronfae.junit4.quickstart;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * ����Calculator��Junit4������
 * 
 * @author AaronFae
 *
 */
public class CalculatorTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void add() {
		assertEquals(6, new Calculator().add(3, 3));
	}

}
