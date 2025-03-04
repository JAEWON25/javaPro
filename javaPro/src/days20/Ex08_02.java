package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex08_02 {

	public static void main(String[] args) {

		//Calendar today = Calendar.getInstance(); //오늘 날짜 얻어온것
//		today.set(today.get(1), today.0);
		Calendar today = new GregorianCalendar(2025, 2-1, 28, 0, 0, 0);
		//2025.02.28
//		System.out.println(Ex07.getCalendar(today));
		Calendar startDate = new GregorianCalendar(2025, 2-1, 28);
		System.out.println(Ex07.getCalendar(today));
		
		System.out.println(today.after(startDate)); //현재 날짜가 지났니? true 
		System.out.println(today.before(startDate));
		System.out.println(today.equals(startDate)); //시간까지 체크해서 false 나온다.(시간 0으로 세팅)
		
		System.out.println(today.compareTo(startDate)); //0이면 같은날짜

	}

}
