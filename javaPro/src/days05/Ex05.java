package days05;

public class Ex05 {
	
	public static void main(String[] args) {
		
		
		int sum = 0;
		for(int i = 10; i > 0; i--) {
			
			System.out.printf("%d+", i);
			
			sum += i;
		}

		System.out.printf("=%d", sum);
		//System.out.printf("\b=%d", sum); 뒤에 + 가 나오지않는다.
		
		
	} //main

}


