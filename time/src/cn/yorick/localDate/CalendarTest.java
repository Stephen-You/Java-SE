package cn.yorick.localDate;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.Test;

/**
 * 
 * @author YorickYou
 * @Date   2019年3月8日
 * GitHub  https://github.com/YorickYou/Java-SE.git
 * core	   利用工具类来完成当前时间的当月月历打印输出
 */
public class CalendarTest {
	/*
	 * 方法1:使用LocalDate
	 */
	@Test
	public void localDate() {
		LocalDate date = LocalDate.now();	//从默认时区的系统时钟获取当前日期。
		//获取当前时间对应月和天
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		/*将日期设置为当月第一天  minusDays(long daysToSubtract) 
		返回此 LocalDate的副本，并减去指定的天数。*/
		date = date.minusDays(today - 1);
		//获取当前的星期对应的日期对象,根据此获取星期对应的对应的数字 其中星期一是1,星期七是7
		DayOfWeek weekday = date.getDayOfWeek();
		int value = weekday.getValue();
		System.out.println("星期日 星期一 星期二 星期三 星期四 星期五 星期六");
		if(value == 7) {
			System.out.print("");
		}else {
			for (int i = 0; i < value; i++) {
				System.out.print("      ");
			}
		}
		//循环打印直到当前月打印完
		while (date.getMonthValue() == month) {
			System.out.printf("%5d", date.getDayOfMonth());	//打印当前天数日期
			if(date.getDayOfMonth() == today) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			date = date.plusDays(1);	//天数增加1
			if(date.getDayOfWeek().getValue() == 7) {
				System.out.println();
			}
			
		}
		if(date.getDayOfWeek().getValue() != 7) {
			System.out.println();
		}
	}
	/*
	 * 方法2:使用GregorianCalendar
	 */
	@Test
	public void gregorianCalendar() {
		
	}
}
