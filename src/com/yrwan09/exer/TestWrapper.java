package com.yrwan09.exer;

/*
 * ��װ����ϰ
 * ������������ ��װ�� String��֮���ת��
 */
import org.junit.Test;

public class TestWrapper {
	// �����������͡���װ�� �� String�� ��ת��
	@Test
	public void test2() {
		int i1 = 10;
		Boolean b = new Boolean("true1");
		// ������������ to String��
		String str1 = "" + i1;
		String str2 = String.valueOf(i1);
		String str3 = String.valueOf(b);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		// String�� to ������������
		int i2 = Integer.parseInt(str2);
		System.out.println(i2);
	}

	// ���������������װ���ת��
	@Test
	public void test1() {
		int i = 10;
		Integer i1 = new Integer(i);
		System.out.println(i1.intValue());
		int i2 = i1.intValue();
		Integer i3 = 66;// �Զ�װ��
		int i4 = i3;// �Զ�����

		Float f = new Float(1.5F);
		Float f1 = new Float("1.5F");

		boolean b = false;
		Boolean b1 = new Boolean("true");// true��ֻ���β���trueʱ�ŷ���true
		Boolean b2 = new Boolean("true1");// false �����쳣
		Boolean b3 = new Boolean("123");// false
	}

}
