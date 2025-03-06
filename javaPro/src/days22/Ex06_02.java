package days22;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex06_02 {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.add("양재원");
		list.add("서주원");
		list.add("안우혁");
		list.add("이정인");
		
		//[양재원, 서주원, 안우혁, 이정인] 순서 유지중
		System.out.println(list);
		
		list.addFirst("김현태");
		list.addLast("박지웅");
		
		//[김현태, 양재원, 서주원, 안우혁, 이정인, 박지웅]
		System.out.println(list);
		
		//양재원 서주원 사이에 홍길동 추가하고싶다.
		list.add(2, "홍길동");
		System.out.println(list); 
		//[김현태, 양재원, 홍길동, 서주원, 안우혁, 이정인, 박지웅]
		
//		[2]
//		int index = list.indexOf("서주원");
//		list.add(index, "홍길동");
		
		//안우혁 삭제
		int index = list.indexOf("안우혁");
		list.remove(index);
		
		System.out.println(list);
		
		//내림차순으로 반복자 사용 (뒤에 박지웅부터 읽어오겠다.)
		Iterator ir = list.descendingIterator();
		while(ir.hasNext()) {
			String name = (String)ir.next();
			System.out.println(name);
		}
		
		//첫번째로 일치하는 객체를 제거..
		list.removeFirstOccurrence("홍길동"); //홍길동이 없어진다.
		
		//[김현태, 양재원, 서주원, 이정인, 박지웅]
		System.out.println(list);
		

	}

}
