package cn.yorick.forStatement;


import java.util.ArrayList;
import java.util.List;

public class ForeachTest {

	public static void main(String[] args) {
		String[] strArr = {"A","B","C","D","E"};
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		for (String string : list) {
			System.out.print(string);
		}
		System.out.println("\r\n---------------");
		for (String string : strArr) {
			System.out.print(string);
		}
	}

}
