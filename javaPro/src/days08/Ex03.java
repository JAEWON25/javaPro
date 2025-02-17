package days08;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[정보처리기사 실기]
		//어떤 정수를 입력받아서 약수를 구해서 출력.. 
		//예) 8의 약수 - 1 2 4 8
		
		/*
		int num= 999;
		System.out.print("정수 입력 : ");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		int n = 1;
		System.out.println("약수는 ");
		while(num >= 1) {
			if(num % n == 0) {
				System.out.printf(", %d", n);
			}
			else {
				continue;
				num--;
				n++;
			}
			
		}
		*/
		  Scanner scanner = new Scanner(System.in);
	      System.out.print("> 정수(n) 입력 ? ");
	      int n = scanner.nextInt();  // 8
	      System.out.printf("%d 의 약수 - 1 ", n);
	      
	      for (int i = 2; i <= n/2; i++) {
	         if ( n % i == 0 ) {
	            System.out.printf( "%d ", i );
	         } // if
	      } // for i
	      
	      System.out.printf( "%d ", n );
	      // 68 의 약수 - 1 2 4 17 34 68 
		

	}

}
