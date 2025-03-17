package days29;

import java.util.Optional;
import java.util.OptionalInt;

public class Ex01 {

	public static void main(String[] args) {
		//[Optional<T>와 Optional[int]
		Optional<String> opStr = Optional.of("abcde"); //of 써서 Optional 객체 만들었다. "abcde"문자열 -> optional객체로 생성
		//map() 메서드 사용.
		Optional<Integer> opInt = opStr.map(String::length); //map메서드로 또다른 스티링 객체로 변환하겠다. 문자열의 길이를 나타낸다. 길이를 opInt에 담겠다.
		
		//get() 메서드로 값을 얻어고기
		System.out.println("opStr = "+ opStr.get()); //opStr = abcde
		System.out.println("opStr = "+ opInt.get()); //opStr = 5
		
		int result1 =  Optional.of("123").filter(x->x.length() > 0).map(Integer::parseInt).get();
		System.out.println("result = " + result1); //result = 123
		
		int result2 =  Optional.of("").filter(x->x.length() > 0).map(Integer::parseInt).orElse(-1); 
		System.out.println("result = " + result2); //result = -1
		
		Optional.of("456").map(Integer::parseInt).ifPresent(x -> System.out.printf("result3=%d\n", x)); //result3=456
		
		OptionalInt optInt1 = OptionalInt.of(0); //0 저장한 객체
		OptionalInt optInt2 = OptionalInt.empty(); //빈 객체 생성
		
		System.out.println(optInt1.isPresent()); //null x -> true
		System.out.println(optInt2.isPresent()); //null 0 -> false
		
		System.out.println(optInt1.getAsInt());
		System.out.println(optInt1.equals(optInt2));
		
		Optional<String> opt1 =  Optional.ofNullable(null);
		Optional<String> opt2 =  Optional.empty();
		
		System.out.println(opt1); //Optional.empty
		System.out.println(opt2);
		System.out.println(opt1.equals(opt2)); //true

	}

}
