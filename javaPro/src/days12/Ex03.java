package days12;

import java.util.Arrays;
import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] m = new int [10];
		for (int i = 0; i < m.length; i++) {
			m[i] = i+ 1;
		} //for i
		System.out.println(Arrays.toString(m));
		
		shuffle(m); //배열을 무작위로 섞는 함수
		
	}

	private static void shuffle(int[] m) {
		// TODO Auto-generated method stub
		int idx ;
		int idx2 ;
		Random rnd = new Random();
		for(int i = 0, temp;i < 10; i++) {
			idx = rnd.nextInt(m.length);
			idx2 = rnd.nextInt(m.length);
			
			if(idx == idx2) i--; // for문 카운트x 하자
			else {
				System.out.printf("%d - %d \n", idx, idx2);
				temp = m[idx];
				m[idx] = m[idx2];
				m[idx2] = temp;
			}
		}
		System.out.println(Arrays.toString(m));

	}

}
