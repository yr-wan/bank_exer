package com.yrwan08.java.duotai;

public class TestMethod {
	public static void main(String[] args) {
		Sub s = new Sub();
		System.out.println(s.count);
		s.display();
		Base b = s;// Base b= new Sub();
		System.out.println(b == s);
		System.out.println(b.count);
		b.display();
	}
}

class Base {
	int count = 10;

	public void display() {
		System.out.println(this.count);
	}
}

class Sub extends Base {
	int count = 20;

	public void display() {
		System.out.println(this.count);
	}
}
