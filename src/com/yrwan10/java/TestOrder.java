package com.yrwan10.java;

//�����Ĳ���
public class TestOrder {
	public static void main(String[] args) {
		// �����ִ�����ڹ�����
		Order o1 = new Order(0, "����");
		System.out.println(o1);
		System.out.println("-------------------------");
		Order o2 = new Order(0, "����");
		System.out.println(o2);

	}
}

class Order {
	private int id;
	private String name;
	static int i;

	{// ��static�����1
		System.out.println("���Ƿ�static�����1");
		id = 1;// �����Ը�ֵ
		name = "��һ";
		i = 11;
		System.out.println("id:" + id + " name:" + name + " i:" + i);// ������
		getI();// static����
		getId();// ��static����
		System.out.println();
	}
	{// ��static�����2
		System.out.println("���Ƿ�static�����2");
		id = 2;// �����Ը�ֵ
		name = "�ڶ�";
		i = 22;
		System.out.println("id:" + id + " name:" + name + " i:" + i);// ������
		getI();// static����
		getId();// ��static����
		System.out.println();
	}

	static {// static�����1
		System.out.println("����static�����1");
		// id = 1;// ���ܶ����Ը�ֵ
		// name = "��һ";
		i = 111;
		System.out.println("i:" + i);// ������
		getI();// static����
		// getId();// ���ܷ�static����
		System.out.println();
	}
	static {// static�����2
		System.out.println("����static�����2");
		// id = 2;// �����Ը�ֵ
		// name = "�ڶ�";
		i = 222;
		System.out.println("i:" + i);// ������
		getI();// static����
		// getId();// ���ܷ�static����
		System.out.println();
	}

	public Order() {
		super();
		System.out.println("���ǿղι�����");
	}

	public Order(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("���Ǵ��ι�����");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getI() {
		return i;
	}

	public static void setI(int i) {
		Order.i = i;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + "]";
	}

}