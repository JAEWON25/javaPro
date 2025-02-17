package days06;

import java.util.Scanner;

public class Ex07_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[문제] 한 라인에 10개의 ASCII 문자를 출력
		//윈도우 개행: carrage return(cr) + line feed 이런것들때문에 출력하면 공백 개행이 생김.
		//           13 '\r'                    10 '\n'
		
		Scanner scanner = new Scanner(System.in);
		for (int i = 0, lineNumber = 0; i < 256; i++) {
			if(i%10==0)System.out.printf("%d: ", lineNumber);
			System.out.printf("[%c]", (char)i);
			if(i % 10 == 9) { //1: 0 1 2 3 4 5 6 7 8 9
							  //2: 10 11 12 13 14 15 16 17 18 19
				System.out.println();
				if(lineNumber % 5 == 0) {
					System.out.println("\t 계속하려면 엔터를 치세요.");
					scanner.nextLine();
				}
				lineNumber++;
			}
		
		} //for i

	}

}
