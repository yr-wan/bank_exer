package com.yrwan08.java.duotai;

public class TestAnimal {
	public static void main(String[] args) {
		TestAnimal t = new TestAnimal();
		t.func(new Animal());
		System.out.println();
		t.func(new Dog());
		System.out.println();
		t.func(new Cat());
		System.out.println();
	}

	public void func(Animal a) {
		a.eat();
		a.jump();
		a.getAge();
		if (a instanceof Dog) {
			((Dog) a).wow();
		}
		if (a instanceof Cat) {
			((Cat) a).mew();
		}
	}
}

class Animal {
	protected int age = 1;

	public void getAge() {
		System.out.println(age);
	}

	public void eat() {
		System.out.println("³Ô");
	}

	public void jump() {
		System.out.println("Ìø");
	}
}

class Dog extends Animal {
	int age = 2;

	public void getAge() {
		System.out.println(age);
	}

	public void eat() {
		System.out.println("¹·³Ô");
	}

	public void jump() {
		System.out.println("¹·Ìø");
	}

	public void wow() {
		System.out.println("Íô");
	}
}

class Cat extends Animal {
	int age = 3;

	public void getAge() {
		System.out.println(age);
	}

	public void eat() {
		System.out.println("Ã¨³Ô");
	}

	public void jump() {
		System.out.println("Ã¨Ìø");
	}

	public void mew() {
		System.out.println("ß÷");
	}
}