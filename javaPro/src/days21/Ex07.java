package days21;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//날짜와 날짜 사이의 간격 period
		//시간과 시간 = Duration 클래스
		
		//[문제] 개강일로부터 오늘까지 날짜 간격
		
		LocalDate o = LocalDate.of(2025, 2, 3);
		LocalDate t = LocalDate.now();
		
		//Period.between() 메소드를 통해서 날짜간의 간격를 얻어올수있다.
		Period p = Period.between(o, t);
		System.out.println(p.getYears()); //0
		System.out.println(p.getMonths()); //1
		System.out.println(p.getDays()); //1
		
		System.out.println(p.get(ChronoUnit.YEARS)); //0
		System.out.println(p.get(ChronoUnit.MONTHS)); //1
		System.out.println(p.get(ChronoUnit.DAYS)); //1
		System.out.println("-".repeat(60));
		
		
		//시간 시간의 간격 :Duration 클래스
		//[문제] 오늘 수업 시작 시간이 얼마나 지났는지 확인..
		LocalTime s = LocalTime.of(9, 0, 0);
		LocalTime n = LocalTime.now();
		
		Duration d = Duration.between(s, n);
		
		System.out.println(d.toHours()); //6시
		System.out.println(d.toMinutes()); //363분
		int minutes = (int)(d.toMinutes() % 60); // 4분
		System.out.println(minutes);
		int second = (int)(d.getSeconds() % 60);
		System.out.println(second);
		
		
		//System.out.println(d.get(ChronoUnit.HOURS)); 시간 정보는 얻어오지못한다.
//		System.out.println(d.getSeconds() / (60 * 60)); //5시간 지났다.
//		System.out.println(d.getSeconds() % 60);
//		System.out.println(d.getSeconds()); //20980
//		System.out.println(d.getNano());
		
		//between()과 until() 차이점
		//between
		Period.between(t, t); //static
		//until
		Duration.between(s, n); //객체생성

	}

}
