package cn.yorick.forStatement;

public class PaperPractice {
	public static void main(String[] args){
		int x = 88480000 , y = 1 ;//�������߶Ⱥ�ֽ�ĺ��
		int n = 0 ;//��n����ʾ�۵��Ĵ���
		for(;y<=x;n++){	//forѭ��������˳��: û���۵�ʱn=0,ֽ�ĺ��С�����߶�,ֽ�ĺ�ȳ�2�ӱ�,�۵�������1,��ʱ�����۵���һ��
			y = y*2;	//�۵���������2��ʱ,ֽ�ĺ��С�����߶�,��ʱ����ѭ��,ֽ�ĺ�ȳ������߶�,����Ҳ���ʵ�������1
		}
		/*while(y<=x){
			n++;		//��ԭ���۵����������۵�һ��
			y = y * 2 ;	//�۵�һ�κ�ֽ�ĺ�ȷ���
		}*/
		/*do{
			y=y*2;
			n++;
		}while(y<=x);*/
		System.out.println("�۵�"+n+"�κ�ֽ�ĺ��Ϊ:"+y);
		System.out.println("�۵��ĵ����ڶ���ֽ�ĺ����:"+y/2);
	}
}
