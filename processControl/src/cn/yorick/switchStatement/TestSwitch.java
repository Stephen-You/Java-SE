package cn.yorick.switchStatement;

import java.util.Scanner;

public class TestSwitch {
	final int i = 0;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		final int i = 0;
//		{
//			int i = 0;
//		}
		System.out.println(getReturn(number));
	}

		public static String getReturn(int number){
		String set0 = "Yes";
		String set1 = "No";
		String set2 = "Cancel";
		switch(number){
		case 0 : return set0;
		case 1 : return set1;
		case 2 : return set2;
		default: return "Not Find";
		}
	}
}
