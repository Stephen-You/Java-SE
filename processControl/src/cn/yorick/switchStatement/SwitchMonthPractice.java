package cn.yorick.switchStatement;
/**
 * 
 * @author YorickYou
 * @Date   2019��3��9��
 * @version 1.8
 * GitHub  https://github.com/YorickYou/Java-SE.git
 * core    ���ݸ������·ݣ��ж������ļ���
 */
public class SwitchMonthPractice {
	public static void main(String[] args){
		int month = 9 ;
		String str = "";
		switch(month){
		//����Switch��ʡ��,��break�ʵ�ʡ��,�����Է���һ��Դ����
			case 1:
			str = "����";
			case 2:
			str = "����";
			case 12:
			str = "����";
			break;
			case 3:
			str = "����";
			case 4:
			str = "����";
			case 5:
			str = "����";
			break;
			case 6:
			str = "�ļ�";
			case 7:
			str = "�ļ�";
			case 8:
			str = "�ļ�";
			break;
			case 9:
			str = "�＾";
			case 10:
			str = "�＾";
			case 11:
			str = "�＾";
              break;
			default:
			System.out.println("������������������Ƿ��ڷ�Χ��!");
		}
		System.out.print("��������������·��жϼ���Ϊ:"+str);
	}
}
