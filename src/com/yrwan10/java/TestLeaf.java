package com.yrwan10.java;

/*
 * 代码块的执行顺序
 */
public class TestLeaf {
	public static void main(String[] args) {
		new Leaf();
		System.out.println();
		new Leaf();
	}
}

class Root {
	static {
		System.out.println("Root的静态初始化块");
	}
	{
		System.out.println("Root的普通初始化块");
	}

	public Root() {
		System.out.println("Root的无参数的构造器");
	}
}

class Mid extends Root {
	static {
		System.out.println("Mid的静态初始化块");
	}
	{
		System.out.println("Mid的普通初始化块");
	}

	public Mid() {
		System.out.println("Mid的无参数的构造器");
	}

	public Mid(String msg) {
		// 通过this调用同一类中重载的构造器
		this();
		System.out.println("Mid的带参数构造器，其参数值：" + msg);
	}
}

class Leaf extends Mid {
	static {
		System.out.println("Leaf的静态初始化块");
	}
	{
		System.out.println("Leaf的普通初始化块");
	}

	public Leaf() {
		// 通过super调用父类中有一个字符串参数的构造器
		super("这是参数");
		System.out.println("执行Leaf的构造器");
	}
}

// r静m静l静 r普r无 m普m无m带 l普l构