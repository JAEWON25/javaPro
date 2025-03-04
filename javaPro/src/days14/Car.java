package days14;

//신형 자동차 클래스 선언
public class Car {

	//필드
	//멤버 변수
	String name; //자동차명
	int speed; //속도
	int wheelCount; //바퀴수
	
	//메서드
	public void dispInfo() {
		System.out.printf(">차명 %s, 속도 %d, \n", name, speed);
	}

}
