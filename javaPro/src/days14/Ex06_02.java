package days14;

public class Ex06_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y =20;
		
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;
		
		System.out.print(" x =" + p1.x);
		System.out.print(" y =" + p1.y);

		//call by value
		swap(p1);
		
		System.out.print(" x =" + p1.x);
		System.out.print(" y =" + p1.y);

	}
	private static void swap(Point p) {
		// TODO Auto-generated method stub
		int temp = p.x;
		p.x = p.y;
		p.y = temp;
		
	}
}
class Point{
	
	//필드만 가지고 있는 클래스
	//멤버변수만 가지고있는
	int x;
	int y;
}