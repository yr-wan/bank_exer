package com.yrwan11.java;

//�����ӿ�
interface Anonymous {
	public double getPrice();

	public String getName();
}

public class AnonymousTest {
	public void test(Anonymous p) {
		System.out.println("������һ��" + p.getName() + "��������" + p.getPrice());
	}

	public static void main(String[] args) {
		AnonymousTest ta = new AnonymousTest();
		// ����test����ʱ����Ҫ����һ��Product������
		// �˴�����������ʵ�����ʵ��
		ta.test(new Anonymous() {
			public double getPrice() {
				return 5678;
			}

			public String getName() {
				return "�Կ�";
			}
		});
	}
}
