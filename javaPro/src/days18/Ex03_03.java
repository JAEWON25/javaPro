package days18;

public class Ex03_03 {//외부 클래스
	
	class InstanceInner{} //1
	static class StaticInner{}//2
	
	//외ㅣ의 인스턴스 멤버간에 서로 직접 접근 가능하다.
	InstanceInner ii = new InstanceInner();
	
	//외부의 static필드 선언
	static StaticInner si = new StaticInner();
	
	//인스턴스 메서드
	void method01() {
		class LocalInner{}//3. 로컬 클래스
		LocalInner li =  new LocalInner();
		//인스턴스 메소드 안에서 1, 2 사용
		InstanceInner ii = new InstanceInner(); //선언 o
		//static StaticInner si = new StaticInner(); //선언 x
	}
	
	static void method02() {
		//외보 클ㄹ래스 객체를 생성 후 사용 가능하다.
		//InstanceInner ii = new InstanceInner(); //선언 x
		StaticInner si = new StaticInner(); //선언 o
		Ex03_03 outer = new Ex03_03();
		InstanceInner ii = outer.new InstanceInner();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
