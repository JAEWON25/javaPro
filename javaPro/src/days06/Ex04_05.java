package days06;

import java.util.Scanner;

public class Ex04_05 {
	
	public static void main(String[] args) {
		//ex04_05 세 정수를 입력받아서 세 정수의 가장 큰 값, 가장 작은값 출력.
		
		  int n, m, b;
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("> 양의 정수( n m b) 입력 ? ");
	      n = scanner.nextInt();
	      m = scanner.nextInt();   
	      b = scanner.nextInt(); 
	      
	      if(n > b && n > m)  System.out.printf("가장 큰 수 : %d", n );
	      //else if(n > b && n > m)  System.out.printf("가장 큰 수 : %d", n );
	      //else if(n > b && n > m)  System.out.printf("가장 큰 수 : %d", n );
	      
	      //int max = n > m ?(n > o? n: 0):(m>o?m:o);
	      //int min = Math.min(Math.min(n,m),o);
	  
	      
		
	} //main

}
