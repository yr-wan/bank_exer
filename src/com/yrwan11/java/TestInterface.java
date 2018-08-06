package com.yrwan11.java;

//�ӿ�����Ķ�̬����
public class TestInterface {
	public static void main(String[] args) {
		Duck d = new Duck();
		TestInterface.test(d);// ���ⷽ������
	}

	// �ӿ�����Ķ�̬ Runner r = new Duck();
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
		System.out.println("Ѽ����");
	}

	public void swim() {
		System.out.println("Ѽ����Ӿ");
	}

	public void fly() {
		System.out.println("Ѽ�ӷ�");
	}
}