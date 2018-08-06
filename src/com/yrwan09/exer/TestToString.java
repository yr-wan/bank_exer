package com.yrwan09.exer;

//练习重写toString() equals()方法
public class TestToString {
	public static void main(String[] args) {
		Circle c1 = new Circle(1.0);
		Circle c2 = new Circle(2.0);
		System.out.println(c1.equals(c2));
		System.out.println(c1.toString());
	}
}

class GeometricObject {
	protected String color;
	protected double weight;

	protected GeometricObject() {
		color = "white";
		weight = 1.0;
	}

	protected GeometricObject(String color, double weight) {
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}

class Circle extends GeometricObject {
	private double radius;

	public Circle() {
		super();
		radius = 1.0;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(double radius, String color, double weight) {
		this.color = color;
		this.weight = weight;
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double findArea() {
		return Math.PI * radius * radius;
	}

	public String toString() {
		return "" + radius;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}

//手写 	
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		} else if (obj instanceof Circle) {
//			Circle c = (Circle) obj;
//			return this.radius == c.radius;
//		} else {
//			return false;
//		}
//	}

}