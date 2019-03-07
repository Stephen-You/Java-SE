package cn.yorick.typechange;

import org.junit.Test;

/**
 * 
 * @author YorickYou
 * @Date   2019年3月7日
 * GitHub  https://github.com/YorickYou/Java-SE.git
 * core    类型转换--强制类型转换
 */
public class ExplicitConvertPractice {
	public static void main(String[] args) {
		byte a = 127 ;
		short b = 516 ;
		byte ab = (byte)b ;
		byte abc = (byte)(b - a - a - a - a) ;
		System.out.println("当数据范围过大时会发生数据损失: "+ ab ) ;	//显示转换数据丢失
		System.out.println("当数据范围合适时显示转换: "+ abc ) ;
		int x = 50 ;
		double d = 92247.8698 ;
		int bx = (int)(d - x) ;
		System.out.println("当double型和int型在一起强制转换时结果为为:" + bx ) ;
	}
	/*Math类提供了四舍五入的方法
	 * static long round(double a)  返回参数中最接近的 long ，其中 long四舍五入为正无穷大。  
	static int round(float a) 返回参数中最接近的 int ，其中 int四舍五入为正无穷大。  
	 * */
	@Test
	public void round() {
		//如果参数为正无穷大或者是大于等于Long.MAX_VALUE的值,那么转换后结果为Long.MAX_VALUE
		double d = Double.MAX_VALUE;
		float f = Float.MAX_VALUE;
		long ld= Math.round(d);
		int i = Math.round(f);
		System.out.println(Long.MAX_VALUE + ":" + ld + "," + i);
		ld = (long) d;
		i = (int) f;
		System.out.println(Long.MAX_VALUE + ":" + ld + "," + i);
		//如果参数为NaN,那么转换后结果为0
		d = Double.NaN;
		ld = Math.round(d);
		System.out.println(ld);
		ld = (long) d;
		System.out.println(ld);
		//如果参数为负无穷小或者是大小于等于Long.MIN_VALUE的值,那么转换后结果为Long.MIN_VALUE
		d = Double.NEGATIVE_INFINITY;
		ld = Math.round(d);
		System.out.println(ld);
		ld = (long) d;
		System.out.println(ld);
		double d1 = -3.45, d2 = -3.65;
		int i1 = (int) d1;
		int i2 = (int) d2;
		System.out.println(i1 + ":" + i2);
		i1 = (int) Math.round(d1);
		i2 = (int) Math.round(d2);
		System.out.println(i1 + ":" + i2);
		d1 = 3.45;
		d2 = 3.65;
		i1 = (int) d1;
		i2 = (int) d2;
		System.out.println(i1 + ":" + i2);
		i1 = (int) Math.round(d1);
		i2 = (int) Math.round(d2);
		System.out.println(i1 + ":" + i2);
	}
	@Test
	public void booleanToNum() {
		boolean boo = false;
		System.out.println(boo?1:0);
	}
}
