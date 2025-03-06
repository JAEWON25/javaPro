package days22;

import java.util.Stack;

public class Ex07 {

	public static void main(String[] args) {
		// [stack]
		Stack s = new Stack();
		s.push("박지웅"); //1
		s.push("서주원"); //2
		s.push("안우혁"); //3
		s.push("최인식"); //4
		
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		//다 읽으면 이 후에 오류가 난다.
//		System.out.println(s.pop());
		
//		while(!s.empty()) {
//			System.out.println(s.pop());
//		}

//		s.clear();//모든 요소 제거 -> 예외 발생
//		System.out.println(s.peek()); //제거하지않고 읽어온다. 최인식
		
		System.out.println(s.search("서주원")); //3 -> 맨위부터 끄집어 내니까 서주원은 3번째에 있다.
		
		//push , pop, peek, isEmpty, seach


	}

}
