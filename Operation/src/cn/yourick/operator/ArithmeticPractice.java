package cn.yourick.operator;

public class ArithmeticPractice {
	public static void main(String[] args){
		int ax = 3 , bx = 2 , hx , jx = -1 , rx = -5;
		byte cx = (byte)(ax + bx) ;
		long dx = bx - ax ;
		float ex = ax%bx ;
		System.out.println("ax����bxȡ�� = "+ex);
		ex = ax%jx ;	                 
		//ȡ����Կ��������ж�һ��������ż��,��a%2=0,��ôaΪż��,��֮Ϊ����
		System.out.println("����ģ���Ǹ���ʱ:"+ex);
		ex = rx%bx ;
		System.out.println("��ģ���Ǹ���ʱ:"+ex);//��ģ���Ǹ���ʱ,Ҫ���Ƿ���
		ex = rx%-3 ;
		System.out.println("��ģ���ͱ�ģ����Ϊ����ʱ���Ƚ���ģ���ķ���ƲȥȻ����" + 
				"�㣬ʵ����ȡģ������ֻ����ģ����ȡֵ���ţ������������򸺣�"+ex);
		int fx = ax * bx ;
		hx = 0 ;
		//int gx = ax/hx ;	��������Ϊ0,����ᱨ����,java.lang.ArithmeticException
		int gx = ax / bx ;	//���Ľ��Ϊ����,���������
		System.out.println("ax+bx = "+cx);
		System.out.println("bx-ax = "+dx);
		System.out.println("ax*bx = "+fx);
		System.out.println("ax/bx = "+gx);
		System.out.println("5+5 ="+5+5);//+���˿������ӷ���,�����԰ѷ��ַ���ת�����ַ���
		System.out.println(4150 / 1000 * 1000);
		System.out.println("��������ķ������������ûʲô��ͬ" + rx/bx + "," + rx/jx);
	}
}
