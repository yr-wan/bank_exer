package com.yrwan09.exer;

/*
 * ��дOrder�࣬��int�͵�orderId��String�͵�OrderName��
 * ��Ӧ��getter()��setter()���������������Ĺ�������
 * ��д�����equals()������public boolean equals(Object obj)��
 * ���жϲ������д��������������Ƿ���ȡ�
 */
public class TestOrder {
	public static void main(String[] args) {
		Order o1 = new Order(1001, "AA");
		Order o2 = new Order(1001, "AA");
		System.out.println(o1 == o2);// false
		System.out.println(o1.equals(o2));// ��дequals()ǰΪfalse,��дequals()��Ϊtrue
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