package days28;

import java.util.function.Function;
import java.util.function.Predicate;

public class Ex01 {

	public static void main(String[] args) {
		
		/* [1]
		// 람다식을 참조하기위한게 함수형 
		//f -> 16진수 형태의 문자열을 입력받아서 int 변환해서 반환.
		Function<String, Integer> f = s -> Integer.parseInt(s, 16); //문자열을 입력받아서 인티지로 변환해서 반환하는 람다식.
		
		//g : int 입력받아서 2진수 문자열로 반환하는 것.
		Function<Integer, String> g = i -> Integer.toBinaryString(i); 
		
		// 1) f 2)g  1 andThen(2)
		Function<String, String> h = f.andThen(g); //순서 f -> g
		System.out.println(h.apply("FF")); //16진수를 정수로 변환 다시 2진수형태의 문자열로 변환.//11111111
		Function<String, String> h2 = f.compose(g);   //순서 g -> f
		*/
		
		/*[2]
		//and() &&    or() ||    negate() !
		Predicate<Integer> p = i -> i<100;//매개변수가 integer이고 리턴이 boolean형인 메서드 -> predicate
		Predicate<Integer> q = i -> i<200;
		Predicate<Integer> r = i -> i%2 == 0;
		Predicate<Integer> notP = p.negate(); //부정
		Predicate<Integer> all = notP.and(q.or(r));
		System.out.println(all.test(150)); //true
		*/
		
		//[3]
		String s1 = "abc";
		String s2 = "abc";
		
		Predicate<String> p2 = Predicate.isEqual(s1);
		boolean result = p2.test(s2); //s1.equals(s2);
		System.out.println(result); //true


	}

}
