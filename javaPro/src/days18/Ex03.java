package days18;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Outer{
	//필드
	int iv = 0;        //인스턴스 변수
	static int ic = 0; //클래스 변수(static 변수)
	class InstanceClass{ //인스턴스 클래스
		// 주로 Outer(외부 클래스)의 인스턴스 멤버들과 관련된 작업을 더 용이하게하기위한 목적
		//접근이 편해지기위해서
		
	}
	static class StaticClass{ //2. 정적 클래스
		//주로 외부클래스의 static멤버들과 관련된 작업을 할 목적
		//static 멤버처럼 다루어진다.
		
	}
	{
		//인스턴스 초기화 블럭
		class LocalClass2{
			//3. 지역(로컬) 클래스
		}
	}
	void disp() {
		class LocalClass{//3. 지역 클래스(메서드안에 선언)
			//지역 변수처럼 해당 지역(영역)에서만 사용되는 클래스
			
		}
	}
}