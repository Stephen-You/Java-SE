package cn.yorick.compoundStatement;

public class CompoundStatementPractice {
	public static void main(String[] args){
		int a = 23 ;
		System.out.println("a��ֵ��:"+a);
		{
			int b = 24 , c = 25 ;
			System.out.println("b��ֵ��:"+b);
			boolean boo ;		//����һ��Ҫע�������������,Ҳ����������������
			{
				boo = b > c ;
				System.out.println("��������е�Ƕ�����:"+boo);
			}
			// int a = 20 ; �����main�������Ѿ�������Ա����,����������ٴ�������ͬ���ֵĳ�Ա��������ִ���
			a = a++ + 1 ;
		}
		//System.out.println("�ڱ�������������ʹ�ñ�������ִ���:"+b);  ����ʾ�Ҳ�������
		System.out.println("����һ��Ҫע�������������,����������˳��:"+a);
	}
}
