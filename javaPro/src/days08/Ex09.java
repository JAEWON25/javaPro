package days08;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		//[문제] 년도를 입력받아서 윤년/평년 출력
		//400년 97일
		//4배수년         100일
		//100배수년   -1   96
		//400배수년   +1   97
		//4의 배수년도 마다 1을 추가 ( 10년 나누기 4는 2니까 10년동안 2번)
		//100의 배수 년도 일때는 -1일
		//
		
		int year;
		Scanner scanner = new Scanner(System.in);
		year = getYear(scanner);
		
		if(isLeapYear(year)) {
			System.out.println("윤년");
		}
		else {
			System.out.println("평년");
		}

	}

	private static boolean isLeapYear(int year) {
		
		return year % 4 ==0 && year % 100 !=0 ||year % 400 ==0; //&&연산자가 더 우선순위가 높다.
	}

	private static int getYear(Scanner scanner) {
		//년도 유효성 검사 리턴 -> 1년부터 계속 진행
		String regex = "\\d*"; //
		String strYear;
		
		do {
			System.out.print("년도 입력: ");
			strYear = scanner.next();
		}while(!strYear.matches(regex));
		
		return 0;
	}

}
