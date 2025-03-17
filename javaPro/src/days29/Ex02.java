package days29;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex02 {

	public static void main(String[] args) {
		// [스트림의 최종 연산]
		/*
	       *     1) forEach() 
	       *     2) 조건 검사 - allMatch(), anyMatch(), noneMatch(), findFirst(), findAny()
	       *     3) 통계 - count(), sum(), average(), max(), min()
	       *     
	       *     4) 리듀싱 - reduce()
	       *       (1) 스트림의 요소를 줄여나가면서 연산을 수행하고 최종결과를 반환한다.
	       *       (2) 매개변수의 타입 - BinaryOperator<T> 
	       *       */
		
		String[] strArr = {
		         "Inheritance", "Java", "Lambda", "stream",
		         "OptionalDouble", "IntStream", "count", "sum"
		      };
		
		//String [] -> Stream 변환
		//Stream<String>
		Stream.of(strArr).forEach(System.out::println);
		//조건 검사 최종 연산 : allMatch(), noneMatch()
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length() > 5); //false
		System.out.println(noEmptyStr);
		
		Optional<String> sword =  Stream.of(strArr).filter(s -> s.charAt(0) == 's').findFirst();
		System.out.println(sword.get()); //stream (s로 시작하는 첫번째 단어)
		
		//String<String[]> -> IntStream 으로 변환\
//		Stream.of(strArr) //스티림 객체로 만들기
		IntStream is1 = Stream.of(strArr).mapToInt(String::length); //각각의 문자열 길이를 가져오겠다.
		IntStream is2 = Stream.of(strArr).mapToInt(String::length);
		IntStream is3 = Stream.of(strArr).mapToInt(String::length);
		IntStream is4 = Stream.of(strArr).mapToInt(String::length);
		//스트림의 요소개수
//		is1.count();
		int count = is1.reduce(0, (a,b) -> a + 1);
		System.out.println(count); //8 (안에있는 문자열 개수)
		
		
		
		//문자열 총길이  (요소하나하나 길이 다 더한다)
		int sum = is2.reduce(0, (a,b) -> a + b);
		System.out.println(sum);
		
		int max = is3.reduce(0, (a,b) -> a>b?a:b);
//		OptionalInt max = is3.reduce(Integer::max);
		System.out.println(max);
		
		int min = is4.reduce(Integer.MAX_VALUE, (a,b) -> a>b?b:a);
		System.out.println(min);

	}

}
