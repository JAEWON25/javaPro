package days28;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex03 {

	public static void main(String[] args) {
		//[람다식와 스트림(Stream)]
		String [] strArr = {"aaa", "bbb", "ccc"};
		//for문 사용 처리
		
		List<String> strList = Arrays.asList("aaa", "bbb", "ccc");
		//iterator 반복자로 처리 
		
		// 하나의 방법으로 처리 ( 일괄적으로 처리 가능하다.)
		
		//배열 -> 스트림변환
		Stream<String> s1 = Arrays.stream(strArr);
		
		//컬렉션 -> 스트림 변환
		Stream<String> s2 = strList.stream();
		
//		s1.sorted().forEach((s) -> System.out.println(s));
		s1.sorted().forEach(System.out::println);
//		s1.forEach(System.out::println); 스트림은 1회성이라 한번쓰고나면 못써서 오류난다. 
		s2.sorted().forEach(System.out::println);

	}

}
