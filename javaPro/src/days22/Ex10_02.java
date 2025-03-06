package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex10_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet lotto = new HashSet();
		
		fillLotto(lotto);
		dispLotto(lotto);

	}

	private static void dispLotto(HashSet lotto) {
		
//		/* [3] set -> List 변환*/
		ArrayList list = new ArrayList(lotto);
		Collections.sort(list);
		Iterator ir = list.iterator();
		while(ir.hasNext()) {
			int n = (int)ir.next();
			System.out.printf("[%02d]", n);
		}
		System.out.println();
		
        /* [2] 배열로 만들어서 정렬
		Object [] arr = lotto.toArray();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		*/
		
		/* [1] [정렬 x , 순서 x]
		Iterator ir = lotto.iterator();
		while(ir.hasNext()) {
			int n = (int)ir.next();
			System.out.printf("[%02d]", n);
		}
		System.out.println();
		*/
		
	}

	private static void fillLotto(HashSet lotto) {
		Random rnd = new Random();
		int n = 0;
		while(lotto.size()<6) {
			n = rnd.nextInt(45) + 1; //로또 번호 중복허용안되어서 중복없다. 전 코드 확인.
			lotto.add(n); 
		}
		
	}

}
