package com.yrwan10.java;

/*
 * 接口 interface 与类并行的一套概念     
 * 1.常量+抽象方法
 * 2.无构造器
 * 3.只是一种可被类实现的功能，关键词implements，
 *   例：class D extends C implements A, Z
 * 4.实现接口的类，必须重写全部抽象方法，否则此类仍为一个抽象类
 * 5.类可以实现多个接口。（java中的类的继承是单继承的）
 * 6.接口与接口之间是继承关系，可以多继承
 * 7.接口与具体的实现类之间也存在多态性
 */
public class TestInterface {
	public static void main(String[] args) {

	}
}

interface A {// 接口A
	// 常量 省略了public static final
	int I = 12;
	boolean FLAG = false;

	// 抽象方法 省略了public abstract
	void method1();
	void method2();
}

abstract class B implements A {// 不重写全部抽象方法必须将类声明为抽象类
	public void method1() {
	}
}

class C implements A {// 必须重写全部抽象方法
	public void method1() {
	}

	public void method2() {
	}
}

interface Z {// 接口Z
	void method3();
}

class D extends C implements A, Z {// 子类D继承类C，并实现接口A,Z
	public void method3() {
	}
}