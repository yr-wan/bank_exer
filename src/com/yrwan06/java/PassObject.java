package com.yrwan06.java;

public class PassObject {
	public static void main(String[] args) {
		Circle c = new Circle();
		double t = 5;
		printAreas(c, t);
		System.out.println("当前半径值为: " + c.radius);

	}

	public static void printAreas(Circle c, double time) {
		System.out.println("Radius" + "\t" + "Areas");
		double i = 1;
		for (; i <= time; i++) {
			c.radius = i;
			System.out.println(i + "\t" + c.findArea());
		}
		c.radius = i;
	}
}

class Circle {
	double radius;

	public double findArea() {
		return Math.PI * radius * radius;
	}
}
