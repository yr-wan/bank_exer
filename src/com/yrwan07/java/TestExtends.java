package com.yrwan07.java;

//¼Ì³Ð Á·Ï°
public class TestExtends {
	public static void main(String[] args) {
		Student s = new Student("Tom", 22);
		System.out.println(s.getAge());
		s.eat();
	}
}

class Person {
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

	public void eat() {
		System.out.println("eat");
	}

	public void walk() {
		System.out.println("walk");
	}
}

class Worker extends Person {
	public Worker() {
		super();
	}

	public Worker(String name, int age) {
		super(name, age);
	}
}

class Student extends Person {
	public Student() {
		super();
	}

	public Student(String name, int age) {
		super(name, age);
	}
}