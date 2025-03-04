package days20;

import java.util.Date;

public class Ex06_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date startDate = new Date(2025-1900,2-1,3,9,0,0); //개강일
		System.out.println(startDate.toLocaleString());
		System.out.println(startDate.getTime());
		
		Date endDate = new Date(2025-1900,8-1,8,18,0,0); //수료일 시간까지
		System.out.println(endDate.toLocaleString());
		System.out.println(endDate.getTime());
		
		//수료일 - 개강일 = ms
		System.out.println(endDate.getTime() - startDate.getTime());
		
		long time = 1754643600000L;
		Date d = new Date(time);
		System.out.println(endDate.toLocaleString());

	}

}
