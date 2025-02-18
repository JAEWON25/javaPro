package days12;

import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정렬 [sort]
		//오름차순 정렬 [작은값 --> 큰값 순]
		//내림차순 정렬 [큰 값 --> 작은 값]
		
		int [] m = {3, 5, 2, 4, 1};
		System.out.println(Arrays.toString(m));
		
		//bubbleSort(m);
		
		
		selectionSort2(m);
	
		System.out.println(Arrays.toString(m));
		
		//삽입정렬
			  int key; // 삽입할 값
		      for (int i = 1, j; i < m.length; i++) {
		         System.out.printf("%d - ", i);
		         key = m[i];
		         for (j = i-1; j >= 0 ; j--) {
		            if(m[j] <= key) break;
		            m[j+1] = m[j];
		         } // for j
		         m[++j] = key;
		         System.out.println(Arrays.toString(m));
		      } // for i
			

	}

	private static void selectionSort2(int[] m) {
		// TODO Auto-generated method stub
		/*
		 * 0 1 2 3 4 index
		 * 3 5 2 4 1 value
		 * 
		 * min -> m[0] = 3   m[1~4]
		 * min = 가장 작은 수의 인덱스값을 찾고 마지막에 한번 위치 바꾼다.
		 * 
		 * */
	
	    int minIndex = 0;
		for (int i = 0; i < 4; i++) {
			minIndex = i; //i로 초기화
			for (int j = i+1; j < 5; j++) {
				if (m[minIndex] > m[j]) {
					minIndex = j;
				}
				
			}
			if (i != minIndex) {
				int temp = m[i];
				m[i] = m[minIndex];
				m[minIndex] = temp;
			}
		}
	    
	}

	private static void selectionSort(int[] m) {
		// TODO Auto-generated method stub
		for (int i = 0; i < m.length; i++) {
			for (int j = i; j < 5; j++) {
				if(m[i] >= m[j]) {
					int temp = m[i];
					m[i] = m[j];
					m[j] = temp;
					}
			}
		}
	}

	private static void bubbleSort(int[] m) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < 4-i; j++) {
				if(m[j] >= m[j+1]) {
					int temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
				}
				System.out.println(Arrays.toString(m));
			} //for j
			System.out.println();
		} //for i
	}

}
