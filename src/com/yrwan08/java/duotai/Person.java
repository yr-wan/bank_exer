package com.yrwan08.java.duotai;

public class Person {
	private String name;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	public void walk() {
		System.out.println("����·");
	}

	public void eat() {
		System.out.println("�˳Է�");
	}

	public void sleep() {
		System.out.println("��˯��");
	}
}
