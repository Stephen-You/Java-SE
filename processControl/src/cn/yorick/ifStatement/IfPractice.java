package cn.yorick.ifStatement;

public class IfPractice {
	public static void main(String[] args){
		int a = 23 , b = 24 ;
		boolean boo = true ,aoo = false ;
		if(! false == boo || (5 == 6)){
			System.out.println("���ʽ����ʽ���Զ�������������Ϊboolean����");
		}
		if(5 == 6);{
			System.out.println("���if��������()��ֱ�Ӹ�;�����if�������������Ƿ�����������������");
		}
		if(a < b){
			if( a < b){
				System.out.println("If�������񸴺����һ��Ƕ�����!");
			}
			System.out.println("��if���ı�׼��̬;");
		}
		if(aoo) System.out.println("��if�����������ֻ��һ����������ʡ��{}��ʱ�����﷨����,����if�������÷�ΧҲ�ɸ���,����֧��,Ϊ����ǿ�Ķ���");
			System.out.println("if�����ʡ��{},��ô�����÷�Χֻ�ǽ�������һ�����,��������������ִ��,����������ʽ��Ӱ��!");
		if(boo){}//����if���������û������ʱ����ʡ��{},ĩβ��;,��ȻҲ���Ա���,
		if(a < b && boo){
			System.out.println("��if����е�����һ��Ҫ�ǲ������ʽ,Ҳ���ǽ�������ǲ�����,��ʽ������");
		}
		/*if(3 = 3){
			System.out.println("����һ��Ҫȷ��if����������ʽ����������,����3��int��,���Ҳ��int��,�ᱬ���������������");
		}*/
	}
}
