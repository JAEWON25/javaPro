package days21;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Ex06 {

	public static void main(String[] args) {
		//[Temporal + Adjusters]
		LocalDate d = LocalDate.now();
		System.out.println(d); //오늘 날짜
		
		//이번 달의 첫 번째 월요일?
//		d = d.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
//		System.out.println(d); //2025-03-03
		
		//[문제] 이번 달의 마지막 토요일 휴강
//		d = d.with(TemporalAdjusters.lastInMonth(DayOfWeek.SATURDAY));
//		System.out.println(d); //2025-03-29
		
		//[문제] 다음 주 수요일 휴강?
		//오늘 날짜 - 2025-03-04
		
		//1(월) ~ 7(토)
//		int dayOfweek = d.getDayOfWeek().getValue(); //2
//		
//		if(dayOfweek < 3) { //3 -> DayOfWeek.WEDNESDAY.getValue()) 수요일 보다 작을 경우..
//
//			d = d.plusWeeks(1);
//		}
//
//		d = d.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
//		System.out.println(d);

		
		//[문제] 이번 달 3번째 목요일
		//d = d.with(TemporalAdjusters.firstDayOfNextMonth(3, DayOfWeek.THURSDAY));
//		System.out.println(d);
	}

}
