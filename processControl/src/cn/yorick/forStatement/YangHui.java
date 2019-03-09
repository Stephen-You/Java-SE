package cn.yorick.forStatement;

public class YangHui {
	public static void main(String[] args) {
		fun1(8);
	}
	/**
	 * 杨慧三角:
	 * 1.每行的头一个数是1;
	 * 2.每行的最后一个数是1;
	 * 3.当前数是上一行的数+其前一个数
	 */
	public static void fun1(int column){
		/*创建二维数组,来作为杨慧三角中的元素的容器,二维数组的长度是杨慧三角的列数,
		* 二维数组中的一维数组的长度是当前行的元素个数+空格数*/
		int[][] intArr = new int[column][column];
		for (int i = 0; i < intArr.length; i++) {
			//动态开辟空间,每一行的空间大小和行号是相同的
			intArr[i] = new int[i+1];
			}
		//为数组填充元素
		for (int i = 0; i < intArr.length; i++) {
			//每一行第一个是1,最后一个也是1
			intArr[i][0] = 1;
			intArr[i][i] = 1;
			//注意杨慧三角的运算是从第三行开始的
			for (int j = 1; j < i; j++) {
				//当前数是上一行的数+其前一个数,实际上只有到了第三行才会运算
				intArr[i][j] = intArr[i-1][j]+intArr[i-1][j-1];
				}
			}
		//循环过滤
		for (int j = 0; j < intArr.length; j++) {
			for (int j2 = 0; j2 < intArr[j].length; j2++) {
				System.out.print(intArr[j][j2]+"\t");
			}
			//打印完一行换行
			System.out.println();
		}
	}
}
