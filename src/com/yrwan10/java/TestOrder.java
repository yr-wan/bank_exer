package com.yrwan10.java;

//代码块的测试
public class TestOrder {
	public static void main(String[] args) {
		// 代码块执行早于构造器
		Order o1 = new Order(0, "第零");
		System.out.println(o1);
		System.out.println("-------------------------");
		Order o2 = new Order(0, "第零");
		System.out.println(o2);

	}
}

class Order {
	private int id;
	private String name;
	static int i;

	{// 非static代码块1
		System.out.println("这是非static代码块1");
		id = 1;// 对属性赋值
		name = "第一";
		i = 11;
		System.out.println("id:" + id + " name:" + name + " i:" + i);// 输出语句
		getI();// static方法
		getId();// 非static方法
		System.out.println();
	}
	{// 非static代码块2
		System.out.println("这是非static代码块2");
		id = 2;// 对属性赋值
		name = "第二";
		i = 22;
		System.out.println("id:" + id + " name:" + name + " i:" + i);// 输出语句
		getI();// static方法
		getId();// 非static方法
		System.out.println();
	}

	static {// static代码块1
		System.out.println("这是static代码块1");
		// id = 1;// 不能对属性赋值
		// name = "第一";
		i = 111;
		System.out.println("i:" + i);// 输出语句
		getI();// static方法
		// getId();// 不能非static方法
		System.out.println();
	}
	static {// static代码块2
		System.out.println("这是static代码块2");
		// id = 2;// 对属性赋值
		// name = "第二";
		i = 222;
		System.out.println("i:" + i);// 输出语句
		getI();// static方法
		// getId();// 不能非static方法
		System.out.println();
	}

	public Order() {
		super();
		System.out.println("这是空参构造器");
	}

	public Order(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("这是带参构造器");
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