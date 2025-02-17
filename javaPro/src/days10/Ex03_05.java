package days10;

public class Ex03_05 {

	public static void main(String[] args) {
		
	//    *    i=1  j=1
    //   **	   i=2  j=2
    //  ***
	// ****
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 4; i >=1;i--) {
			System.out.println(" ".repeat(i-1) + "*".repeat(5 - i));
		}
		
		for(int i = 1; i <=4; i++) {
		  for(int j = 1; j <= 4; j++) {
			if(i+j >= 5) {
				System.out.print("*");
			}else
				System.out.print("");
		}
		System.out.println();
	  }
		

	}

}
