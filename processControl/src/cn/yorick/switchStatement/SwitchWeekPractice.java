package cn.yorick.switchStatement;
/**
 * 
 * @author YorickYou
 * @Date   2019��3��9��
 * @version 1.8
 * GitHub  https://github.com/YorickYou/Java-SE.git
 * core    switch������ϰ
 */
public class SwitchWeekPractice {
	public static void main(String[] args){
		int day = 9 ;
		switch(day){
			default:	//��û��һ��������ֵ����ʽ��ֵ��ͬ��Ĭ��ִ��default,
			System.out.println("������������������Ƿ���ȷ!");
			//���û�з���break,�����ִ�������case���ֱ������break
			case 1:
			System.out.println("��������������ֿ���ȷ����:����һ");
			break;
			/*default:	һ��switch�����ֻ����һ��default,�������ʾ��ǩ�ظ�
			System.out.println("������������������Ƿ���ȷ!");*/
			case 2:
			System.out.println("��������������ֿ���ȷ����:���ڶ�");
			break;
			case 3:
			System.out.println("��������������ֿ���ȷ����:������");
			break;
			case 4:
			System.out.println("��������������ֿ���ȷ����:������");
			break;
			case 5:
			System.out.println("��������������ֿ���ȷ����:������");
			break;
			case 6:
			System.out.println("��������������ֿ���ȷ����:������");
			break;
			case 7:
			System.out.println("��������������ֿ���ȷ����:������");
			break;
		}
	}
}
