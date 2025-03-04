package days21;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Ex04_02 {

	public static void main(String[] args) {
		// j.t.LocalTime.now();
		LocalTime t = LocalTime.now();
		System.out.println(t); //12:04:07.923511600
		
//		시
//		int hour = t.get(ChronoField.HOUR_OF_DAY);
		int hour = t.getHour();
		
//		분
//		int minute = t.get(ChronoField.MINUTE_OF_HOUR);
		int minute = t.getMinute();
		System.out.println(minute);
		
//		초
//		int second = t.get(ChronoField.SECOND_OF_MINUTE);
		int second = t.getSecond();
		System.out.println(second);
		
//		나노
//		int nanosec = t.get(ChronoField.NANO_OF_SECOND);
		int nanosec = t.getNano();
		System.out.println(nanosec);
		
//		윤년체크 메소드
		//System.out.println(t.isLeapYear());

	}

}
