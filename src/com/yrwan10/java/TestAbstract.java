package com.yrwan10.java;

/*
 * �����ࡢ���󷽷���ϰ
 */
public class TestAbstract {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.eat();
		s1.sleep();
		Person s2 = new Student();
		s2.eat();
	}
}

abstract class Person {// ���󷽷����ڵ��࣬һ���ǳ�����
	private int id;
	private String name;

	public Person() {// �������й�����
		id = 1;
		name = "A";
	}

	public abstract void eat();

	public abstract void walk();

	public void sleep() {// �������п���û�г��󷽷�
		System.out.println("��˯��");
	}
}

class Student extends Person {
	public void eat() {
		System.out.println("ѧ����");
	}

	public void walk() {
		System.out.println("ѧ����");
	}
}