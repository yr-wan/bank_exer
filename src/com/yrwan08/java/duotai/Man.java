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
		System.out.println("男人走路");
	}

	public void eat() {
		System.out.println("男人吃饭");
	}

	public void smoke() {
		System.out.println("男人抽烟");
	}
}
