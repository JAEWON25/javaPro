package days22;

import java.util.Enumeration;
import java.util.Vector;

public class Ex05 {

	public static void main(String[] args) {
		
		Vector v = new Vector(); //vector클릭후 f3 
		System.out.println(v.capacity()); //초기 용량 10
		System.out.println(v.size()); //요소의 개수 현재 0
		
		v.addElement("최승화");
		v.add("최인석"); //둘 같다
		v.addElement("김민선");
		
		System.out.println(v.size()); //3 
		
		v.trimToSize();
		System.out.println(v.capacity());// 용량 10 -> 3
		
		v.add("홍길동");
		System.out.println(v.capacity()); //6 (3개가 늘었다)
		System.out.println(v.size()); //4 
		
//		v.ensureCapacity(10);
//		System.out.println(v.capacity()); // 12 
		
		//첫 번째 요소 얻어오기
		System.out.println(v.get(0)); //최승화
		
		//ArrayList에서 안보였던 method
		System.out.println(v.elementAt(0)); // 동기화 v.get(0)과 같다
		Enumeration en = v.elements(); //열거자
		while (en.hasMoreElements()) { //true/false 요소를 더 가지고있냐
			String name = (String) en.nextElement(); // 다음 요소 얻어와라
			System.out.println(name);
		}
		
		//열거자/ 반복자의 차이점
		//반복자 : 반복적으로 요소를 처지 중에 요소가 수정.삭제.추가
		//        예외를 발생시킨다. (읽어오는동안은 요소가 변경되면 안된다.)
		//열거자 : 수정되어도 수정전 요소를 읽어온다.(복사된거 읽어온다.)
		
		v.remove(0);
		
		v.firstElement();
		v.get(0);
		v.elementAt(0); //3개 다 같다
		
		//마지막 요소
		v.lastElement();
		v.get(v.size()-1); 
		
		v.trimToSize();
		
//		v.set(0, en)
		
		

	}

}
