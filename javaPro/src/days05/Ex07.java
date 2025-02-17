package days05;

public class Ex07 {
	
	public static void main(String[] args) {
		//바아에서 임의의 수를 발생시키는 코딩.
		//1)Math.random() 메서드
		//2)Random 클래스
		
		//Math 클래스 : 수학과 관련된 기능이 구현된 클래스
		System.out.println(Math.abs(-10));
		
		//0.0 <= double < 1.0 (실수 랜던한 값 반환)
		System.out.println(Math.random());
		
		/*
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.random());
		} //for i
		*/
		
		//로또 번호 1~45 임의의 수 6개
		//1 <= (int)(Math.random() * 45) + 1 <= 46
		
		//국어 0 ~ 100
		int b;
		//0 <= (int)(Math.random()) * 100) <= 100  
		/*
		for(int i = 0; i < 20; i++) {
			b= (int)(Math.random() * 101);
			System.out.println(b);
		}
		*/
		
		//3 <= (int)(Math.random() * 16 ) <  19
		int a ;
		a = (int)(Math.random() * 17 + 3);
		System.out.println(a);
		
		
	} //main

}
