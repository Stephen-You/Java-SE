package cn.yorick.forStatement;

import java.util.Scanner;

public class Retirement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����Ҫ������ʱ����ܴ湻���ݽ���:");
		double goal = sc.nextDouble();
		System.out.println("��ÿ���������Ǯ:");
		double payment = sc.nextDouble();
		System.out.println("ÿ��洢������:");
		double interestRate = sc.nextDouble();
		double balance = 0;	//�˻����
		int years = 0;	//��Ҫ����
		while (balance < goal) {
			balance += payment;
			double interest = balance * interestRate/100;
			balance += interest;
			years++;
		}
		System.out.println("������" + years + "���湻Ǯ����!");
	}

}
