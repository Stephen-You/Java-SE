package cn.yorick.compoundStatement;

public class CompoundStatementPractice {
	public static void main(String[] args){
		int a = 23 ;
		System.out.println("a的值是:"+a);
		{
			int b = 24 , c = 25 ;
			System.out.println("b的值是:"+b);
			boolean boo ;		//我们一定要注意变量的作用域,也就是它的生命周期
			{
				boo = b > c ;
				System.out.println("复合语句中的嵌套语句:"+boo);
			}
			// int a = 20 ; 如果在main方法中已经声明成员变量,复合语句中再次声明相同名字的成员变量会出现错误
			a = a++ + 1 ;
		}
		//System.out.println("在变量的作用域外使用变量会出现错误:"+b);  会提示找不到符号
		System.out.println("我们一定要注意变量的作用域,和语句的线性顺序:"+a);
	}
}
