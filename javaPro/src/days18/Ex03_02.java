package days18;

public class Ex03_02 {
	
	//인스턴스 클래스 //내부 클래스 Ex03_02
	class InstanceClass{
		int iv = 100; //인스턴스 변수를 선언 o
		
		//The field cv cannot be declared static in a non-static inner type, 
		//unless initialized with a constant expression
		//static int cv = 100;  -> 인스턴스 클래스안에서는 static변수 사용할 수 없다.
		
		final static int COUNT = 100; //상수 선언 o
	}
	static class StaticInner{
		
		int iv = 100; //선언 O
		static int cv = 100;//선언 O
		final static int COUNT = 100;//선언 O
	}

	void method() {
		//3.로컬 클래스
		class LocalInner{
			int iv = 100;//선언 O
			//static int cv = 100;//선언 x
			final static int COUNT = 100;//선언 O
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
