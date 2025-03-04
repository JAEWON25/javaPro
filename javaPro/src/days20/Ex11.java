package days20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex11 {

	public static void main(String[] args) {
		
		Date d = new Date();
		
		/*
		 * [1]
		System.out.println(d.toLocaleString()); //2025. 2. 28. 오후 4:48:17
		System.out.println(d.toGMTString()); //28 Feb 2025 07:48:17 GMT
		
//		출력 형식) 2025/02/28 04:48:00 금요일
		String pattern = "yyyy/MM/dd hh:mm:ss E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(d));
		*/
		
		/*
//		[2] Calendar -> Date 변환 시킨 후 형식화 클래스를 사용하면 된다.
		Calendar c = Calendar.getInstance();
//		출력 형식) 2025/02/28 04:48:00 금요일
		String pattern = "yyyy/MM/dd hh:mm:ss E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(c.getTime()));
		*/
		
		//[문제]2025년 2월 28일 오후 5:04:25 금요일
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 a h:mm:ss EEEE");
		System.out.println(sdf.format(c.getTime()));
		
		

	}

}
