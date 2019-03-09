package cn.yorick.switchStatement;
/**
 * 
 * @author YorickYou
 * @Date   2019年3月9日
 * @version 1.8
 * GitHub  https://github.com/YorickYou/Java-SE.git
 * core    根据给定的城市名字,查询所属省份
 */
public class ProvincePractice {
	public static void main(String[] args){
		String str = "洛阳";
		switch(str){
			case "石家庄":
			System.out.println("这是河北省会;");
			break;
			case "济南":
			System.out.println("这是山东省会;");
			break;
			case "郑州":
			System.out.println("这是河南省会;");
			break;
			case "洛阳":
			System.out.println("这是河南地级市;");
			break;
			default:
			System.out.println("对不起您所查找的城市在数据库中没有发现,请检查后输入!");
		}
	}
}
