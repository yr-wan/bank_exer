package com.yrwan08.java.duotai;

public class TestPerson {
	public static void main(String[] args) {
		// 子类对象的多态性：父类的引用指向子类对象；
		Person p1 = new Man();// 向上转型
		// 虚拟方法调用
		p1.walk();
		p1.eat();
		p1.sleep();

		Person p2 = new Woman();
		Woman w = (Woman) p2;// 向下转型
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
