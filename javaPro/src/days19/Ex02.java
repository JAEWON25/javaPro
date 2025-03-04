package days19;

public class Ex02 {

	public static void main(String[] args) {
		//Object의 메소드
		// [5] Clone
		
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		
		//java.lang.CloneNotSupportedException
		//
		try {
			//Type mismatch: cannot convert from Object to Point 
			//(Point)로 다운 캐스팅
			//Point p3 = (Point)p1.clone();
			Point p3 = p1.clone(); //jdk1.5부터 공변 반환 타입추가 따라서 다운캐스팅 필요x
			System.out.println(p3);
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		} 

	}

}

//복제하려면 implements Cloneable 필요
class Point extends Object implements Cloneable{
	int x;
	int y;
	
	
	public Point() {
		super();
	}


	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Point) {
			Point p = (Point)obj;
			return this.x==p.x && this.y == p.y;
			
		}
		
		return false;
	}

	//CloneNotSupportedException -> checked 예외
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// return 타입 object -> 다운캐스팅필요
//		
//		Object obj = null;
//		
//		obj = super.clone();
//	
//		return obj;
//	}
	
	//jdk1.5부터 공변 반화 타입 추가
	//오버라이딩 주의할 점 - 부모의 리턴자료형, 매기변수 등등 지켜야됐다
	//부모의 리턴자료형 -> 자식리턴자료형 변경..
	@Override
	protected Point clone() throws CloneNotSupportedException {
		// Point로 바꿔도 된다.
		
		Point obj = null;
		
		obj = (Point)super.clone();
	
		return obj;
	}


	@Override
	public String toString() {
		return String.format("(x=%d, y=%d)", this.x, this.y);
	}
	
}