package com.yrwan05.java;

//��Ĵ���
public class TestClass {
	public static void main(String[] args) {
		// ���ʵ����
		Person Tom = new Person("Tom", 24, true);
		Tom.eat();
		Tom.info();
	}
}

class Person {
	// ����
	private String name;
	private int age;
	private boolean sex;

	// ������
	public Person(String name, int age, boolean sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	// ����
	public void eat() {
		System.out.println("eat");
	}

	public void sleep() {
		System.out.println("sleep");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public void info() {
		System.out.println(name + " " + age + " " + sex);
	}
}
