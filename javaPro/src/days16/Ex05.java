package days16;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 변수 초기화
		 * 
		 * */
		
		
		Member m1 = new Member();
		System.out.println(m1.name);
		System.out.println(m1.age);
		
		Member m2 = new Member();
		System.out.println(m2.name);
		System.out.println(m2.age);
		

	}

}

class Member{
	//필드
	//필드중에서도 인스턴스 변수라한다.
	String name = "홍길동"; //명시적 초기화 (초기값을 주는것)
	int age = 20;
	int count;
	int serialNumber;
	
	//클래스 변수
	static double rate = 0.04;
	
	//생성자 (를 통한 초기화)
	//생성자가 오버로딩되어 있을 때 중복 코딩이 있다면 초기화 블럭 사용
	//[인스턴스 초기화 블럭]  초기화 블럭이 먼저 생성된다 . 그 다음 생성자
	{
		count++;
	    serialNumber = count;
	    System.out.println("인스턴스 초기화블럭");
	}
	
	//[클래스 초기화 블럭]
	//일괄적으로 클래스 변수를 초기화하기 위한 목적으로 사용
	static {
		System.out.println("클래스초기화 블럭");
	}
	
	Member(){
		//count++;
		//serialNumber = count;
		name = "무영"; //명시자 초기화 - > 객체 생성 후 무명으로 바뀐다.
		System.out.println(">member 디폴트 생성자 호출됨");
	}
	Member(String name){
		//count++;
		//serialNumber = count;
		this.name = "무영"; //명시자 초기화 - > 객체 생성 후 무명으로 바뀐다.
		System.out.println(">member 1 디폴트 생성자 호출됨");
	}
	
	
}