package days06;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		//1부터 입력받은 n까지의 합
		/*
		int sum = 0, n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력: ");
		n= scanner.nextInt();
		
		for(int i = 1; i <= n; i++){
				System.out.printf("%d+", i);
				sum += i;
		}
		System.out.printf("\b=%d", sum);
		*/
		
		int sum = 0, n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력: ");
		n= scanner.nextInt();
		int i = 1;
		
		if ( n < 1) {
			System.out.println("양의 정수만 입력!!");
			return;
		}
		while(i <= n) {
			System.out.printf("%d+", i);
			sum += i;
			i++;
		}
		System.out.printf("\b=%d", sum);
	} //main
}
