package days20;

import java.util.Date;

public class Ex06 {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);//Fri Feb 28 12:38:01 GMT+09:00 2025  GMT->그리니치 표준시
		//d.toString() 이랑 같다
		System.out.println(d.toLocaleString()); //2025. 2. 28. 오후 12:39:33 로컬지역 표준시
		
		System.out.println(d.getYear()); //.get 날짜 시간 분 초 다 가져온다
		//125  -> 1900을 항상 더해야된다
		
		System.out.println(d.getMonth());
		//1  -> 항상 1을 더해야된다.
		
		System.out.println(d.getDate()); //28 정상
		
		System.out.println(d.getMinutes()); //42 정상
		
		System.out.println(d.getSeconds()); //정상
		
		System.out.println(d.getTime()); //long형 값을 돌린다.
		//1970.1.1 00:00:00  밀리세컨드(ms)값을 돌려준다
		
		System.out.println("일월화수목금토".charAt(d.getDay()));
		
	}

}
