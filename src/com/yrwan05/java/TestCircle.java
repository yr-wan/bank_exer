package com.yrwan05.java;

//求圆的面积
public class TestCircle {
	public static void main(String[] args) {
		Circle c = new Circle(2.5);
		c.fingArea();
	}
}

class Circle {
	private double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void fingArea() {
		System.out.println(Math.PI * radius * radius);
	}

}
