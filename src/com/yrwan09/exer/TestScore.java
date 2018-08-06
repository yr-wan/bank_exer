package com.yrwan09.exer;

import java.util.Scanner;
import java.util.Vector;

/*
 * ����Vector�������鴦���Ӽ��̶���ѧ���ɼ����Ը�������������������ҳ���߷֣������ѧ���ɼ��ȼ���
 * ��ʾ������һ�����������Ⱦ͹̶����䣬�����ڴ�������ǰ����Ҫ֪�����ĳ��ȡ�
 * ��������java.util.Vector���Ը�����Ҫ��̬������
 * ����Vector����Vector v=new Vector();
 * ���������Ԫ�أ�v.addElement(obj);//obj�����Ƕ���
 * ȡ�������е�Ԫ�أ�Object  obj=v.elementAt(0);
 * ע���һ��Ԫ�ص��±���0������ֵ��Object���͵ġ�
 * ���������ĳ��ȣ�v.size();
 * ������߷����  10���ڣ�A�ȣ�20���ڣ�B�ȣ�
 *           30���ڣ�C�ȣ�������D��
 */
public class TestScore {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("����ɼ������Ը������������");
		Vector v = new Vector();
		int max = 0;
		for (;;) {
			int score = s.nextInt();
			if (score < 0) {
				break;
			}
			if (score >= max) {
				max = score;
			}
			v.addElement(score);// �Զ�װ��
		}
		// System.out.println("��߷�Ϊ��" + max);
		for (int i = 0; i < v.size(); i++) {
			Integer score = (Integer) v.elementAt(i);
			char level;
			if (max - score <= 10) {
				level = 'A';
			} else if (max - score <= 20) {
				level = 'B';
			} else if (max - score <= 30) {
				level = 'C';
			} else {
				level = 'D';
			}
			System.out.println("�ɼ�Ϊ:" + score + "���ȼ�Ϊ:" + level);
		}
	}
}
