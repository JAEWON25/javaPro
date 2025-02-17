package days04;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		//[문제]
		//정수를 입력받아서 홀수 or 짝수 입력
		
		int n;
		
		System.out.print("정수 입력: ");
		
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();
		
		
		if(n % 2 == 0) {
			System.out.printf("%d는 짝수", n);
		}//if
		/*
		if(n % 2 != 0) {
			System.out.printf("%d는 홀수", n);
		}
		*/
		else {
			System.out.printf("%d는 홀수", n);
		}
						
		
	}

}
