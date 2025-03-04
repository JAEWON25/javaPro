package days18;


import java.util.Random;

public class Ex05_03 {

	public static void main(String[] args) {
		// [예외 처리] try - catch
		int number = 100;
		int result = 0;
		
		int [] m = new int[5];
		
		Random rnd = new Random();
		int n = -1;
		for (int i = 0; i < 10; i++) {
			
			try {
				n = rnd.nextInt(5); //0<= 정수 < 5
				
				// n = 0이면 예외발생. 
				//Arithmetic exception
				result = number / n;  
				
				m[i] = result; //
				
				System.out.println(result);
			} catch (Exception e) { //(Arithmetic exception
				System.out.println(e.toString());
			} //예외처리
			
		} //for i
	}
}
