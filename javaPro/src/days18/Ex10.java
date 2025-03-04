package days18;

import days15.MyPoint;

public class Ex10 {

	public static void main(String[] args) {
		// Object 클래스 설명
		// 모든 클래스의 최상위 부모 클래스
		
		/* [1]
		Value v1 = new Value(10);
		int hashCode = v1.hashCode(); //객체 자신의 해쉬코드(고유한) 값
		System.out.println(hashCode);
		
		Value v2 = new Value(10);
		hashCode = v2.hashCode(); //객체 자신의 해쉬코드(고유한) 값
		System.out.println(hashCode);
		
		Value v3 = new Value(10);
		hashCode = v3.hashCode(); //객체 자신의 해쉬코드(고유한) 값
		System.out.println(hashCode);
		*/
		
		/* [2] getClass /
		Value v1 = new Value(10);
		Class cls = v1.getClass(); //v1 객체의 클래스 정보를 [C]lass 반환하는 메서드.
		String fullName = cls.getName(); //fullname은 패키지명까지 다 적는것.
		System.out.println(fullName);//days18.value
		//메서드, 생성자, 필드등 모든 클래스 정보를 얻어올 때 사용하는 메서드
		
		[3] toString
		System.out.println(v1.toString()); //객체 자신의 정보를 문자열으로 반환하는 메서드 days18.Value@3ac3fd8b
		System.out.println(v1); //toString 생략가능 (위에랑 의미가 같다.) days18.Value@3ac3fd8b
		
		System.out.printf("%s@%x", cls.getName(), v1.hashCode()); //days18.Value@3ac3fd8b
		*/
		
		//[4] equals()
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		//v1객체와 v2객체가 같나?
		System.out.println(v1 == v2);//false
		Value v3 = v1; //클래스 복사 -> 인스턴스가 같다
		System.out.println(v1 == v3); //true
		
		//Object.equals() 메서드를 오버라이딩하지않으면 ==연산자와 동일한 기능이다.
		//오버라이딩 int value 필드 필드값이 같으면 같은 객체이다..true
		System.out.println(v1.equals(v2)); //false
		System.out.println(v1.equals(v3)); //true
		
		MyPoint p1 = new  MyPoint(1,2);
		Value v4 = null;
		System.out.println(v1.equals(v4)); //true
		
		System.out.println(v1.toString()); //toString 생략가능하다.
		System.out.println(v1); //[value] = 10
	}

}

class Value extends Object{ //extends Object 생략가능
	
	

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Value && obj != null) {
			Value v = (Value)obj;//다운 캐스팅
			return v.value == this.value; //매개변수 객체 == v1
		}
		return false;
	}

	@Override
	public String toString() {
		return String.format("[value=%d]", this.value);
	}

	//필드
	int value;
	
	//생성자
	public Value(int value) {
		this.value = value;
	}
	
	//메서드 x
}