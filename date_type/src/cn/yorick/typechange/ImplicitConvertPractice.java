package cn.yorick.typechange;

public class ImplicitConvertPractice {
	public static void main(String[] args){
		byte a = 127 ;
		short b = 37 ;
		char ch = 'a' ;
		System.out.println(ch) ;
		int xy = a + b + ch ;
		System.out.println("��byte short��charһ������ʱ,���ǻ���ת��Ϊint���ڽ��м���,��Ϊ��������Ĭ��Ϊint��: " + xy) ;
		int x = 50 ;
		long c = 922068547 ;
		float y = x ;
		double d = 92233747.9798698 ;
		System.out.println("��byte�ͺ�short����һ������ʱ��������Ϊ:" + (a+b) ) ;
		System.out.println("��byte��short�ͺ�int����һ������ʱ��������Ϊ:" + (a+b+x)) ;
		System.out.println("��byte��short��int�ͺ�long����һ������ʱ��������Ϊ:" + (a+b+c+x)) ;
		System.out.println("��byte��short��int��long�ͺ�float����һ������ʱ��������Ϊ:" + (a+b+x+c+y)) ;
		System.out.println("��byte��short��int��long��float�ͺ�double����һ������ʱ��������Ϊ:" + (a+b+c+x+y+d)) ;
	}
}
