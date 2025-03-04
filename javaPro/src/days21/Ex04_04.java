package days21;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ex04_04 {

	public static void main(String[] args) {
		//이번달 마지막 날짜
		
		/*
		LocalDate d = LocalDate.now();
		d = d.withDayOfMonth(1);  //d = 로 받는거 중요
		System.out.println(d);
		d = d.plusMonths(1);
		System.out.println(d);
		d = d.minusDays(1);
		System.out.println(d);
		int date = d.getDayOfMonth();
		System.out.println(date);
		*/
		
		LocalTime t = LocalTime.now();
		System.out.println( t ); //12:44:07.510881
		// 초 밑으로는 절삭하고 싶다.
		t = t.truncatedTo(ChronoUnit.SECONDS); //temporal unit = chronoUnit
		System.out.println(t);
		
		t = t.plus(2, ChronoUnit.HOURS); //2시간 더하겠다.
		System.out.println(t);

	}

}
