package ex.aaronfae.junit4;

import static org.junit.Assert.*;

import org.junit.Test;

public class ErrorAndFailureTest {
	
	/*
	 * failure一般由单元测试使用的断言方法判断失败而引起的，它表示在测试点发现了问题，
	 * 也就是说程序输出的结果和我们预期的结果不一样。
	 * 
	 * error是由代码异常引起的，它可以产生于被测试代码本身的错误，也可以是被测试代码中的一个隐藏bug。
	 * 
	 * 最重要一点：测试用例不是用来证明你逻辑是正确的，而是用来证明你的断言没有错。
	 */

	@Test
	public void testAdd() {
		assertEquals(5, new Calculator().add(3, 3));
	}

	@Test
	public void testDivide() {
		assertEquals(5, new Calculator().divide(4, 0));
	}

}
