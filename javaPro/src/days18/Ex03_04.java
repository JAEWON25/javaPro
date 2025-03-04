package days18;

public class Ex03_04 {
	
	private int outerIv = 0;
	static int outerCv = 0;
	
	//1
	class InstanceInner{
		//외부 캘래스의 멤버를 마치 자기 자신 멤버처럼 사용
		int a = outerIv; //이렇게 하려고 안에 클래스 선언
		int b = outerCv;
	}
	
	//2
	static class StaticInner{
		
		//static클래스에서 외부클래스의 인스턴스 멤버에 접근할 수 없다.
		//int a = outerIv;
		int b = outerCv;
	}
	
	void method01() {
		int lv = 0;
		final int LV = 0;
		//3
		class LocalInner{
			int c = outerIv; //외부 클래스의 모든 멤버 접근가능
			int d = outerCv;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
