package com.yrwan08.exer.duotai;

public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		Circle c = new Circle(2.3, "Green", 1.0);
		MyRectangle m = new MyRectangle(2.0, 1.0, "blue", 2.0);
		t.displayGeometricObject(c);
		t.displayGeometricObject(m);
		boolean b = t.equalsArea(c, m);
		System.out.println(b);
	}

	public boolean equalsArea(GeometricObject g, GeometricObject e) {
		return g.findArea() == e.findArea();
	}

	public void displayGeometricObject(GeometricObject g) {
		System.out.println(g.findArea());
	}
}

class GeometricObject {
	protected String color;
	protected double weight;

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

	public double findArea() {
		return 0;
	}
}

class Circle extends GeometricObject {
	private double radius;

	public Circle(double radius, String color, double weight) {
		super(color, weight);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double findArea() {
		return Math.PI * this.radius * this.radius;
	}
}

class MyRectangle extends GeometricObject {
	private double width;
	private double height;

	public MyRectangle(double width, double height, String color, double weight) {
		super(color, weight);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double findArea() {
		return this.width * this.height;
	}

}