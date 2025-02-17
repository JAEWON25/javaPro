package days06;

import java.util.Scanner;

public class Ex04_04 {
	
	public static void main(String[] args) {
		//두 정수(n, m)을 입력받아서 두 정수 사이의 홀수의 합을 출력.
		
		  int n, m ;
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("> 양의 정수( n m ) 입력 ? ");
	      n = scanner.nextInt();
	      m = scanner.nextInt();   
	      
	      int sum = 0;
	      
	      // [3]
	      int min = n > m ? m : n ; // Math.min(n,m);
	      int max = Math.max(n, m);
	      
	     
	     
	      while( min <= max) {
	    	  
	    	  if(min % 2 != 0)
	    	  
	    	  System.out.printf("%d+", min);
	          sum += min;
	          min += 2;
	      }
	      
	      System.out.printf("\b=%d", sum);
		
		
	} //main

}
