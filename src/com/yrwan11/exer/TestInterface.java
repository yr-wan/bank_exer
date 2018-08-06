package com.yrwan11.exer;

/*
 * ����һ���ӿ�����ʵ����������ıȽϡ�
 * interface CompareObject{
 * 	//������ֵ�� 0 , �������; ��Ϊ����������ǰ����󣻸�������ǰ����С
 * 	public int compareTo(Object o);   
 * }
 * ����һ��Circle�ࡣ
 * ����һ��ComparableCircle�࣬�̳�Circle�ಢ��ʵ��CompareObject�ӿڡ�
 * ��ComparableCircle���и����ӿ��з���compareTo��ʵ���壬�����Ƚ�����Բ�İ뾶��С��
 * ����һ��������TestInterface����������ComparableCircle���󣬵���compareTo�����Ƚ�������İ뾶��С��
 * ˼�������������������������Rectangle��ComparableRectangle�࣬��ComparableRectangle���и���compareTo������ʵ�֣��Ƚ��������ε������С��
 * 
 */
public class TestInterface {
	public static void main(String[] args) {
		ComparablaCircle c1 = new ComparablaCircle(1.5);
		ComparablaCircle c2 = new ComparablaCircle(1.5);
		System.out.println(c1.compareTo(c2));
	}
}

interface CompareObject {
	int compareTo(Object o);
}

class Circle {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}

class ComparablaCircle extends Circle implements CompareObject {
	public ComparablaCircle(double radius) {
		super(radius);
	}

	// ������ֵ�� 0 , �������; ��Ϊ����������ǰ����󣻸�������ǰ����С
	public int compareTo(Object o) {
		if (o == this) {
			return 0;
		} else if (o instanceof ComparablaCircle) {
			ComparablaCircle c = (ComparablaCircle) o;
			if (this.getRadius() > c.getRadius()) {
				return 1;
			} else if (this.getRadius() < c.getRadius()) {
				return -1;
			} else {
				return 0;
			}
		} else {
			throw new RuntimeException("�����������");
		}
	};
}