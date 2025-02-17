package days06;

import java.util.Arrays;

public class Ex_lotto_problem {
	
	public static void main(String[] args) {
		
		//배열 선언
		//[][][][][][]
		//lotto[0] ~ [5]
		int index = 0, n, d;
		int [] lotto = new int[6];
		lotto[index++] = (int)(Math.random()*45) + 1;     
		while (index <=5) {
			n = (int)(Math.random()*45) + 1;
			//중복 x
			int flag = 0;
			for(int i = 0; i < index; i++) { 
				if(n == lotto[i]) {
					flag =1;
					break;
				
				}
			
			}
			if( flag == 0)lotto[index++] = n;
			
		}
		
		
		
		System.out.println(Arrays.toString(lotto)); //[0], [0], [0], [0], [0], [0]
		
		
	} //main

}
