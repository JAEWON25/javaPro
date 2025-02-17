package days10;

public class Ex03_04 {

	public static void main(String[] args) {
		//****
		// ***
		//  **
		//   *
		
		/*
		//[1]
		for(int i = 4; i >= 1; i--) {
			for(int j = 1; j <= 4 - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//[2]
		for(int i = 4; i >= 1; i--) {
			System.out.print(" ".repeat(i-1));
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
