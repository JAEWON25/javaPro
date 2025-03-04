package days14;

public class Ex03 {

	public static void main(String[] args) {
		//m: 변수, 참조변수, 배열명
		int [] m;
		// 변수 선언 형식
		//자료형 변수명[=초기값];
		
		//myCar : 지역 변수, 참조변수, 객체명(이게 제일 정확)
		//클래스? 객체의 설계도             Car 
		// 객체 ? 클래스로 선언된 참조변수    myCar
		Car myCar;
		myCar = new Car(); //. Car가 자료형 .  이 코딩이 인스턴스화 하는것.
		//인스턴스 -> new연산자로 클래스의 객체가 실제 힙 영역에 생성된것.
		//객체는 myCar
		//클래스 Car
		
		//접근 방법
		//객체명.필드명
		//객체명.메서드명();
		myCar.name = "K9";
		myCar.dispInfo();
		
		//클래스안에 필드들은 알아서 초기화되어있다.

	}

}
