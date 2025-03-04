package days15;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 * [0][0][0x300]                [0x100]
		 * x   y                          p1
		 * 0x100
		 * 
		 * [10][20][0x300]              [0x200]
		 * x    y                        p2
		 * 0x200
		 * 
		 * 
		 *                    [dispMyPoint]
		 *                     0x300
		 * 
		 * */
		
		/*
		MyPoint p1 = new MyPoint();
		
		p1.dispMyPoint();
		
		MyPoint p2 = new MyPoint();
		
		p2.x=10;
		p2.y=20;
		p2.dispMyPoint();
		
		//x, y 좌표값을 내가 준 값 만큼 이동
		p1.offsetPoint(100);
		p1.dispMyPoint();
		
		p1.offsetPoint(p2);
		p1.dispMyPoint();
		
		//x좌표만 이동하고싶다
		int x = p1.plusPoint(10); //int 기본형 반환하는 리턴자료형
		System.out.println(x);
		
		MyPoint p3 = p1.offsetPoint(5);
		p3.dispMyPoint();
		*/
		MyPoint p1 = new MyPoint();
		p1.x=10;
		p1.y=20;
		
		//MyPoint p2 = p1.offsetPoint(100);
		p1.offsetPoint(100).dispMyPoint(); //두개 연달아 호출하는걸 chaining이라고 한다.
		//새로운 객체가 넘어온다 (p1) 이 아닌다. 110, 120 나온다.
		
		//p1.plusPoint(100).dispMyPoint(); 리턴 자료형이 int이기 때문에 안된다.

	}

}
