package com.yrwan10.java;
//final�ؼ�����ϰ
public class TestFinal {
	public static void main(String[] args) {
		Final f = new Final("NAME");
		// f.id = 2;//final���ε�����Ϊ���� ���ɶ��θ���
		f.show();
	}
}

final class Final {// final���ε��಻�ɱ��̳�
	final int ID = 1;// final���ε����Կ���ʽ��ֵ
	final int A, B;
	private String name;

	{
		A = 2;// final���ε����Կɱ�����鸳ֵ
	}

	public Final() {
		super();
		B = 3;// final���ε����Կɱ���������ֵ
	}

	public Final(String name) {
		super();
		B = 3;
		this.name = name;
	}

	public final void show() {// final���εķ������ɱ���д
		System.out.println("ID:" + ID + " name:" + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return ID;
	}
}
// final���ε��಻�ɱ��̳�
// class Final2 extends Final{}