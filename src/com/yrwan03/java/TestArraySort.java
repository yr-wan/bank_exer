package com.yrwan03.java;

import java.util.Arrays;

public class TestArraySort {
	public static void main(String[] args) {
		System.out.println("����ǰ������Ϊ��");
		int[] arr = new int[] { 10, 5, 68, 124, 10, -3, 46, 31, 7, -25 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();

/*		// ð�����򷨣���ֱ��ѡ�񷨶�ѡһ��
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("ð����������������Ϊ��");

		// ֱ��ѡ�񷨣���ð�����򷨶�ѡһ��
		for (int i = 0; i < arr.length - 1; i++) {
			int t = i;// Ĭ��i��ֵ��С
			for (int j = i; j < arr.length; j++) {
				if (arr[t] > arr[j]) {// ��i���ֱ����С��Ԫ�أ��������±����i
					t = j;
				}
			}
			if (t != i) {
				int temp = arr[t];
				arr[t] = arr[i];
				arr[i] = temp;
			}
		}
		System.out.println("ֱ��ѡ������������Ϊ��");*/

		// ����Arrays������
		Arrays.sort(arr);
		System.out.println("java�Դ���������������Ϊ��");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
