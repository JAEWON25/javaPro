package days26;

import java.util.Arrays;
import java.util.Scanner;

public class days26_test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] bars = new int[n];
		for (int i = 0; i < bars.length; i++) {
			bars[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(bars));
		int cnt = n;

		System.out.println(cnt);
		int value = bars[0];
		for (int i = 1; i < bars.length; i++) {
			if (value != bars[i]) {
				System.out.println(n - i);
				value = bars[i];
			}
		}

	}

}
