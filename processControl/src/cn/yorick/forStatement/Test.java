package cn.yorick.forStatement;
/**
 * 
 * @author YorickYou
 * @Date   2019年3月9日
 * @version 1.8
 * GitHub  https://github.com/YorickYou/Java-SE.git
 * core    finally和return
 */
public class Test {
	static int x = 1 , y = 10 , z = 100;
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.finallyNotWork());
		int value = test.finallyReturn();
		System.out.println("value = " + value);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	}
	public int finallyNotWork() {
		int temp = 10000;
		try {
			throw new Exception();
		} catch (Exception e) {
			return ++temp;
		}finally {
			temp = 99999;
		}
	}
	
	public int finallyReturn() {
		try {
			return ++x;
		} catch (Exception e) {
			return ++y;
		}finally {
			return ++z;
		}
	}
}
