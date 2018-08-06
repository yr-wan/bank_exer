package com.yrwan06.java;

//�ɱ�������βεķ���
public class TestVarargs {
	public static void main(String[] args) {
		TestVarargs t = new TestVarargs();

		t.sayHello();
		t.sayHello("World");
		t.sayHello(5, "6", "7", "8");
		t.sayHello(5, "6", "7", "8", "9");
		System.out.println(t.getSum(6, 4, 7, 12));

	}

	public void sayHello() {
		System.out.println("Hello");
	}

	public void sayHello(String str) {
		System.out.println("Hello" + str);
	}

	// �ɱ�������βεķ���
	public void sayHello(int m, String... args) {
		for (String i : args) {
			System.out.print(i);
		}
		System.out.println();
	}

	public int getSum(int... num) {
		int sum = 0;
		for (int i : num) {
			sum += i;
		}
		return sum;
	}

}
