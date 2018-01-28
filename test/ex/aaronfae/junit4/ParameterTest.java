package ex.aaronfae.junit4;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * ������������
 * 
 * @author AaronFae
 *
 */
@RunWith(Parameterized.class)

public class ParameterTest {

	/*
	 * 1.����Ĭ�ϵĲ���������Ϊ@RunWith(Parameterized.class)
	 * 2.�������������Ԥ��ֵ�ͽ��ֵ
	 * 3.����һ����������ΪCollection�Ĺ�����̬��������ͬ@Parameters����
	 * 4.Ϊ���Է�������һ�����в����Ĺ������캯���������б����ĸ�ֵ
	 * 5.��д���Է���
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
