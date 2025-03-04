package days20;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex07_02 {

	public static void main(String[] args) {
		//달력 그리기 - Calendar 클래스
		int year = 2025;
		int month = 3;
		
		//1)2025.3.1 무슨 요일?
		
		Calendar c = Calendar.getInstance();

		
		//2)2025.3   마지막 날짜?
		//c.set(Calendar.MONTH, c.get(Calendar.MONTH)+1);
		//c.set(Calendar.DATE, c.get(Calendar.DATE)-1);
//		c.add(Calendar.MONTH, 1);
//		c.add(Calendar.DATE, -1);
		
//		[2]
		System.out.println(c.getActualMaximum(Calendar.DATE));
		
		System.out.println(Ex07.getCalendar(c));
		

	}
	public static int getDayOfWeek(Calendar c) {
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek;
	}
	public static int getLastDay(Calendar c) {
		
		return c.getActualMaximum(Calendar.DATE);
	}
}
