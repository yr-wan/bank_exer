package com.yrwan08.java.jicheng;

/*
 * ��Ա����int sex��int salary��
 * ����void manOrWorman()������sex��ֵ��ʾ��man��(sex==1)���ߡ�women��(sex==0)��
 * ����void employeed()������salary��ֵ��ʾ��no job��(salary==0)���ߡ� job��(salary!=0)��
 */
public class ManKind {
	private int sex;
	private int salary;

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void manOrWoman() {
		if (sex == 1) {
			System.out.println("man");
		} else if (sex == 0) {
			System.out.println("woman");
		}
	}

	public void employeed() {
		if (salary == 0) {
			System.out.println("no job");
		} else if (salary > 0) {
			System.out.println("job");
		}
	}

}
