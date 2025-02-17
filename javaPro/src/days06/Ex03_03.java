package days06;

public class Ex03_03 {
	
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
	
		
		while(i < 11) {
			
			//if(i % 2 == 0) continue;
			System.out.printf("%d+", i);
			sum += i;
			i +=2;
			
		}
		
		System.out.printf("\b=%d", sum);
	} //main

}
