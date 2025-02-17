package days06;

public class Ex03 {
	
	public static void main(String[] args) {
		//[for] 1 +~10 =55
		//홀수의 합을 구하자
		int sum = 0;
		int i = 0;
	
		
		while(i++ < 11) {
			
			if(i % 2 == 0) continue;
			System.out.printf("%d+", i);
			sum += i;
			
			
		}
		
		System.out.printf("\b=%d", sum);
		
		
	} //main

}
