package com.yrwan08.java.duotai;

public class Woman extends Person {
	private Boolean isBeauty;

	public Woman() {
		super();
	}

	public Woman(String name, int age, boolean isBeauty) {
		super(name, age);
		this.isBeauty = isBeauty;
	}

	public boolean isBeauty() {
		return isBeauty;
	}

	public void setIsBeauty(Boolean isBeauty) {
		this.isBeauty = isBeauty;
	}

	public void walk() {
		System.out.println("Ů����·");
	}

	public void eat() {
		System.out.println("Ů�˳Է�");
	}

	public void shop() {
		System.out.println("Ů�˹���");
	}

}
