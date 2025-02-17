package days08;

import java.io.IOException;
import java.util.Scanner;

public class days07_Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	     int d = 2, i = 1;
	      while ( d <= 9 ) {         
	         while (i<=9) {
	            System.out.printf("%d*%d=%2d ", d, i, d*i);
	            i++;
	         } // while i
	         System.out.println(); // 개행
	         d++;
	      } // while d
	
	}

}

/*
int ans;

for(int i = 2; i < 10; i++) {
	
	if(i ==3 )continue;
	else System.out.printf("[%d단]:", i);
	for(int j = 1; j < 10;j++ ) {
		System.out.printf("%d*%d=%d ", i, j, i*j);
		
	}
	System.out.println();
}
*/