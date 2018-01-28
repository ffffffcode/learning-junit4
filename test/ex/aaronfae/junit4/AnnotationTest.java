package ex.aaronfae.junit4;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class AnnotationTest {

	/*
	 * @Test����һ����ͨ�������γ�Ϊһ�����Է���
	 * 
	 * @Test(expected=XX.class)�����쳣
	 * 
	 * @Test(timeout=����)�������е�ʱ��
	 * 
	 * @Ignore�������εķ����ᱻ��������������
	 * 
	 * @RunWith�����Ը��Ĳ��������� org.junit.runner.Runner
	 */

	@Test(expected = ArithmeticException.class)
	public void testDivide() {
		assertEquals(6, new Calculator().divide(6, 0));
	}

	@Ignore("����ԭ��")
	@Test(timeout = 2000)
	public void testWhile() {
		while (true) {
			System.out.println("Running...");
		}
	}

	@Test(timeout = 3000)
	public void testReadFile() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
