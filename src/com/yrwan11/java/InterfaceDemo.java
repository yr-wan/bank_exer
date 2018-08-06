package com.yrwan11.java;

public class InterfaceDemo {
	public static void main(String args[]) {
		Computer.show(new Flash());
		Computer.show(new Print());
		Computer.show(new USB() {
			public void start() {
				System.out.println("�ƶ�Ӳ�̿�ʼ������");
			}

			public void stop() {
				System.out.println("�ƶ�Ӳ��ֹͣ������");
			}
		});
	}
}

interface USB { //
	public void start();

	public void stop();
}

class Flash implements USB {
	public void start() {
		System.out.println("U�̿�ʼ������");
	}

	public void stop() {
		System.out.println("U��ֹͣ������");
	}
}

class Print implements USB {
	public void start() {
		System.out.println("��ӡ����ʼ������");
	}

	public void stop() {
		System.out.println("��ӡ��ֹͣ������");
	}
}

class Computer {
	public static void show(USB usb) {
		usb.start();
		System.out.println("=========== USB �豸���� ========");
		usb.stop();
	}
}
