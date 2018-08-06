package com.yrwan09.exer;

/*
 * 编写Order类，有int型的orderId，String型的OrderName，
 * 相应的getter()和setter()方法，两个参数的构造器，
 * 重写父类的equals()方法：public boolean equals(Object obj)，
 * 并判断测试类中创建的两个对象是否相等。
 */
public class TestOrder {
	public static void main(String[] args) {
		Order o1 = new Order(1001, "AA");
		Order o2 = new Order(1001, "AA");
		System.out.println(o1 == o2);// false
		System.out.println(o1.equals(o2));// 重写equals()前为false,重写equals()后为true
	}
}

class Order {
	private int orderld;
	private String orderName;

	public Order(int orderld, String orderName) {
		super();
		this.orderld = orderld;
		this.orderName = orderName;
	}

	public int getOrderld() {
		return orderld;
	}

	public void setOrderld(int orderld) {
		this.orderld = orderld;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public boolean equals(Object ojb) {
		if (this == ojb) {
			return true;
		} else if (ojb instanceof Order) {
			Order o = (Order) ojb;
			return this.orderld == o.orderld && this.orderName.equals(o.orderName);
		} else {
			return false;
		}
	}
}