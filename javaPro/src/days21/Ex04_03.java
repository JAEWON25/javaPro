package days21;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.GregorianCalendar;

public class Ex04_03 {

	public static void main(String[] args) {
		// 개강일 25.2.3
//		Date d = new Date(2025-1900, 2-1, 3);
//		Calendar d = new GregorianCalendar(2025, 2-1, 3);
		
//		LocalDate d = new LocalDate.now();
//		//년, 월, 일 수정 - with(), withXXX()
//		d.withYear(2024); //년도 2024fh tnwjd
//		System.out.println(d); //2025-03-04 수정안되었다.
//		
//		d = d.withYear(2024);
//		d = d.with(ChronoField.YEAR, 2025);
//		System.out.println(d); 
//		
//		d = d.withMonth(2);
//		d = d.with(ChronoField.MONTH_OF_YEAR,2);
//		System.out.println(d);
//		
//		d = d.withDayOfMonth(3);
//		System.out.println(d);
		
		
//		[2] 2025-02-03 날짜 객체가 필요하다
		LocalDate d=  LocalDate.of(2025, 2, 3);
		System.out.println(d);
		
		// A 생일 1990.02.5
		// B 생일 1992.03.4
		// C 생일 2000.04.5
		//생일 지났는지 여부 출력하는 코딩
		//결과 : 오늘이 생일이다
		//		생일 지났다
		//		생일이 지나지않았다
		
		LocalDate a =  LocalDate.of(1990, 2, 5);
		LocalDate b =  LocalDate.of(1992, 3, 4);
		LocalDate c =  LocalDate.of(2000, 4, 5);
		LocalDate today = LocalDate.now();
		
		a = a.withYear(today.getYear());
		b = b.withYear(today.getYear());
		c = c.withYear(today.getYear());
		
		System.out.println(today.compareTo(a));
		System.out.println(today.compareTo(b));
		System.out.println(today.compareTo(c));
		
		/*
		System.out.println(today.isBefore(a)); 	//f
		System.out.println(today.isEqual(a));	//f
		System.out.println(today.isAfter(a));	//t
		
		System.out.println(today.isBefore(b));
		System.out.println(today.isEqual(b));
		System.out.println(today.isAfter(b));
		
		System.out.println(today.isBefore(c));
		System.out.println(today.isEqual(c));
		System.out.println(today.isAfter(c));
		*/
		
		/*
		LocalDate[] localDateList = {LocalDate.of(1990, 2, 5),LocalDate.of(1992, 3, 4), 
		LocalDate.of(2000, 4, 5)};
	      LocalDate now = LocalDate.of(1992, 3, 4);
	      
	      for(LocalDate localDate : localDateList) {
	         if (now.isEqual(localDate)) {
	            System.out.println("오늘이 생일이다");
	         } else if(now.isBefore(localDate) ) {
	            System.out.println("생일이 지나지 않았다");
	         } else {
	            System.out.println("생일이 지났다");
	         }
	      }
		*/

	}

}
