package days21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Ex08 {

	public static void main(String[] args) {
		//형식화 클래스 - 4가지
		// j.t format 패키지
			// DataTimeFormatter 형식화 클래스
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt); //2025-03-04T15:12:51.010263400
		
		//내가 원하는 어떤 형태로 출력 원한다.
		//표 참고 (원하는 형식 참고)
		
		System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE)); //2025-03-04
		System.out.println(dt.format(DateTimeFormatter.BASIC_ISO_DATE)); //20250304
		
		//2025/03/04 화요일 15:16:45.123
//		String pattern = "yyyy/MM/dd E요일 hh:mm:ss.SSS";
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
//		String s = dtf.format(dt);
//		System.out.println(s); //2025/03/04 화요일 03:20:02.650

//		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL); //2025년 3월 4일 화요일
//		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG); //2025년 3월 4일
//		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM); //2025. 3. 4.
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT); //25. 3. 4.
		String s = dtf.format(dt); 
		System.out.println(s);


	}

}
