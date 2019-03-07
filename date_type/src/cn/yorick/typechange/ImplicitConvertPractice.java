package cn.yorick.typechange;

public class ImplicitConvertPractice {
	public static void main(String[] args){
		byte a = 127 ;
		short b = 37 ;
		char ch = 'a' ;
		System.out.println(ch) ;
		int xy = a + b + ch ;
		System.out.println("当byte short和char一起运算时,他们会先转换为int型在进行计算,因为整数类型默认为int型: " + xy) ;
		int x = 50 ;
		long c = 922068547 ;
		float y = x ;
		double d = 92233747.9798698 ;
		System.out.println("当byte型和short型在一起运算时其运算结果为:" + (a+b) ) ;
		System.out.println("当byte、short型和int型在一起运算时其运算结果为:" + (a+b+x)) ;
		System.out.println("当byte、short、int型和long型在一起运算时其运算结果为:" + (a+b+c+x)) ;
		System.out.println("当byte、short、int、long型和float型在一起运算时其运算结果为:" + (a+b+x+c+y)) ;
		System.out.println("当byte、short、int、long、float型和double型在一起运算时其运算结果为:" + (a+b+c+x+y+d)) ;
	}
}
