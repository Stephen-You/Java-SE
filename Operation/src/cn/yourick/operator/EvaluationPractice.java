package cn.yourick.operator;
/**
 * 
 * @author YorickYou
 * @Date   2019��3��7��
 * GitHub  https://github.com/YorickYou/Java-SE.git
 * core
 */
public class EvaluationPractice {
	public static void main(String[] args){
		int ax = 1 , bx = 9 ; //Ϊ1��int�ͱ�����Ϊax�ı�����ֵ,��ʼ��ֵΪ1
		int  cx = ax = bx - ax ;	//��һ�����ʽ�������������ϵĸ�ֵ�����,��ô���ȴ����ұ�����,��Ȼ�����ڳ�������в���������ô��.
		System.out.println("cx = "+cx);
		System.out.print("ax = "+ax);
	}
}
