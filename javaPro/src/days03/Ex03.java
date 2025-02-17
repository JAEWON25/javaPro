package days03;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[시험] 두 기억공간의 값을 바꾸기
		int x = 10, y =20;
		
		System.out.print(" x =" + x);
		System.out.print(" y =" + y);
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.print(" x =" + x);
		System.out.print(" y =" + y);

	}

}
