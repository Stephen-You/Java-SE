package cn.yorick.switchStatement;
/**
 * 
 * @author YorickYou
 * @Date   2019年3月9日
 * @version 1.8
 * GitHub  https://github.com/YorickYou/Java-SE.git
 * core    switch语句简单练习
 */
public class SwitchWeekPractice {
	public static void main(String[] args){
		int day = 9 ;
		switch(day){
			default:	//若没有一个常量的值与表达式的值相同则默认执行default,
			System.out.println("请检验您的输入数字是否正确!");
			//如果没有发现break,则继续执行下面的case语句直到发现break
			case 1:
			System.out.println("根据您输入的数字可以确定是:星期一");
			break;
			/*default:	一个switch语句中只能有一个default,否则会提示标签重复
			System.out.println("请检验您的输入数字是否正确!");*/
			case 2:
			System.out.println("根据您输入的数字可以确定是:星期二");
			break;
			case 3:
			System.out.println("根据您输入的数字可以确定是:星期三");
			break;
			case 4:
			System.out.println("根据您输入的数字可以确定是:星期四");
			break;
			case 5:
			System.out.println("根据您输入的数字可以确定是:星期五");
			break;
			case 6:
			System.out.println("根据您输入的数字可以确定是:星期六");
			break;
			case 7:
			System.out.println("根据您输入的数字可以确定是:星期日");
			break;
		}
	}
}
