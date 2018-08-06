package com.yrwan08.exer.jicheng;

/*
 *�����ȡ����<�˻�����
 *��ֱ��ȡ��
 *�����ȡ����>�˻�����
 *������Ҫ͸֧�Ķ��
 *�жϿ�͸֧��overdraft�Ƿ��㹻֧������͸֧��Ҫ���������
 *	���˻�����޸�Ϊ0�������͸֧���
 *���������
 *	��ʾ�û�������͸֧����޶�
 * 
 */
public class CheckAccount extends Account {
	private double overdraft;

	public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("����˻����Ϊ��" + balance);
			System.out.println("��Ŀ�͸֧��Ϊ��" + overdraft);
		} else {
			if ((amount - balance) <= overdraft) {
				overdraft -= (amount - balance);
				balance = 0;
				System.out.println("����˻����Ϊ��" + balance);
				System.out.println("��Ŀ�͸֧��Ϊ��" + overdraft);
			} else {
				System.out.println("������͸֧����޶");
				System.out.println("����˻����Ϊ��" + balance);
				System.out.println("��Ŀ�͸֧��Ϊ��" + overdraft);
			}
		}
	}
}
