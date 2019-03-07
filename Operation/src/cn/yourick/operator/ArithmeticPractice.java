package cn.yourick.operator;

public class ArithmeticPractice {
	public static void main(String[] args){
		int ax = 3 , bx = 2 , hx , jx = -1 , rx = -5;
		byte cx = (byte)(ax + bx) ;
		long dx = bx - ax ;
		float ex = ax%bx ;
		System.out.println("ax除以bx取余 = "+ex);
		ex = ax%jx ;	                 
		//取余可以快速用来判断一个数的奇偶性,如a%2=0,那么a为偶数,反之为奇数
		System.out.println("当被模数是负数时:"+ex);
		ex = rx%bx ;
		System.out.println("当模数是负数时:"+ex);//当模数是负数时,要考虑符号
		ex = rx%-3 ;
		System.out.println("当模数和被模数都为负数时会先将被模数的符号撇去然后运" + 
				"算，实际在取模运算中只考虑模数的取值符号，正则正，负则负："+ex);
		int fx = ax * bx ;
		hx = 0 ;
		//int gx = ax/hx ;	除数不能为0,否则会报错误,java.lang.ArithmeticException
		int gx = ax / bx ;	//除的结果为整数,余数会舍掉
		System.out.println("ax+bx = "+cx);
		System.out.println("bx-ax = "+dx);
		System.out.println("ax*bx = "+fx);
		System.out.println("ax/bx = "+gx);
		System.out.println("5+5 ="+5+5);//+除了可以做加法外,还可以把非字符串转换成字符串
		System.out.println(4150 / 1000 * 1000);
		System.out.println("除法运算的符号则和正常的没什么不同" + rx/bx + "," + rx/jx);
	}
}
