package ex.aaronfae.junit4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Junit测试流程演示
 * 
 * @author AaronFae
 *
 */
public class JunitFlowTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass 用于setup加载初始化等操作");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass 用于tear down拆卸关闭资源等操作");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before 在执行被测试方法前会执行");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after 在执行被测试方法完后会执行");
	}

	@Test
	public void test1() {
		System.out.println("测试1");
	}

	@Test
	public void test2() {
		System.out.println("测试2");
	}
}
