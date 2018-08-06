package com.yrwan10.exer;

/*
 * ��дһ��Employee�࣬����Ϊ�����࣬���������������ԣ�name��id��salary��
 * �ṩ��Ҫ�Ĺ������ͳ��󷽷���work()������Manager����˵��������Ա����
 * �����н���(bonus)�����ԡ���ʹ�ü̳е�˼�룬���CommonEmployee���Manager�࣬
 * Ҫ�������ṩ��Ҫ�ķ����������Է��ʡ�
 */
public class TestEmployee {
	public static void main(String[] args) {
		Employee m = new Manager("A", 1, 10000, 5000);
		Employee c = new CommonEmployee("B", 2, 8000);
		m.work();
		c.work();
	}
}

abstract class Employee {
	private String name;
	private int id;
	private int salary;

	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public abstract void work();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

class Manager extends Employee {
	private int bonus;

	public Manager(String name, int id, int salary, int bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

	public void work() {
		System.out.println("������");
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}

class CommonEmployee extends Employee {
	public CommonEmployee(String name, int id, int salary) {
		super(name, id, salary);
	}

	public void work() {
		System.out.println("Ա������");
	}
}
