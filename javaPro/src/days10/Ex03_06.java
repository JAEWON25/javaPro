package days10;

public class Ex03_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  *
		// ***
		//*****
		
		int row = 11;
		
		for(int i = 1; i <= row; i++) {
			// 공백
			for(int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			//2*i-1 홀수 
			for(int j = 1; j <= 2*i-1; j++) { 
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i <=3; i++) {
		  for(int j = 1; j <= 5; j++) {
			if(i+j>=4 && j-i <= 2 ) {
				System.out.print("*");
			}else
				System.out.print(" ");
		}
		System.out.println();
	 }
	}

}
