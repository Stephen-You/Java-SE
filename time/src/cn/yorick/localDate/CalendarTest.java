package cn.yorick.localDate;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.Test;

/**
 * 
 * @author YorickYou
 * @Date   2019��3��8��
 * GitHub  https://github.com/YorickYou/Java-SE.git
 * core	   ���ù���������ɵ�ǰʱ��ĵ���������ӡ���
 */
public class CalendarTest {
	/*
	 * ����1:ʹ��LocalDate
	 */
	@Test
	public void localDate() {
		LocalDate date = LocalDate.now();	//��Ĭ��ʱ����ϵͳʱ�ӻ�ȡ��ǰ���ڡ�
		//��ȡ��ǰʱ���Ӧ�º���
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		/*����������Ϊ���µ�һ��  minusDays(long daysToSubtract) 
		���ش� LocalDate�ĸ���������ȥָ����������*/
		date = date.minusDays(today - 1);
		//��ȡ��ǰ�����ڶ�Ӧ�����ڶ���,���ݴ˻�ȡ���ڶ�Ӧ�Ķ�Ӧ������ ��������һ��1,��������7
		DayOfWeek weekday = date.getDayOfWeek();
		int value = weekday.getValue();
		System.out.println("������ ����һ ���ڶ� ������ ������ ������ ������");
		if(value == 7) {
			System.out.print("");
		}else {
			for (int i = 0; i < value; i++) {
				System.out.print("      ");
			}
		}
		//ѭ����ӡֱ����ǰ�´�ӡ��
		while (date.getMonthValue() == month) {
			System.out.printf("%5d", date.getDayOfMonth());	//��ӡ��ǰ��������
			if(date.getDayOfMonth() == today) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			date = date.plusDays(1);	//��������1
			if(date.getDayOfWeek().getValue() == 7) {
				System.out.println();
			}
			
		}
		if(date.getDayOfWeek().getValue() != 7) {
			System.out.println();
		}
	}
	/*
	 * ����2:ʹ��GregorianCalendar
	 */
	@Test
	public void gregorianCalendar() {
		
	}
}
