package days22;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Ex11 {

	public static void main(String[] args) {
		//HashSet 컬렉션 클래스
//		HashSet<Integer> hs = new HashSet<Integer>();
		LinkedHashSet<Integer> hs = new LinkedHashSet<>(); //이렇게쓰면 순서 유지 o
		hs.add(new Integer(100));
		hs.add(20); //기본형은 오토박싱되니까 Integer없어지는거 안써도된다.
		hs.add(15);
		hs.add(30);
		hs.add(15); //중복 x
		hs.add(15);
		System.out.println(hs); //[100, 20, 30, 15] 순서 유지 x
	}

}
