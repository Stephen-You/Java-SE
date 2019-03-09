package cn.yorick.forStatement;

public class Repetition {
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5};
		System.out.print("数组中的元素为：");
		/*标准for循环
		for(int i = 0;i<5;i++){
			System.out.print(arr[i]+",");
		}*/
		for(int x:arr){
			System.out.print(x+",");
		//foreach语句，元素变量x为遍历数组的元素值	
		}
	}
}
