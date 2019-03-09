package cn.yorick.gregorianCalendar;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 
 * @author YorickYou
 * @Date   2019年3月9日
 * @version 1.8
 * GitHub  https://github.com/YorickYou/Java-SE.git
 * core    使用GregorianCalendar打印当前月的月历
 */
public class GregorianCalendarTest {

	public static void main(String[] args) {
		GregorianCalendar date = new GregorianCalendar();	//获取当前时间的日历系统对象
		int month = date.get(Calendar.MONTH);	//获取当前日期的月份
		int today = date.get(Calendar.DAY_OF_MONTH);	//获取当前时间的当前月天数
		String weekdays[] = new DateFormatSymbols().getShortWeekdays();
		for (int i = 1; i < 8; i++) {
			System.out.print(weekdays[i] + " ");
		}
		System.out.println();
		//设置日期为当前月的第一天
		date.set(Calendar.DAY_OF_MONTH, 1);
		//获取当前月第一天对应的星期
		int value = date.get(Calendar.DAY_OF_WEEK);
		//打印日历的第一行
		int cnt = 1;
		while (weekdays[cnt] != weekdays[value]) {
			System.out.print("      ");
			++cnt;
		}
//		System.out.print("*");
		do {
			int day = date.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%5s",day);
			if(day == today) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			if(weekdays[date.get(Calendar.DAY_OF_WEEK)] == weekdays[7]) {
				System.out.println();
			}
			date.add(Calendar.DAY_OF_MONTH, 1);//日期增加1
		} while (date.get(Calendar.MONTH) == month);
		

	}

}
