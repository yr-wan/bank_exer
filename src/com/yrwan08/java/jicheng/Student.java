package com.yrwan08.java.jicheng;

/*
 * number:long
 * int:math
 * int:english
 * int:computer
 * +Student(n:String s:char a:int k:long m:int e:int c:int)
 * +aver():double
 * +max():int
 * +min():int
 * +toString():String
 */
public class Student extends Person {
	long number;
	int math;
	int english;
	int computer;

	public static void main(String[] args) {
		Student s = new Student("Tom", '1', 14, 210013L, 94, 98, 100);
		s.eat();
		// super.eat();

	}

	public Student(String n, char s, int a, long k, int m, int e, int c) {

		super(n, s, a);
		this.number = k;
		this.math = m;
		this.english = e;
		this.computer = c;
	}

	public double aver() {
		int sum = this.math + this.english + this.computer;
		return sum / 3;
	}

	public int max() {
		int max = (((this.math > this.english) ? this.math : this.english) > this.computer)
				? ((this.math > this.english) ? this.math : this.english) : this.computer;
		return max;
	}

	public int min() {
		int min = (((this.math < this.english) ? this.math : this.english) < this.computer)
				? ((this.math < this.english) ? this.math : this.english) : this.computer;
		return min;
	}

	public void eat() {
		System.out.println("Ñ§Éú³Ô·¹");
	}
}
