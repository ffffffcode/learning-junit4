package ex.aaronfae.junit4;

import static org.junit.Assert.*;

import org.junit.Test;

public class ErrorAndFailureTest {
	
	/*
	 * failureһ���ɵ�Ԫ����ʹ�õĶ��Է����ж�ʧ�ܶ�����ģ�����ʾ�ڲ��Ե㷢�������⣬
	 * Ҳ����˵��������Ľ��������Ԥ�ڵĽ����һ����
	 * 
	 * error���ɴ����쳣����ģ������Բ����ڱ����Դ��뱾��Ĵ���Ҳ�����Ǳ����Դ����е�һ������bug��
	 * 
	 * ����Ҫһ�㣺����������������֤�����߼�����ȷ�ģ���������֤����Ķ���û�д�
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
