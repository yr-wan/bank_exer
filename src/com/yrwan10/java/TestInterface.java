package com.yrwan10.java;

/*
 * �ӿ� interface ���ಢ�е�һ�׸���     
 * 1.����+���󷽷�
 * 2.�޹�����
 * 3.ֻ��һ�ֿɱ���ʵ�ֵĹ��ܣ��ؼ���implements��
 *   ����class D extends C implements A, Z
 * 4.ʵ�ֽӿڵ��࣬������дȫ�����󷽷������������Ϊһ��������
 * 5.�����ʵ�ֶ���ӿڡ���java�е���ļ̳��ǵ��̳еģ�
 * 6.�ӿ���ӿ�֮���Ǽ̳й�ϵ�����Զ�̳�
 * 7.�ӿ�������ʵ����֮��Ҳ���ڶ�̬��
 */
public class TestInterface {
	public static void main(String[] args) {

	}
}

interface A {// �ӿ�A
	// ���� ʡ����public static final
	int I = 12;
	boolean FLAG = false;

	// ���󷽷� ʡ����public abstract
	void method1();
	void method2();
}

abstract class B implements A {// ����дȫ�����󷽷����뽫������Ϊ������
	public void method1() {
	}
}

class C implements A {// ������дȫ�����󷽷�
	public void method1() {
	}

	public void method2() {
	}
}

interface Z {// �ӿ�Z
	void method3();
}

class D extends C implements A, Z {// ����D�̳���C����ʵ�ֽӿ�A,Z
	public void method3() {
	}
}