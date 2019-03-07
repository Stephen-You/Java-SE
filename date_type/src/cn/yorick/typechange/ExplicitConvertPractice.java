package cn.yorick.typechange;

import org.junit.Test;

/**
 * 
 * @author YorickYou
 * @Date   2019��3��7��
 * GitHub  https://github.com/YorickYou/Java-SE.git
 * core    ����ת��--ǿ������ת��
 */
public class ExplicitConvertPractice {
	public static void main(String[] args) {
		byte a = 127 ;
		short b = 516 ;
		byte ab = (byte)b ;
		byte abc = (byte)(b - a - a - a - a) ;
		System.out.println("�����ݷ�Χ����ʱ�ᷢ��������ʧ: "+ ab ) ;	//��ʾת�����ݶ�ʧ
		System.out.println("�����ݷ�Χ����ʱ��ʾת��: "+ abc ) ;
		int x = 50 ;
		double d = 92247.8698 ;
		int bx = (int)(d - x) ;
		System.out.println("��double�ͺ�int����һ��ǿ��ת��ʱ���ΪΪ:" + bx ) ;
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
		ld = (long) d;
		i = (int) f;
		System.out.println(Long.MAX_VALUE + ":" + ld + "," + i);
		//�������ΪNaN,��ôת������Ϊ0
		d = Double.NaN;
		ld = Math.round(d);
		System.out.println(ld);
		ld = (long) d;
		System.out.println(ld);
		//�������Ϊ������С�����Ǵ�С�ڵ���Long.MIN_VALUE��ֵ,��ôת������ΪLong.MIN_VALUE
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
