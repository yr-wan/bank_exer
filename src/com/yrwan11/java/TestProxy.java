package com.yrwan11.java;

//����ģʽ����̬����
public class TestProxy {
	public static void main(String[] args) {
		Object obj = new ProxyObject();
		obj.action();
	}
}

interface Object {
	void action();
}

class ProxyObject implements Object {
	Object obj;

	public ProxyObject() {
		System.out.println("�����ഴ��");
		obj = new ObjectImpl();
	}

	public void action() {
		System.out.println("������ķ���");
		obj.action();
	}
}

class ObjectImpl implements Object {
	public void action() {
		System.out.println("��������ķ���");
	}
}