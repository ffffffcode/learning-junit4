package ex.aaronfae.junit4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Junit����������ʾ
 * 
 * @author AaronFae
 *
 */
public class JunitFlowTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass ����setup���س�ʼ���Ȳ���");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass ����tear down��ж�ر���Դ�Ȳ���");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before ��ִ�б����Է���ǰ��ִ��");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after ��ִ�б����Է�������ִ��");
	}

	@Test
	public void test1() {
		System.out.println("����1");
	}

	@Test
	public void test2() {
		System.out.println("����2");
	}
}
