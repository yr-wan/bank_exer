package com.yrwan06.java;

//方法的参数传递
class Value {
	int i = 15;
}

public class TestArgsTransfer {
	public static void main(String argv[]) {
		TestArgsTransfer t = new TestArgsTransfer();
		t.first();
	}

	public void first() {
		int i = 5;
		Value v = new Value();
		v.i = 25;
		second(v, i);
		System.out.println(v.i);
	}

	public void second(Value v, int i) {
		i = 0;
		v.i = 20;
		Value val = new Value();
		v = val;
		System.out.println(v.i + " " + i);
	}
}
