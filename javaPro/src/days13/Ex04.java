package days13;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*      > 게임 횟수 입력 ? 3
				      [1 게임]      [42][36][21][38][6][26]
				      [2 게임]      [11][7][19][2][25][15]
				      [3 게임]      [36][33][44][42][18][10]
		*/
	
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(">게임 횟수 입력 ? ");
		int num = scanner.nextInt();
		int [][] lotto = new int[num][6]; 
		Random rm = new Random();
		
		for (int i = 0; i < lotto.length; i++) {
			
			int number;
			System.out.printf("[%d게임]   ", i+1);
			for (int j = 0; j < lotto[i].length; j++) {
				number = rm.nextInt(46)+1;
				System.out.printf("[%d]", number);
				
			} //for j
			System.out.println();
		} //for i
		

	}

}
