package cn.yourick.operator;

public class ShiftOperatorPractice {
	public static void main(String[] args){
		System.out.println("46&97�Ľ��Ϊ:"+(46&97));	//46�Ķ����Ʊ�ʾ00000000 00000000 00000000 00101110
		System.out.println("46|97�Ľ��Ϊ:"+(46|97));	//97�Ķ����Ʊ�ʾ00000000 00000000 00000000 01100001
		System.out.println("46��λȡ���Ľ��Ϊ:"+~46);
		System.out.println("46^97�Ľ��Ϊ:"+(46^97));
		System.out.println("46����5λ�Ľ����:"+(46<<5));
		System.out.println("46����2λ�Ľ����:"+(46>>2));
		System.out.println("46�޷�������1λ�Ľ����:"+(46>>>1));
	}
}
