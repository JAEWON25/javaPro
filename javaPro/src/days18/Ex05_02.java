package days18;

import java.util.Random;

public class Ex05_02 {

	public static void main(String[] args) {
		// [예외 처리]
		int number = 100;
		int result = 0;
		
		Random rnd = new Random();
		int n = -1;
		for (int i = 0; i < 10; i++) {
			n = rnd.nextInt(5); //0<= 정수 < 5
			
			if(n==0) {
				i--;
				continue;
			}
			result = number / n; // n = 0이면 예외발생. 따라서 if문으로 0지운다.
			System.out.println(result);
		
		} //for i
	}
}
