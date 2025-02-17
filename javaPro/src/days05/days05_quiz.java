package days05;

import java.util.Scanner;

public class days05_quiz {
	
	public static void main(String[] args) {
		
		//user 가위(1)/ 바위(2)/ 보(3) 선택?. 선택은 컴퓨터가 랜덤으로 한다. 사용자는 입력.
		
		int player;
		int computer;
		
		for(int i = 0; i < 5; i++) {
			System.out.print("user 가위(1)/ 바위(2)/ 보(3) 선택: ");
			Scanner scanner = new Scanner(System.in);
			
			player = scanner.nextInt();
			
			computer = (int)(Math.random() * 3  + 1 );
			
			if(player == computer) System.out.println("무승부");
			else if( player == 1 && computer == 2) System.out.println("컴퓨터 승");
			else if( player == 2 && computer == 3) System.out.println("컴퓨터 승");
			else if( player == 3 && computer == 1) System.out.println("컴퓨터 승");
			else if( player == 1 && computer == 3) System.out.println("player 승");
			else if( player == 2 && computer == 1) System.out.println("player 승");
			else if( player == 3 && computer == 2) System.out.println("player 승");
			else System.out.println("가위(1)/ 바위(2)/ 보(3) (1~3)선택");
			
		}
		
		
	} //main

}
