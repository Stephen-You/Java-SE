package cn.yourick.operator;

public class Demo {
	public static void main(String[] args){
		int ax = 3 , bx = 2 , jx = -1;
		ax = bx++ + jx ;
		System.out.println("前加加和后加加的区别:"+ax+"......"+bx+"......"+ax);
		bx = ++ax + jx ;
		System.out.println("前加加和后加加的区别:"+ax+"......"+bx+"......"+ax);
		bx = ax ++;
		System.out.println(bx + "," +ax);
		short s1 = Short.MAX_VALUE;
		s1 += 1;
		System.out.println(s1);
	}
}
