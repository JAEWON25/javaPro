package days05;

/**
 * @author J1
 * @date 2025. 2. 7. - 오전 11:09:23
 * @subject
 * @content 조건반복문 while문
 */
public class Ex04 {
	
	public static void main(String[] args) {
		
		//1~10 = 55
		//조건이 참일 동안 실행된다.while (condition)
		
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			
			System.out.printf("%d+", i);
			sum += i;
			//sum += ++i; 65나옴
			//sum += i++; 55 잘나온다.
			//i++;
		}//while
		
		System.out.printf("=%d", sum);
		
		/*
		do {
			
		}while(condition); //조건이 참이든 거짓이든 한번은 실행한다.
		
		*/
		
		
	} //main

}
/* for문
int sum = 0;
for(int i = 1; i <= 10; i++) {
	System.out.printf("%d+", i);
	sum += i;
}

System.out.printf("=%d", sum);
*/