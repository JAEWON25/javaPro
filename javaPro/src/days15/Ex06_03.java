package days15;

public class Ex06_03 {

	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(1,2);
		MyPoint p2 = new MyPoint(100, 200);
		
		MyPoint p3 = p1.plusMyPoint(p2); 
		p3.plusMyPoint(p2).dispMyPoint(); //p1과 같다./ x = 101, y = 202
		p1.dispMyPoint();                 //x = 101, y = 202

	}

}
