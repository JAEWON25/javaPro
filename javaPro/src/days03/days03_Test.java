package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class days03_Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int x = 1, y = 2;
		
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.printf("x = %d, y = %d", x, y);
	}

}
