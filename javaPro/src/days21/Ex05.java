package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ex05 {

	public static void main(String[] args) {
		
		//시간 + 날짜
//		LocalDateTime dt = LocalDateTime.now();
//		System.out.println(dt);
		
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		LocalDateTime dt = LocalDateTime.of(d, t);
		System.out.println(dt); //2025-03-04T14:04:12.219929700
		
		d = dt.toLocalDate();
		System.out.println(d);//2025-03-04
		
		dt = d.atTime(t);
		System.out.println(dt);
		
		dt = dt.truncatedTo(ChronoUnit.DAYS);
		System.out.println(dt);//2025-03-04T00:00 절삭 

	}

}
