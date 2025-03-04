package days15;

public class MyPoint {
	
	//필드
	//필드로 초기화하지 않으면 자료형의 기본값으로 초기화 되어져있다.
	public int x;
	public int y;
	
	
	//디폴드 생성자
	public MyPoint() {
		System.out.println("> MyPoint 디폴트 생성자 생성됌");
	}
	
	
	
	//메서드
	//p1.dispMyPoint();
	//p2.dispMyPoint();
	
	public MyPoint(int i, int j) {
		// TODO Auto-generated constructor stub
		//필드를 초기화하는 코딩..
		this.x = i;
		this.y= j;
	}

	public MyPoint plusMyPoint(MyPoint p) { //클래스 복사 /  p=p2
		x = x + p.x;
		y = y + p.y;
		return this; //3번째 용도(홀로 사용되는 this) p1주소를 넘겨준다.
		//MyPoint p3 = p1.plusMyPoint(p2) --> 이건 그냥 p1이라서 p1만 나온다
	}


	public void dispMyPoint() {
		System.out.printf("> x = %d, y=%d\n", this.x, this.y);
	}
/*
	public void offsetPoint(int i) { //int 라는 기본형을 매개변수로 사용중
		x += i;
		y += i;
		
	}
	*/
	
	public MyPoint offsetPoint(int d) { //참조형 리턴자료형 
		//x += d;
		//y += d;
		
		MyPoint p = new MyPoint(); //새 좌표값 저장
		p.x = x + d;
		p.y = y + d;
		return p;
	}
	
	
	//p1.x = p1.x + p2.x
	//p1.y = p1.y + p2.y
	// p1값들을 p2 좌표값만큼 이동시키겠다.
	public void offsetPoint(MyPoint p) {// 참조형 매개변수
		//p1.offsetPoint(p2)이므로 p1의 x이다. 여기서 p는 p2
		x = x + p.x;
		
	}

	public int plusPoint(int i) { //기본형 리턴 자료형
		
		return x + i; //p1의 x
		
	}

}
