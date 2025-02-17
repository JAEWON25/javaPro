package days08;

import java.util.Scanner;

public class Ex09_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[문제] 1년에서부터 ~2025년까지 총 몇번의 윤년이 있는지? 
		int count =0;
		count = 2025/4 - 2025/100 + 2025/400;
		System.out.println(count);

	}

	

}
