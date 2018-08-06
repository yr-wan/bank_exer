package com.yrwan08.java.duotai;

public class Man extends Person {
	private boolean smoking;

	public Man() {
		super();
	}

	public Man(String name, int age, boolean smoking) {
		super(name, age);
		this.smoking = smoking;
	}

	public boolean isSmoking() {
		return smoking;
	}

	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}

	public void walk() {
		System.out.println("������·");
	}

	public void eat() {
		System.out.println("���˳Է�");
	}

	public void smoke() {
		System.out.println("���˳���");
	}
}
