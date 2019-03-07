package cn.yourick.operator;

public class ShiftOperatorDemo {
	public static void main(String[] args){
		int A = 23 , B = 46 ;	//46的二进制:00000000 00000000 00000000 00101110
		A = A ^ B ;				//23的二进制:00000000 00000000 00000000 00010111
		B = A ^ B ;				//A^B		 00000000 00000000 00000000 00111001
		A = A ^ B ;
		System.out.println("A="+A+","+"B="+B);
		System.out.println("有效率的方式算出2乘以8的方法为2<<3:"+(2<<3));
		System.out.println(2<<-13);
	}
}
