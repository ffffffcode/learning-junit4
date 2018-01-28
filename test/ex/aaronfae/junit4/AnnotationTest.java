package ex.aaronfae.junit4;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class AnnotationTest {

	/*
	 * @Test：将一个普通方法修饰成为一个测试方法
	 * 
	 * @Test(expected=XX.class)处理异常
	 * 
	 * @Test(timeout=毫秒)限制运行的时间
	 * 
	 * @Ignore：所修饰的方法会被测试运行器忽略
	 * 
	 * @RunWith：可以更改测试运行器 org.junit.runner.Runner
	 */

	@Test(expected = ArithmeticException.class)
	public void testDivide() {
		assertEquals(6, new Calculator().divide(6, 0));
	}

	@Ignore("忽略原因")
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
