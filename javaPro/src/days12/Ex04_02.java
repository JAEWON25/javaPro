package days12;

import java.util.Arrays;

public class Ex04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 병합 정렬 ( merge sort )
		 * 1)이미 정렬되어져 있는 두 개의 배열을 합쳐서 하나의 배열로 만든다
		 * 
		 * */
		int [] m = {1, 3, 6, 10, 14};
		int [] n = {2, 4, 7};
		
		//병합된 결과 = {1,2,3,4,6,7,10,14}
		//int [] mn = new int[n.length + m.length];
		int [] mn = mergeSort(m, n);
		
		System.out.println(Arrays.toString(mn));
	}

	private static int[] mergeSort(int[] m, int[] n) {
	      int [] mn = new int[m.length + n.length];
	      //                   ↓  i=3
	      // int [] m = {1,3,6,10,14};
	        //                   ↓  j
	      // int [] n = {2,4,7};
	      //                                ↓ k
	      // int [] mn = [1, 0, 0, 0, 0, 0, 0, 0]
	      int i, j, k;
	      i = j = k = 0;
	      
	      /*
	      if (m[i] > n[j]) {
	         mn[k] = n[j];
	      } else {
	         mn[k] = m[i];
	      } // if
	      */ 
	      while ( i < m.length && j < n.length ) {
	         mn[k++] = m[i] > n[j]? n[j++] : m[i++];         
	      } // while
	      
	      if (i == m.length) { // 남은 배열 n
	         System.arraycopy(n, j, mn, k, n.length-j);
	      } else {  // 남은 배열 m
	         System.arraycopy(m, i, mn, k, m.length-i);
	      } // if
	      
	      System.out.println( Arrays.toString(mn));
	      return mn;
	   }

}
