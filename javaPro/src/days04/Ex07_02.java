package days04;

import java.util.Scanner;

public class Ex07_02 {
	public static void main(String[] args) {
		
		int n = -1;
		char score = '수';
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 점수 입력 ? ");
		
		
		
		 if (!scanner.hasNextInt()) {
	         System.out.println("[알림] 국어 점수 0~100 !!!");
	         return ;
	      } // if
		 
		 n = scanner.nextInt();
		 
		 //case는 boolean형 불가능.
		 // switch (0 <= kor && kor >=100)) 이거 불가능. case true 불가능
		 int key = 0 <= n && n >=100 ? 1: 2;
		 switch (key) {
		case 1:
			
			break;
		case 2:
			break;

		default:
			break;
		} // switch
		 
		 switch (n/10) {
		 case 10:
		 case 9:
			 score = '수';
			    break;
		 case 8:
			 score = '우';
				break;

		 case 7:
			 score = '미';
				break;

		 case 6:
			 score = '양';
				break;

		 case 5:		
		 case 4:
		 case 3:					
		 case 2:			 
		 case 1:
		 case 0:
			 score = '양';
				break;
			
		 default:
			break;
		 } // switch


	   System.out.printf("%c", score);
		
	
	} //main
}
