package com.yrwan05.java;
//����String���ֲ�ͬ��ֵ����
public class TestString {
	public static void main(String[] args) {
		String str1 = new String("HelloWorld");
		String str2 = "HelloWorld";
		
		System.out.println("str1ͨ��String str1 = new String(\"HelloWorld\");����");
		System.out.println("str2ͨ��String str2 = \"HelloWorld\";����");
		System.out.println();
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println();
		
		System.out.print("str1 == str2�Ľ��: ");
		System.out.println(str1 == str2);
		System.out.println("str1.equals(str2)�Ľ��: " + str1.equals(str2));
		System.out.println();
		
		System.out.println("---------------------------------------");
		
		System.out.println("str3ͨ��String str3 = new String(\"HelloWorld\");����");
		System.out.println("str4ͨ��String str4 = \"HelloWorld\";����");
		System.out.println();
		
		String str3 = new String("HelloWorld");
		String str4 = "HelloWorld";
		
		System.out.println("str3: " + str3);
		System.out.println("str4: " + str4);
		System.out.println();
		
		System.out.print("str1 == str3�Ľ��: ");
		System.out.println(str1 == str3);
		System.out.println("str1.equals(str3)�Ľ��: " + str1.equals(str3));
		System.out.println();
		
		System.out.print("str2 == str4�Ľ��: ");
		System.out.println(str2 == str4);
		System.out.println("str2.equals(str4)�Ľ��: " + str2.equals(str4));
		System.out.println();
	}
}
