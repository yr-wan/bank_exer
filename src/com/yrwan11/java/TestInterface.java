package com.yrwan11.java;

//接口与类的多态测试
public class TestInterface {
	public static void main(String[] args) {
		Duck d = new Duck();
		TestInterface.test(d);// 虚拟方法调用
	}

	// 接口与类的多态 Runner r = new Duck();
	public static void test(Runner r) {
		r.run();
	}
}

interface Runner {
	void run();
}

interface Swimmer {
	void swim();
}

interface Flier {
	void fly();
}

class Duck implements Runner, Swimmer, Flier {
	public void run() {
		System.out.println("鸭子跑");
	}

	public void swim() {
		System.out.println("鸭子游泳");
	}

	public void fly() {
		System.out.println("鸭子飞");
	}
}