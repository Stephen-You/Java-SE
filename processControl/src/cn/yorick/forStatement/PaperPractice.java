package cn.yorick.forStatement;

public class PaperPractice {
	public static void main(String[] args){
		int x = 88480000 , y = 1 ;//定义珠峰高度和纸的厚度
		int n = 0 ;//用n来表示折叠的次数
		for(;y<=x;n++){	//for循环的运行顺序: 没有折叠时n=0,纸的厚度小于珠峰高度,纸的厚度乘2加倍,折叠次数加1,此时代表折叠了一次
			y = y*2;	//折叠到倒数第2次时,纸的厚度小于珠峰高度,此时继续循环,纸的厚度超出珠峰高度,次数也会比实际需求大1
		}
		/*while(y<=x){
			n++;		//在原有折叠次数上再折叠一次
			y = y * 2 ;	//折叠一次后纸的厚度翻倍
		}*/
		/*do{
			y=y*2;
			n++;
		}while(y<=x);*/
		System.out.println("折叠"+n+"次后纸的厚度为:"+y);
		System.out.println("折叠的倒数第二次纸的厚度是:"+y/2);
	}
}
