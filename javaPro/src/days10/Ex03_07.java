package days10;

public class Ex03_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      // __*
	      // _***
	      // *****
	      // _***
	      // __*
		
		//4 - 1번 , 3개
		//5 - 2번, 1개
		for (int i = 1; i <= 5; i++) {
	         // 공백 for
	         for (int j = 1; j <= (i<=3?3-i:i-3); j++) {
	            System.out.print("_");
	         } // for j         
	         // 별  for
	         for (int j = 1; j <= (i<=3?2*i-1:5-2*(i-3)); j++) {
	            System.out.print("*");
	         } // for j
	         System.out.println(); // 개행
	      } // for i
		
		for(int i = 1; i <=3; i++) {
			  for(int j = 1; j <= 5; j++) {
				if(i+j>=4 && j-i <= 2 && i + j>=4 && j+i <=2 ) {
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.println();
		 }
			
	}

}
