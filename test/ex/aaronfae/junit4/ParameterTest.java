package ex.aaronfae.junit4;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * 参数化测试类
 * 
 * @author AaronFae
 *
 */
@RunWith(Parameterized.class)

public class ParameterTest {

	/*
	 * 1.更改默认的测试运行器为@RunWith(Parameterized.class)
	 * 2.声明变量来存放预期值和结果值
	 * 3.声明一个返回类型为Collection的公共静态方法，并同@Parameters修饰
	 * 4.为测试方法声明一个带有参数的公共构造函数，并进行变量的赋值
	 * 5.编写测试方法
	 */

	int expected = 0;
	int input1 = 0;
	int input2 = 0;

	public ParameterTest(int expected, int input1, int input2) {
		this.expected = expected;
		this.input1 = input1;
		this.input2 = input2;
	}

	@Parameters
	public static Collection<Object[]> t() {
		return Arrays.asList(new Object[][] { { 6, 2, 3 }, { 8, 2, 4 }, { 9, 3, 3 } });
	}

	@Test
	public void testMultiply() {
		assertEquals(expected, new Calculator().multiply(input1, input2));
	}

}
