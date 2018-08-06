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
		System.out.println("女人走路");
	}

	public void eat() {
		System.out.println("女人吃饭");
	}

	public void shop() {
		System.out.println("女人购物");
	}

}
