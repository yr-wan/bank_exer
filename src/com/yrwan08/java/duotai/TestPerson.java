package com.yrwan08.java.duotai;

public class TestPerson {
	public static void main(String[] args) {
		// �������Ķ�̬�ԣ����������ָ���������
		Person p1 = new Man();// ����ת��
		// ���ⷽ������
		p1.walk();
		p1.eat();
		p1.sleep();

		Person p2 = new Woman();
		Woman w = (Woman) p2;// ����ת��
		w.shop();

		Object[] a = new Object[3];
		a[0] = 5;
		a[1] = "s";
		a[2] = 'c';
		for (Object i : a) {
			System.out.println(i);
		}

	}
}
