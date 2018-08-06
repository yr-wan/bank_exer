package com.yrwan10.java;

//�������ģʽ - ����ʽ
public class TestSingleton2 {
	public static void main(String[] args) {

	}
}

class Singleton2 {
	private Singleton2() {
	}

	private static Singleton2 s = null;

	private static Singleton2 getInstance() {
		if (s == null) {
			s = new Singleton2();
		}
		return s;
	}

}