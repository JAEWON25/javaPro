package days15;

import java.util.Date;

public class Ex04 {
	
	//생성자 함수 / constructor / public도 생략 가능
	public Ex04() {
		
	}

	public static void main(String[] args) {
		
		// [생성자] pg 220
		/*
		MyPoint p1 = new MyPoint();
		//x, y필드 초기화
		p1.x = 10;
		p1.y = 20;
		
		p1.dispMyPoint();
		*/
		
		//필드 초기화를 동시에 해보자
		//The constructor MyPoint(int, int) is undefined
		MyPoint p1 = new MyPoint(10, 20); 
		
		p1.dispMyPoint();
		
		Date d = new Date(2000-1900, 10-1, 1);
		//d.setYear(2000-1900);
		//d.setMonth(10-1);
		
		System.out.println(d.toLocaleString());

	}

}
