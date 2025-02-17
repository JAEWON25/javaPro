package days05;

import java.util.Scanner;

public class days05_quiz2 {

    public static void main(String[] args) {

        System.out.println("베스킨라빈스31 게임시작");

        Scanner scanner = new Scanner(System.in);
        int lastNum = 0;  
        boolean player1 = true;  
        
        while (lastNum < 31) {
        	
            if (player1) {
                
                System.out.println("플레이어는 숫자 개수를 입력하세요(1~3): ");
                int player = scanner.nextInt();

                if (player < 1 || player > 3) {
                    System.out.println("1~3의 숫자만 입력 가능합니다.");
                    continue;
                }

                System.out.print("플레이어: ");
                for (int i = 1; i <= player; i++) {
                    lastNum++; 
                    System.out.print(lastNum + " ");
                }
                System.out.println();
                if (lastNum == 31) {
                    System.out.println("플레이어의 승리");
                    break;
                }
            }
            	
            player1 = !player1;
          
            if (!player1 && lastNum < 31) {
                
                int computer = (int) (Math.random() * 3 + 1); 

                System.out.print("컴퓨터: ");
                for (int i = 1; i <= computer; i++) {
                    lastNum++;
                    System.out.print(lastNum + " ");
                }
                System.out.println();
                if (lastNum == 31) {
                    System.out.println("컴퓨터의 승리");
                    break;
                }
            }

            
        }//while
    }//main
}//class
