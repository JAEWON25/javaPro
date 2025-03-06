package days22;

import java.util.HashSet;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* C-> Set -> HashSet 클래스
		 * 
		 * 
		 * */
		
		HashSet hs = new HashSet();
		hs.add(9);
		hs.add(1);
		hs.add(15);
		hs.add(15); //예외 발생 x
		hs.add(15);
		hs.add(null);
		hs.add(null);
		
		//[null, 1, 9, 15]
		//15가 중복되지않았고 한번만 추가되었다. -> 중복허용 x
		//순서 유지 x 
		//
		System.out.println(hs);
	}

}
