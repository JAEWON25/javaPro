package days08;

public class Ex11 {

	public static void main(String[] args) {
		// 재귀함수
		disp();

	}
	
	//재귀함수
	private static void disp() {
		// TODO Auto-generated method stub
		System.out.println("disp() 호출됨");
		disp();
	}

}
