package days20;

import java.util.Calendar;
import java.util.Date;

public class Ex09 {

	public static void main(String[] args) {
		// Calendar → Date 변환
		Calendar c = Calendar.getInstance();
		Date d = c.getTime(); //제일 좋은 방법 -> 날짜객체 생성할때 가장 좋다
//		[1] Date d = new Date(0, 0, 0, 0, 0, 0, 0);
//		[2] Date d = new Date(long time);
		
		//Date -> Calendar
		c.setTime(d); //날짜 객체 넣으면 바로 c객체로 돌려준다.

	}

}
