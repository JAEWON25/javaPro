package days21;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class Ex04 {

	public static void main(String[] args) {
		//1. LocalDate 클래스
//		LocalDate d = new 생성자가 보이지 않는다.
		LocalDate d = LocalDate.now();
		System.out.println(d); //2025-03-04
		
//		년
//		int year = d.getYear();
		int year = d.get(ChronoField.YEAR);
		System.out.println(year);
		
//		월
//		int month = d.getMonthValue();
//		Month month = d.getMonth();
		int month = d.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(month);
				
//		일
//		int day = d.getDayOfMonth();
		int day = d.get(ChronoField.DAY_OF_MONTH);
		System.out.println(day);
		
//		요일
//		DayOfWeek week = d.getDayOfWeek();            //Tuesday
		int week = d.get(ChronoField.DAY_OF_WEEK);    //2 
		System.out.println(week);

	}

}
