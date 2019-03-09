package cn.yorick.forStatement;

public class FigurePractice {
	public static void main(String[] args){
		//打印一个给定行数给定列数的规则图形(行高9,列数12)
		int line = 9 , list = 12;
		for(int x=1;x<=line;x++){
		//行的循环里嵌套了列的循环换
			for(int y=1;y<=list;y++){
				System.out.print("* ");
			}
			//列尾我们要注意换行
			System.out.println("");
		}
		//打印一个直角三角形
		for(int x=0;x<5;x++){
			for(int q=0;q<=x;q++){
				System.out.print("* ");
			}
			System.out.println("");
		}
		//打印一个倒立的正三角,实际上就是打印一个空格三角形和另一个三角形
		for(int y=5;y>0;y--){//定义正三角形的边长,正三角形的边长和它的行数相同
			for(int s=5;s>y;s--){//打印空格的循环和打印*的循环要注意先后,打印空格实际上就是打印一个直角三角形
				System.out.print(" ");
			}
			for(int z=y;z>0;z--){
				System.out.print("* ");
			}	
			System.out.println("");
		}
		//另一种方法
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
    //打印一个由数字构成的正三角形
	out:for(int i=1;i<10;i++){
		for(int j=1;j<10-i;j++){//最多的前面有八个空格
			System.out.print(" ");
		}
		inner:for(int j=i;j>0;j--){//数字的打印我们分两部分,第一部分从i倒序到1
			System.out.print(j);
			continue out;
		}
		for(int j=1;j<i;j++){//第二部分从2打印当i
			System.out.print(j+1);
		}
		System.out.println("");
	}
	}
}
