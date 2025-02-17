package days04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[문제] switch문
		//정수를 입력받아서 "홀수"/"짝수"라고 출력
		//value: 값(byte, short, int, ..)
		
		int n;
		String result = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 정수(n)입력 ? ");
		n = scanner.nextInt();
		
		switch (n % 2) {
		case 0:
			result = "%d는 짝수";
			break;
		
		case 1:
			result = "%d는 홀수";
			break;

		default:
			break;
		} // switch
		
		System.out.printf("%d는 짝수", n);
	}

}

/*
switch (key) {
case value:
	
	break;

default:
	break;
} // switch
*/
