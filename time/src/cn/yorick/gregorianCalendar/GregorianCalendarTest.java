package cn.yorick.gregorianCalendar;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 
 * @author YorickYou
 * @Date   2019��3��9��
 * @version 1.8
 * GitHub  https://github.com/YorickYou/Java-SE.git
 * core    ʹ��GregorianCalendar��ӡ��ǰ�µ�����
 */
public class GregorianCalendarTest {

	public static void main(String[] args) {
		GregorianCalendar date = new GregorianCalendar();	//��ȡ��ǰʱ�������ϵͳ����
		int month = date.get(Calendar.MONTH);	//��ȡ��ǰ���ڵ��·�
		int today = date.get(Calendar.DAY_OF_MONTH);	//��ȡ��ǰʱ��ĵ�ǰ������
		String weekdays[] = new DateFormatSymbols().getShortWeekdays();
		for (int i = 1; i < 8; i++) {
			System.out.print(weekdays[i] + " ");
		}
		System.out.println();
		//��������Ϊ��ǰ�µĵ�һ��
		date.set(Calendar.DAY_OF_MONTH, 1);
		//��ȡ��ǰ�µ�һ���Ӧ������
		int value = date.get(Calendar.DAY_OF_WEEK);
		//��ӡ�����ĵ�һ��
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
			date.add(Calendar.DAY_OF_MONTH, 1);//��������1
		} while (date.get(Calendar.MONTH) == month);
		

	}

}
