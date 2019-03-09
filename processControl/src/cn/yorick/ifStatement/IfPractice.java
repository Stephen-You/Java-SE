package cn.yorick.ifStatement;

public class IfPractice {
	public static void main(String[] args){
		int a = 23 , b = 24 ;
		boolean boo = true ,aoo = false ;
		if(! false == boo || (5 == 6)){
			System.out.println("表达式的形式可以多样但其结果必须为boolean类型");
		}
		if(5 == 6);{
			System.out.println("如果if条件语句后即()后直接跟;则该条if简单语句语句无论是否成立都继续下面代码");
		}
		if(a < b){
			if( a < b){
				System.out.println("If语句可以像复合语句一样嵌套语句!");
			}
			System.out.println("简单if语句的标准形态;");
		}
		if(aoo) System.out.println("简单if语句序列中若只有一条语句则可以省略{}这时并无语法错误,并且if语句的作用范围也可覆盖,但不支持,为了增强阅读性");
			System.out.println("if语句若省略{},那么其作用范围只是紧随其后的一条语句,其他的语句会线性执行,不会受其表达式的影响!");
		if(boo){}//当简单if语句序列中没有内容时可以省略{},末尾加;,当然也可以保留,
		if(a < b && boo){
			System.out.println("简单if语句中的条件一定要是布尔表达式,也就是结果必须是布尔型,格式不限制");
		}
		/*if(3 = 3){
			System.out.println("我们一定要确定if语句条件表达式的数据类型,如上3是int型,结果也是int型,会爆出错误以外的类型");
		}*/
	}
}
