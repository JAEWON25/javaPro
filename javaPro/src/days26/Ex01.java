package days26;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		 [취업문제] 30분
//	      문제3) 막대기 자르기  - 취업문제
		
		Scanner scanner = new Scanner(System.in);
		int n;
		
		n = scanner.nextInt();
		int [] arr = new int[n];
		
		if(1 <= n && n <= 1000) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			} //for i
		}else
			System.out.println("1 <= n <= 1000");
		
		
		CutOperation(n, arr);
		

	      

	}

	private static void CutOperation(int n, int[] arr) {

		System.out.printf("%d", n);
		while( true) {
			int min = Arrays.stream(arr).min().getAsInt();
			
			if(min == 0) {
				break;
			}
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    arr[i] -= min;
                }
            }
	        int count = 0;
	        for (int num : arr) {
	            if (num > 0) {
	                count++;
	            }
	        }
			
	        System.out.printf("%d\n", count);
			
		}
		
	}
}
