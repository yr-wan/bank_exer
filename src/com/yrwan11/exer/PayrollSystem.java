package com.yrwan11.exer;

import java.util.Scanner;

/*
 * ʵ����Ŀ��
 * ��д����ϵͳ��ʵ�ֲ�ͬ����Ա��(��̬)�İ��·��Ź��ʡ�
 * ������³���ĳ��Employee��������գ��򽫸ù�Ա�Ĺ�������100Ԫ��
 * 
 * ʵ��Ŀ�ģ����󡢼̳С���װ����̬������������Ӧ�á�
 * 
 * ��ʾ��
 * 	//����People���͵�����
 * 		People c1[]=new People[10];
 * 	//����Ԫ�ظ�ֵ
 * 		c1[0]=new People("John","0001",20);
 * 		c1[1]=new People("Bob","0002",19);
 * 	//��People����������Student��Officer��������Ԫ�ظ�ֵʱ������ʹ�������͵�����Ԫ��ָ�����ࡣ
 * 		c1[0]=new Student("John","0001",20,85.0);
 * 		c1[1]=new Officer("Bob","0002",19,90.5);
 */

// ��1������һ��Employee�࣬���������
// private��Ա����name,number,birthday������birthday ΪMyDate��Ķ���
// abstract����earnings()��
// toString()������������name,number��birthday��
abstract class Employee {
	private String name;
	private int number;
	private MyDate birthday;

	public Employee(String name, int number, MyDate birthday) {
		super();
		this.name = name;
		this.number = number;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public MyDate getBirthday() {
		return birthday;
	}

	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}

	public abstract double earnings();

	public String toString() {
		return "name=" + name + ", number=" + number + ", birthday=" + birthday.toDateString() + ", ";
	}

}

// ��2��MyDate�����:
// private��Ա����month,day,year��
// toDateString()�����������ڶ�Ӧ���ַ�����xxxx��xx��xx��
class MyDate {
	private int year;
	private int month;
	private int day;

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String toDateString() {
		return year + "��" + month + "��" + day + "��";
	}
}

// ��3������SalariedEmployee��̳�Employee�࣬ʵ�ְ��¼��㹤�ʵ�Ա���������������
// private��Ա����monthlySalary��
// ʵ�ָ���ĳ��󷽷�earnings(),�÷�������monthlySalaryֵ��
// toString()�������Ա��������Ϣ��Ա����name��number,birthday��
class SalariedEmployee extends Employee {
	private double monthlySalary;

	public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
		super(name, number, birthday);
		this.monthlySalary = monthlySalary;
	}

	public double earnings() {
		return monthlySalary;
	}

	public String toString() {
		return "SalariedEmployee ["+ super.toString() +"monthlySalary=" + monthlySalary + "]";
	}
}

//��4������SalariedEmployee�ඨ��HourlyEmployee�࣬ʵ�ְ�Сʱ���㹤�ʵ�Ա���������������
//private��Ա����wage��hour��
//ʵ�ָ���ĳ��󷽷�earnings(),�÷�������wage*hourֵ��
//toString()�������Ա��������Ϣ��Ա����name��number,birthday��
class HourlyEmployee extends Employee {
	private double wage;
	private double hour;

	public HourlyEmployee(String name, int number, MyDate birthday, double wage, int hour) {
		super(name, number, birthday);
		this.wage = wage;
		this.hour = hour;
	}

	public double earnings() {
		return wage * hour;
	}

	public String toString() {
		return "HourlyEmployee ["+ super.toString() +"wage=" + wage + ", hour=" + hour + "]";
	}
}
//��5������PayrollSystem�࣬����Employee�������鲢��ʼ�����������Ÿ����Ա��������á�
//����ѭ���ṹ��������Ԫ�أ�����������������,name,number,birthday,�Լ��ö������ա�
//���������뱾���·�ֵʱ�����������ĳ��Employee��������գ���Ҫ������ӹ�����Ϣ��
public class PayrollSystem{
	public static void main(String[] args) {
		Employee[] emps = new  Employee[2];
		emps[0] = new SalariedEmployee("AA", 1000, new MyDate(1999, 1, 1), 1000);
		emps[1] = new HourlyEmployee("BB", 1001, new MyDate(1998, 2, 2), 500, 3);
		Scanner c = new Scanner(System.in);
		System.out.println("���뱾���·ݣ�");
		int m = c.nextInt();
		c.close();
		for (int i = 0; i < emps.length; i++) {
			if(m == emps[i].getBirthday().getMonth()){
				System.out.println("��100����");
			}
			System.out.println(emps[i]);
		}
	}
}
