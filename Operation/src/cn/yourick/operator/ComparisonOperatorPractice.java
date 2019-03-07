package cn.yourick.operator;

public class ComparisonOperatorPractice {
	public static void main(String[] args){
		int s1 = 5 , s2 = 6 ;
		System.out.println("5>6这是真的吗:"+(s1>s2));
		System.out.println("5<6这是真的吗:"+(s1<s2));
		System.out.println("5等于6是真的吗:"+(s1==s2));
		System.out.println("5大于等于6是真的吗:"+(s1>=s2));
		System.out.println("5小于等于6是真的吗:"+(s1<=s2));
		System.out.println("5是不等于6的:"+(s1!=s2));
		System.out.println("字符S和s是不相同的:"+('S'!='s'));
	}
}
