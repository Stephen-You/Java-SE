package cn.yourick.operation;
/**
 * 
 * @author YorickYou
 * @Date   2019年3月7日
 * GitHub  https://github.com/YorickYou/Java-SE.git
 * core    Math类包含执行基本数字运算的方法，如基本指数，对数，平方根和三角函数。
 */

import org.junit.Test;

public class MathDemo {
	double x = 4 , y = 10.0;
	
	//Math类提供了根据一个double数值计算平方根的方法,返回值也是double类型
	//static double sqrt(double a) 返回的正确舍入正平方根 double值。
	@Test
	public void sqrt() {
		System.out.println(Math.sqrt(x));//2.0
		System.out.println(Math.sqrt(y));//3.1622776601683795
	}
	
	/*Math类也提供了一个幂运算的方法
	 * static double pow(double a, double b) 将第一个参数的值返回到第二个参数的幂。  
	 */
	@Test
	public void pow() {
		System.out.println(Math.pow(y, x));//10000.0
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
		//如果参数为NaN,那么转换后结果为0
		d = Double.NaN;
		ld = Math.round(d);
		System.out.println(ld);
		//如果参数为负无穷小或者是大小于等于Long.MIN_VALUE的值,那么转换后结果为Long.MIN_VALUE
		d = Double.NEGATIVE_INFINITY;
		ld = Math.round(d);
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
	/**Math提供了用来求绝对值的方法
	 * static double abs(double a) 
返回值为 double绝对值。  
static float abs(float a) 
返回 float值的绝对值。  
static int abs(int a) 
返回值为 int绝对值。  
static long abs(long a) 
返回值为 long绝对值。  
	 */
	@Test
	public void abs() {
		int i = -9;
		System.out.println(Math.abs(i));
	}
}
