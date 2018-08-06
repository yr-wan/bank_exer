package com.yrwan10.java;

//单利设计模式 - 饿汉式
public class TestSingleton1 {
	public static void main(String[] args) {

	}
}

class Singleton1 {
	private Singleton1() {
	}

	private static Singleton1 s = new Singleton1();

	public static Singleton1 getInstance() {
		return s;
	}
}