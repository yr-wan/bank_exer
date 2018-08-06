package com.yrwan11.java;

//代理模式（静态代理）
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
		System.out.println("代理类创建");
		obj = new ObjectImpl();
	}

	public void action() {
		System.out.println("代理类的方法");
		obj.action();
	}
}

class ObjectImpl implements Object {
	public void action() {
		System.out.println("被代理类的方法");
	}
}