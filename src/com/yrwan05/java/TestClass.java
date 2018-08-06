package com.yrwan05.java;

//类的创建
public class TestClass {
	public static void main(String[] args) {
		// 类的实例化
		Person Tom = new Person("Tom", 24, true);
		Tom.eat();
		Tom.info();
	}
}

class Person {
	// 属性
	private String name;
	private int age;
	private boolean sex;

	// 构造器
	public Person(String name, int age, boolean sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	// 方法
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
