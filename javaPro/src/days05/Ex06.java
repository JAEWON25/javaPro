package days05;

public class Ex06 {
	
	public static void main(String[] args) {
		
		//[while] 1~10까지 합출력
		
		int i = 1;
		int sum = 0;
		
		while (true) {
			
			if(i == 11) break;
			sum += i;
			System.out.printf("%d+", i);
			i++;
		}
		
		System.out.printf("\b=%d", sum);
		
		
	} //main

}
