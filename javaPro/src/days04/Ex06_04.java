package days04;

import java.util.Scanner;

public class Ex06_04 {
	
	public static void main(String[] args) {
		
		int n = -1;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 점수 입력 ? ");
		
		
		 if (!scanner.hasNextInt()) {
	         System.out.println("[알림] 국어 점수 0~100 !!!");
	         return ;
	      } // if


		
		
		 n = scanner.nextInt();
		
		if (n >= 90 ) {
			System.out.println("수");
		} //if
		else if (n >= 80 ) {
			System.out.println("우");
		}
		else if (n >= 70 ) {
			System.out.println("미");
		}
		else if (n >= 60 ) {
			System.out.println("양");
		}
		else if(n >= 0 ){
			System.out.println("가");
		}
		else {
			System.out.println("점수를 다시 입력해주세요: 0 ~ 100");
		}
	} //main

}//class
