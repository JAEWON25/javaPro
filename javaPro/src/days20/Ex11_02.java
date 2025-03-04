package days20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex11_02 {

	public static void main(String[] args) {
		//날짜 형식의 문자열 s를 Date, Calendar 날짜 클래스로 변환
		String s = "2025.02.28(금)";
		
		/*
		 * [1]
		int year = Integer.parseInt(s.substring(0,4)); //substring 짤라온다
		int month = Integer.parseInt(s.substring(5,7));
		int date = Integer.parseInt(s.substring(8,10));
		Date d = new Date(year-1900, month-1, date);
		*/
		
		String pattern = "yyyy.MM.dd(E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			Date d = sdf.parse(s);
			//Date -> Calendar 변환 [직접 해보기]
			Calendar c = Calendar.getInstance();
			c.setTime(d);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}

	}

}
