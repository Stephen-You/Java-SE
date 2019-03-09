package cn.yourick.operation;
/**
 * 
 * @author YorickYou
 * @Date   2019��3��7��
 * GitHub  https://github.com/YorickYou/Java-SE.git
 * core    Math�����ִ�л�����������ķ����������ָ����������ƽ���������Ǻ�����
 */

import org.junit.Test;

public class MathDemo {
	double x = 4 , y = 10.0;
	
	//Math���ṩ�˸���һ��double��ֵ����ƽ�����ķ���,����ֵҲ��double����
	//static double sqrt(double a) ���ص���ȷ������ƽ���� doubleֵ��
	@Test
	public void sqrt() {
		System.out.println(Math.sqrt(x));//2.0
		System.out.println(Math.sqrt(y));//3.1622776601683795
	}
	
	/*Math��Ҳ�ṩ��һ��������ķ���
	 * static double pow(double a, double b) ����һ��������ֵ���ص��ڶ����������ݡ�  
	 */
	@Test
	public void pow() {
		System.out.println(Math.pow(y, x));//10000.0
	}
	
	/*Math���ṩ����������ķ���
	 * static long round(double a)  ���ز�������ӽ��� long ������ long��������Ϊ�������  
	static int round(float a) ���ز�������ӽ��� int ������ int��������Ϊ�������  
	 * */
	@Test
	public void round() {
		//�������Ϊ�����������Ǵ��ڵ���Long.MAX_VALUE��ֵ,��ôת������ΪLong.MAX_VALUE
		double d = Double.MAX_VALUE;
		float f = Float.MAX_VALUE;
		long ld= Math.round(d);
		int i = Math.round(f);
		System.out.println(Long.MAX_VALUE + ":" + ld + "," + i);
		//�������ΪNaN,��ôת������Ϊ0
		d = Double.NaN;
		ld = Math.round(d);
		System.out.println(ld);
		//�������Ϊ������С�����Ǵ�С�ڵ���Long.MIN_VALUE��ֵ,��ôת������ΪLong.MIN_VALUE
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
	/**Math�ṩ�����������ֵ�ķ���
	 * static double abs(double a) 
����ֵΪ double����ֵ��  
static float abs(float a) 
���� floatֵ�ľ���ֵ��  
static int abs(int a) 
����ֵΪ int����ֵ��  
static long abs(long a) 
����ֵΪ long����ֵ��  
	 */
	@Test
	public void abs() {
		int i = -9;
		System.out.println(Math.abs(i));
	}
}
