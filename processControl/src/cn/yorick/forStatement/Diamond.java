package cn.yorick.forStatement;

public class Diamond {
	public static void main(String[] args) {
		fun1(9);
	}
	public static void fun1(int lineNumber){
		/*根据行数判断循环次数,如果行数是奇数那么循环此数就是column/2+1,
		 * 如果是偶数,那么空心菱形只能打印奇数,要做出提示*/
		int half = lineNumber / 2;
		int moreHalf = lineNumber / 2 + 1;
		//行数是奇数,进行打印
		if(lineNumber % 2 == 1){
			System.out.println("空心菱形：");
			for(int k = 1;k <= moreHalf;k++){
				for(int i = 1;i <= (moreHalf - k);i++){
					System.out.print(" ");
				}
				System.out.print("*");
				for(int i = 1;i <= ( (k - 2) * 2 + 1);i++){
					System.out.print(" ");
				}
				if(k != 1){
					System.out.print("*");
				}
				System.out.println();
			}
			for(int k = half;k >=1;k--){
				for(int i = 1;i <= (moreHalf - k);i++){
					System.out.print(" ");
					}
				System.out.print("*");
				for(int i = 1;i <= ( (k - 2) * 2 + 1);i++){
					System.out.print(" ");
					}if(k != 1){
						System.out.print("*");
					}
					System.out.println();
				}
			System.out.println("实心菱形：");
			for(int i = 1;i <= lineNumber;i++){
				if(i <= lineNumber/2 + 1){
					for(int k = 1;k <= lineNumber/2 + 1- i;k++){
						System.out.print(" ");
						}
					for(int k = 1;k <= i;k++){
						System.out.print("* ");
						}
					System.out.println();
					}else{
						for(int k =1;k <= (i -(lineNumber/2 + 1));k++){
							System.out.print(" ");
						}
						for(int k = 1;k <= (2 *(lineNumber/2 + 1) - i);k++){
							System.out.print("* ");
						}
						System.out.println();
					}
				}
			}else {
				System.out.println("对不起,空心菱形行数应该为大于0的奇数,请确认输出!");
			}
		
	}
}
