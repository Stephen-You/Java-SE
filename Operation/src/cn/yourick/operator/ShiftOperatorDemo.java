package cn.yourick.operator;

public class ShiftOperatorDemo {
	public static void main(String[] args){
		int A = 23 , B = 46 ;	//46�Ķ�����:00000000 00000000 00000000 00101110
		A = A ^ B ;				//23�Ķ�����:00000000 00000000 00000000 00010111
		B = A ^ B ;				//A^B		 00000000 00000000 00000000 00111001
		A = A ^ B ;
		System.out.println("A="+A+","+"B="+B);
		System.out.println("��Ч�ʵķ�ʽ���2����8�ķ���Ϊ2<<3:"+(2<<3));
		System.out.println(2<<-13);
	}
}
