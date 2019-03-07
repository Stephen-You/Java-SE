package cn.yourick.operator;

public class ShiftOperatorPractice {
	public static void main(String[] args){
		System.out.println("46&97的结果为:"+(46&97));	//46的二进制表示00000000 00000000 00000000 00101110
		System.out.println("46|97的结果为:"+(46|97));	//97的二进制表示00000000 00000000 00000000 01100001
		System.out.println("46按位取反的结果为:"+~46);
		System.out.println("46^97的结果为:"+(46^97));
		System.out.println("46左移5位的结果是:"+(46<<5));
		System.out.println("46右移2位的结果是:"+(46>>2));
		System.out.println("46无符号右移1位的结果是:"+(46>>>1));
	}
}
