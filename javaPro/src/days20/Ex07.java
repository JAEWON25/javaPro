package days20;

import java.util.Calendar;

public class Ex07 {

	public static void main(String[] args) {
		// calendar 클래스
		//new 연사로 객체 생성 x
//		Calendar c = new Calendar(); //추상클래스라 이렇게 선언 불가
		Calendar c = Calendar.getInstance();
//		System.out.println(c);
		
		System.out.println(c.get(1)); //2025  year을 가져온다
		System.out.println(c.get(Calendar.YEAR)); //YEAR
		System.out.println(c.get(Calendar.MONTH+1)); //MONTH+1 1월이 0이다
		System.out.println(c.get(Calendar.DATE)); //DATE == DAY_OF_MONTH 월의 일 / 일자
		System.out.println(c.get(Calendar.DAY_OF_YEAR));//일년중 며칠째인지
		
		//시간 분 초 밀리초 요일
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.MILLISECOND));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));  //요일 일요일(1) ~ 토요일(7)
														  // Date 일(0) ~ 토(6)

	}
	public static String getCalendar(Calendar c) {
		return String.format("%d.%02d.%02d", c.get(Calendar.YEAR), c.get(Calendar.MONTH+1), c.get(Calendar.DATE));
	}
	
	

}
