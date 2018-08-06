package com.yrwan08.java.jicheng;

/*
 * 成员变量int yearsOld；
 * 方法printAge()打印yearsOld的值。
 */
public class Kids extends ManKind {
	private int yearsOld;

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	public void printAge() {
		System.out.println(yearsOld);
	}

	public void employeed() {
		System.out.println("Kids should study and no job");
	}

	public static void main(String[] args) {
		Kids someKid = new Kids();

		someKid.setSalary(0);
		someKid.setSex(1);
		someKid.setYearsOld(13);

		someKid.employeed();
		someKid.manOrWoman();
		someKid.printAge();

	}
}
