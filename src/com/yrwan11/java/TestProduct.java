package com.yrwan11.java;

public class TestProduct {

	public static void main(String[] args) {
		TestProduct tp = new TestProduct();
		Product p = tp.getProduct();

		System.out.println(p.getName());
		System.out.println(p.getPrice());
		// ----------------------
		tp.showProduct(p);
		// ------------------------
		tp.showProduct(new Product() {// ������һ��������Ķ���
			public int getPrice() {
				return 5000;
			}

			public String getName() {
				return "�ֻ�";
			}

		});
	}

	public Product getProduct() {
		return new Product() {// ������һ�������ڲ���Ķ���
			public int getPrice() {
				return 7000;
			}

			public String getName() {
				return "����";
			}

		};
	}

	public void showProduct(Product p) {
		System.out.println(p.getName());
		System.out.println(p.getPrice());
	}
}

interface Product {
	int getPrice();

	String getName();
}