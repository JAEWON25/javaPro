package days08;

public class Ex10 {
	
	//매개변수를 가지고 메서드를 호출하는 방법
	//1. call by Name       매개변수없이 drawLine();
	//2. call by value		sum(10); isLeapYear(i);
	//3. call by reference  배열, 인터페이스, 클래스

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y =20;
		
		System.out.print(" x =" + x);
		System.out.print(" y =" + y);
		/*
		int temp = x;
		x = y;
		y = temp;
		*/
		
		//call by value
		swap(x, y);
		
		System.out.print(" x =" + x);
		System.out.print(" y =" + y);


	}

	private static void swap(int x, int y) {
		// TODO Auto-generated method stub
		int temp = x;
		x = y;
		y = temp;
		
	}

}
