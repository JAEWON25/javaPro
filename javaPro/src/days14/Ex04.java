package days14;

public class Ex04 {

	public static void main(String[] args) {
		// [클래스 선언 시 앞에 붙는 접근지정자 설명](필드와 메서드)
		/*
		 * 클래스앞에 붙는 것들
		 * 1.public				 /패키지 내/외부에서 사용(참조, 상속) 가능
		 * 2.protected			 /비활성화 - 중첩(내부) 클래스를 선언시 활성화된다. / 패키지 내부에서만 사용(참조, 상속) 가능
		 * 						 /패키지 외부에서는 상속만 가능하다.
		 * 3.default(package)	 /패키지 내부에서만 사용(참조, 상속) 가능
		 * 4.private             /비활성화 - 중첩(내부) 클래스를 선언시 활성화된다. / 같은 파일 내에서만 사용(참조, 상속) 가능.
		 * 
		 * [클래스 선언시 앞에 붙는 기타제어자 설명]
		 * 1. abstract	활성화 : 추상 클래스
		 * 2.final		활성화 : 최종 클래스
		 * 3.static		비활성화: 정적 클래스
		 *
		 * */
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		p1.run();
		
		p1.age = 31;
		p1.run();

	}

}
