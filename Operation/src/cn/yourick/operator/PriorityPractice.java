package cn.yourick.operator;

public class PriorityPractice {
	public static void main(String[] args){
		int a = 20 ;
		a = a++ + 1 ;
		System.out.println("我们一定要注意运算符的优先级及其在计算机内存中的运算"+a);
		a = ++a + 1 ;
		System.out.println("我们一定要注意运算符的优先级及其在计算机内存中的运算"+a);
//		System.out.println( true || false && true);
	}
}
