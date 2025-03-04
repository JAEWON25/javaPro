package days18;

// 외부클래스 > 내부 클래스
public class Ex03_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//a에 접근하려면
		Outer2 outer = new Outer2();
		Outer2.InstanceInner ii = outer.new InstanceInner();
		ii.a = 100;
		System.out.println(ii.a);
		
		
		System.out.println(Outer2.StaticInner.c);
		Outer2.StaticInner si = new Outer2.StaticInner();
		si.b = 200;
		System.out.println(si.b);

	}

}

class Outer2{//외부클래스
	
	static int x = 100;
	
	class InstanceInner{//1
		int a = 10; //a
	}
	
	static class StaticInner{//2
		int b = 20; //b
		static int c = 30; //c
	}
	
	void method() {
		class LocalInner{//3
			int iv = 40;
		}
	}
}