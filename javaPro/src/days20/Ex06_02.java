package days20;

import java.util.Date;

public class Ex06_02 {

	public static void main(String[] args) {
		//달력 그리기 - Date 클래스
		int year = 2025;
		int month = 3;
		
		//1)2025.3.1 무슨 요일?
		//2)2025.3   마지막 날짜?
		/*
		 * [1]
		Date d = new Date();
		System.out.println(d.getDay());//요일을 나타낸다/ 일(0) ~ 토(6)
		
		//날짜 얻어올때 getXXX()
		//날짜 설정    setXXX()
		d.setYear(year - 1900);
		d.setMonth(3-1);
		d.setDate(1);
		*/
		
//		[2]
		Date d = new Date(year - 1900, month-1, 1);
//		System.out.println(d.getDate());// [일]자를 가져온다.
		int date = d.getDate();
		d.setDate(date + 2);
		
		//한달 더한다.
		d.setMonth(d.getMonth()+1);
		//하루뺸다. 1일이면 그 전달 마지막 날짜.
		d.setDate(d.getDate()-1);
		
//		[3]
		System.out.println(d.toLocaleString());
		System.out.println(d.getDay());


	}

}
