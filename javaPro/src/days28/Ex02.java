package days28;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Ex02 {

	public static void main(String[] args) {
		
		//함수형 인터페이스               문자열 s 매개변수로 받아서 int 반환하는 람다식.
//		Function<String, Integer> f = s -> Integer.parseInt(s); //하나이니 메서드 참조 가능
		Function<String, Integer> f = Integer::parseInt; //메서드 참조  ( 위에 코드랑 같은 코드이다.)
		
		//[메서드 참조 3가지 방식]
//		BiFunction<String, String, Boolean> f2 = (s1, s2) -> s1.equals(s2); //String 두개 받아서 같은지 보겠다(Boolean)
		BiFunction<String, String, Boolean> f2 = String::equals; //메서드 참조
		
		MyClass obj = new MyClass();
//		Function<String, Boolean> f3 = (x) -> obj.equals(x);
//		3번 방식 특정 객체 인스턴스 메서드 참조 어떻게 참조하는지          -특정객체::메서드명
		Function<String, Boolean> f3 = obj::equals;
		
		//[생성자의 메서드 참조]
//		Supplier<MyClass> s = () -> new MyClass();
		Supplier<MyClass> s = MyClass::new; //메서드참조
//		BiFunction<Integer, String, MyClass> s2 = (i, str)-> new MyClass(i, str);
		BiFunction<Integer, String, MyClass> s2 =  MyClass::new; //<Integer, String, MyClass> 매개변수 2개 오는걸 알수있다. 생성자 2개부른다.
		
		//[배열의 메서드 참조]
//		Function<Integer, int[]> f4 = x-> new int[x];
		Function<Integer, int[]> f4 = int[]::new; //배열 생성 람다식
		
		
	}

}

class MyClass{
	
	public MyClass() {
		// TODO Auto-generated constructor stub
	}
	public MyClass(Integer i, String s) {
		// TODO Auto-generated constructor stub
	}
	
}