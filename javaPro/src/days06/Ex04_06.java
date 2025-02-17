package days06;

import java.util.Arrays;

public class Ex04_06 {
	
	public static void main(String[] args) {
		
		//세 정수(n, m, o) 중에 가장 큰값, 작은값
		//[문제]20개의 정수중에 가장 큰값, 작은 값 출력
		
		int [] m = {10, 31, 98, 38, 68, 91, 95, 76, 27, 29};
		//System.out.println(Arrays.toString(m));
		m = new int[10]; //새로운 주소로 m배열이 생겨남. 위에 배열은 가비지값됌.
		 for (int i = 0; i < m.length; i++) {
	         m[i] = (int)(Math.random()*101);  // 0 <=     <= 100
	      }

		
		int min = m[0];
		int max = m[0];
		int a;
		
		for(int i = 1; i < 10; i++) {
			
			min = Math.min(min, m[i]);
			max = Math.max(max, m[i]);
		}
		
		System.out.println(Arrays.toString(m));
		System.out.println(max);
		
	} //main

}
