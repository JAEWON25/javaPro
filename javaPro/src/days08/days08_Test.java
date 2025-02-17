package days08;

import java.util.Scanner;

public class days08_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if(isPrimeNumber(i)) { //i 소수이니? 참
				System.out.printf("%d+", i);
				sum += i;
			}
		} //for i
		System.out.printf("=%d", sum);
	}

	private static boolean isPrimeNumber(int n) {
		if(n==1)
			return false;
		else if( n==2) {
			return true;
		}
		else if( n % 2 ==0) {
			return false;
		}
		// 자기자신 외에 약수 x (소수)
		for(int i =3; i < n; i++) { //n대신 루트 50까지도 가능. Math.sqrt(n)
			if(n % i  == 0) {
			   return false;
			}
		}
		return true;
	}

}
