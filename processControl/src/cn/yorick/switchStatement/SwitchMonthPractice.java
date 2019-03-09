package cn.yorick.switchStatement;
/**
 * 
 * @author YorickYou
 * @Date   2019年3月9日
 * @version 1.8
 * GitHub  https://github.com/YorickYou/Java-SE.git
 * core    根据给定的月份，判断所属的季节
 */
public class SwitchMonthPractice {
	public static void main(String[] args){
		int month = 9 ;
		String str = "";
		switch(month){
		//运用Switch的省略,将break适当省略,将共性放在一处源代码
			case 1:
			str = "冬季";
			case 2:
			str = "冬季";
			case 12:
			str = "冬季";
			break;
			case 3:
			str = "春季";
			case 4:
			str = "春季";
			case 5:
			str = "春季";
			break;
			case 6:
			str = "夏季";
			case 7:
			str = "夏季";
			case 8:
			str = "夏季";
			break;
			case 9:
			str = "秋季";
			case 10:
			str = "秋季";
			case 11:
			str = "秋季";
              break;
			default:
			System.out.println("请检查您所输入的数字是否在范围中!");
		}
		System.out.print("根据您所输入的月份判断季节为:"+str);
	}
}
