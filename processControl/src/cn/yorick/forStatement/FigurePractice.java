package cn.yorick.forStatement;

public class FigurePractice {
	public static void main(String[] args){
		//��ӡһ�������������������Ĺ���ͼ��(�и�9,����12)
		int line = 9 , list = 12;
		for(int x=1;x<=line;x++){
		//�е�ѭ����Ƕ�����е�ѭ����
			for(int y=1;y<=list;y++){
				System.out.print("* ");
			}
			//��β����Ҫע�⻻��
			System.out.println("");
		}
		//��ӡһ��ֱ��������
		for(int x=0;x<5;x++){
			for(int q=0;q<=x;q++){
				System.out.print("* ");
			}
			System.out.println("");
		}
		//��ӡһ��������������,ʵ���Ͼ��Ǵ�ӡһ���ո������κ���һ��������
		for(int y=5;y>0;y--){//�����������εı߳�,�������εı߳�������������ͬ
			for(int s=5;s>y;s--){//��ӡ�ո��ѭ���ʹ�ӡ*��ѭ��Ҫע���Ⱥ�,��ӡ�ո�ʵ���Ͼ��Ǵ�ӡһ��ֱ��������
				System.out.print(" ");
			}
			for(int z=y;z>0;z--){
				System.out.print("* ");
			}	
			System.out.println("");
		}
		//��һ�ַ���
		int last = 5;
		for(int y=0;y<last;y++){
			for(int q=0;q<y;q++){
				System.out.print(" ");
			}
			for(int z=y;z<last;z++){
				System.out.print("* ");
			}
			System.out.println("");
		}
    //��ӡһ�������ֹ��ɵ���������
	out:for(int i=1;i<10;i++){
		for(int j=1;j<10-i;j++){//����ǰ���а˸��ո�
			System.out.print(" ");
		}
		inner:for(int j=i;j>0;j--){//���ֵĴ�ӡ���Ƿ�������,��һ���ִ�i����1
			System.out.print(j);
			continue out;
		}
		for(int j=1;j<i;j++){//�ڶ����ִ�2��ӡ��i
			System.out.print(j+1);
		}
		System.out.println("");
	}
	}
}
