package days02;

public class Ex05_04 {

	public static void main(String[] args) {
		//b(1), s(2), i(3), l(4)
		//[문제] 나이를 저장할 변수를 선언하세요.
		//int age =20;
		//[][] 2비트는 4가지 경우의 수  2^2.
		//b(1) = byte 1바이트 [][][][][][][][] 첫 비트는 부호 비트 2^7 = 128가지.   ~128 ~ 127가지의 정수를 나타낸다.
		// 양수는 0을 표현하기때문에 128 -1.
		// s(2) = short 2바이트  [][][][][][][][] [][][][][][][][] 65536가지 -27678 ~ 27677 정수
		//i(4) 2^32
		//l(8) 2^64
		
		byte age;
		age = 120;
		System.out.printf("age=%d\n",age);
		
		//[문제] 국어 점수를 저장할 변수 선언 95 할당
		byte score;
		score = 95;
		System.out.printf("score=%d\n", score);

	}

}
