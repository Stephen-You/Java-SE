package cn.yorick.forStatement;

public class Repetition {
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5};
		System.out.print("�����е�Ԫ��Ϊ��");
		/*��׼forѭ��
		for(int i = 0;i<5;i++){
			System.out.print(arr[i]+",");
		}*/
		for(int x:arr){
			System.out.print(x+",");
		//foreach��䣬Ԫ�ر���xΪ���������Ԫ��ֵ	
		}
	}
}
