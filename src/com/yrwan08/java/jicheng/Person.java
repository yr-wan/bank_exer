package com.yrwan08.java.jicheng;

/*
 * #name: String
 * #sex:char
 * #age:int
 * +Person(name:String  sex:char  age:int)
 * +toString():String
 */
public class Person {
	protected String name;
	protected char sex;
	protected int age;

	public Person(String name, char sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public String toString() {
		return name;
	}

	public void eat() {
		System.out.println("»À≥‘∑π");
	}

}
