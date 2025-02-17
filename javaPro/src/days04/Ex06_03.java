package days04;

import java.util.Scanner;

public class Ex06_03 {

	public static void main(String[] args) {
		
		//[문제]
		//국어 점수를 입력받아서
		//수/우/미/양/가
		//출력
		//수  90이상 ~ 100이하
		//우  80이상 ~ 90미안
		//미  70이상 ~ 80미안
		//양  60이상 ~ 70이하
		//가  0이상 ~ 60미안
		
		int n = -1;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 점수 입력 ? ");
		
		/*
	      if ( scanner.hasNextInt() ) {
	         // InputMismatchException
	         kor = scanner.nextInt();  // 1a , 99.87 
	      }else {
	         System.out.println("[알림] 국어 점수 0~100 !!!");
	         return ;
	      }
	      */
		
		 if (!scanner.hasNextInt()) {
	         System.out.println("[알림] 국어 점수 0~100 !!!");
	         return ;
	      } // if


		
		
		n = scanner.nextInt();
		
		if (n >= 90 && n <= 100) {
			System.out.println("수");
		} //if
		else if (n >= 80 && n < 90) {
			System.out.println("우");
		}
		else if (n >= 70 && n < 80) {
			System.out.println("미");
		}
		else if (n >= 60 && n < 70) {
			System.out.println("양");
		}
		else if(n >= 0 && n < 60){
			System.out.println("가");
		}
		else {
			System.out.println("점수를 다시 입력해주세요: 0 ~ 100");
		}
		
	} //main

}//class
