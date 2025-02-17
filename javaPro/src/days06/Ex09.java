package days06;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		
		char one = '\u0000'; //null문자랑 같은 용도.
		
		System.out.print(">한 문자 입력? ");
		Scanner scanner = new Scanner(System.in);
		//one = scanner.next();
		
		System.out.printf("%c\n", one);
		
	} //main

}
