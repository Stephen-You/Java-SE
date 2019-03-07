package cn.yourick.operator;

public class LogicalOperatorPractice {
	public static void main(String[] args){
		boolean b1 = 3 > 5 , b2 = 3 < 5 ; 
		System.out.println("逻辑单与,真真为真,真假为假,假真为假,假假为假:"+(b2&b2)+".."+(b2&b1)+".."+(b1&b2)+".."+(b1&b1));//单&时，左边无论真假，右边都进行运算；
		System.out.println("逻辑双与,真真为真,真假为假,假真为假,假假为假:"+(b2&&b2)+".."+(b2&&b1)+".."+(b1&&b2)+".."+(b1&&b1));//双&时，如果左边为真，右边参与运算，如果左边为假，那么右边不参与运算。
		System.out.println("逻辑单或,真真为真,真假为真,假真为真,假假为假:"+(b2|b2)+".."+(b2|b1)+".."+(b1|b2)+".."+(b1|b1));//单|时，左边无论真假，右边都进行运算；
		System.out.println("逻辑双或,真真为真,真假为真,真假为假,假假为假:"+(b2||b2)+".."+(b2||b1)+".."+(b1||b2)+".."+(b1||b1));//双||时，如果左边为真，右边不参与运算，如果左边为假，那么右边参与运算。
		System.out.println("逻辑异或,真真为假,真假为真,假真为真,假假为假:"+(b2^b2)+".."+(b2^b1)+".."+(b1^b2)+".."+(b1^b1));
		System.out.println("逻辑非,真为假,假为真,"+!b2+".."+!b1);
		//注意短路运算符有时候可以避免出现一些异常,如下所示
		int x = 0;
		int y = 2;
		System.out.println(x != 0 && 1 / x > x + y);
	}
}
