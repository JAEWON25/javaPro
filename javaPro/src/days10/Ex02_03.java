package days10;

import java.util.Scanner;

public class Ex02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("금액 입력: ");
		Scanner scanner = new Scanner(System.in);
		int unit = 50000;
		boolean sw = false;
		int num =0;
		int money1 = scanner.nextInt();
		int money = 125760;
		
		while(unit >= 1) {
			num = money / unit;
			System.out.printf("%d원 : %d개 \n", unit, num);
			money %= unit;
			unit = unit / (sw ? 2: 5);
			sw = !sw;
		}
	

	}

}
