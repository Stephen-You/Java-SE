package cn.yourick.operator;
/**
 * 
 * @author YorickYou
 * @Date   2019年3月7日
 * GitHub  https://github.com/YorickYou/Java-SE.git
 * core
 */
public class EvaluationPractice {
	public static void main(String[] args){
		int ax = 1 , bx = 9 ; //为1个int型变量名为ax的变量赋值,初始化值为1
		int  cx = ax = bx - ax ;	//当一个表达式中若有两个以上的赋值运算符,那么会先从最右边算起,当然我们在程序代码中并不建议这么做.
		System.out.println("cx = "+cx);
		System.out.print("ax = "+ax);
	}
}
