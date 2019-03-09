package cn.yorick.forStatement;

import java.util.Scanner;

public class Retirement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("你需要多续航时间才能存够退休金呢:");
		double goal = sc.nextDouble();
		System.out.println("你每年打算存多少钱:");
		double payment = sc.nextDouble();
		System.out.println("每年存储增长率:");
		double interestRate = sc.nextDouble();
		double balance = 0;	//账户余额
		int years = 0;	//需要年限
		while (balance < goal) {
			balance += payment;
			double interest = balance * interestRate/100;
			balance += interest;
			years++;
		}
		System.out.println("您能在" + years + "年后存够钱退休!");
	}

}
