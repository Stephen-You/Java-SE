package cn.yorick.switchStatement;
/**
 * 
 * @author YorickYou
 * @Date   2019��3��9��
 * @version 1.8
 * GitHub  https://github.com/YorickYou/Java-SE.git
 * core    ���ݸ����ĳ�������,��ѯ����ʡ��
 */
public class ProvincePractice {
	public static void main(String[] args){
		String str = "����";
		switch(str){
			case "ʯ��ׯ":
			System.out.println("���Ǻӱ�ʡ��;");
			break;
			case "����":
			System.out.println("����ɽ��ʡ��;");
			break;
			case "֣��":
			System.out.println("���Ǻ���ʡ��;");
			break;
			case "����":
			System.out.println("���Ǻ��ϵؼ���;");
			break;
			default:
			System.out.println("�Բ����������ҵĳ��������ݿ���û�з���,���������!");
		}
	}
}
