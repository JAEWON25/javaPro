package days08;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x , y, result;
		Scanner scanner = new Scanner(System.in);
		System.out.print("x, y input: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		result = sum(x, y);
		
		System.out.printf("%d+%d=%d\n", x ,y , result);
	}
	//메소드 선언 부분
	private static int sum(int x, int y) {
		//int result = x + y;
		//return result; //return 수식 가능.
		return x + y;
	}

}
