package com.yrwan10.java;

/*
 * ������ִ��˳��
 */
public class TestLeaf {
	public static void main(String[] args) {
		new Leaf();
		System.out.println();
		new Leaf();
	}
}

class Root {
	static {
		System.out.println("Root�ľ�̬��ʼ����");
	}
	{
		System.out.println("Root����ͨ��ʼ����");
	}

	public Root() {
		System.out.println("Root���޲����Ĺ�����");
	}
}

class Mid extends Root {
	static {
		System.out.println("Mid�ľ�̬��ʼ����");
	}
	{
		System.out.println("Mid����ͨ��ʼ����");
	}

	public Mid() {
		System.out.println("Mid���޲����Ĺ�����");
	}

	public Mid(String msg) {
		// ͨ��this����ͬһ�������صĹ�����
		this();
		System.out.println("Mid�Ĵ������������������ֵ��" + msg);
	}
}

class Leaf extends Mid {
	static {
		System.out.println("Leaf�ľ�̬��ʼ����");
	}
	{
		System.out.println("Leaf����ͨ��ʼ����");
	}

	public Leaf() {
		// ͨ��super���ø�������һ���ַ��������Ĺ�����
		super("���ǲ���");
		System.out.println("ִ��Leaf�Ĺ�����");
	}
}

// r��m��l�� r��r�� m��m��m�� l��l��