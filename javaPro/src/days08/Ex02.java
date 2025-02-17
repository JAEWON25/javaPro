package days08;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[정보처리기사] 피보나치수열 -> 10개항의 값 더하기
		// 출력형식 --> 1 + 1 + 2 + 3 + 5 + .. + ?? = ??
		/*
		int []arr = new int[10];
		arr[0] = 1;
		arr[1] = 1;
		int sum = 2;
		
		for(int i = 2; i < 10; i++) {

			arr[i] = arr[i -1] + arr[i-2]; 
			System.out.printf("%d+", arr[i] );
			sum += arr[i];
			
		}
		
		System.out.printf("=%d", sum);
		*/
		
		//두번쨰 방법 -- term : 항
		int firstTerm = 1, secondTerm = 1, thirdTerm;
		int sum = firstTerm + secondTerm; //2
		System.out.printf("%d+%d+", firstTerm, secondTerm);
		int termLength = 2;
		
		while(termLength  <= 10) {
			thirdTerm = firstTerm + secondTerm;
			System.out.printf("%d+", thirdTerm);
			sum += thirdTerm;
			
			firstTerm = secondTerm;
			secondTerm = thirdTerm;
			
			termLength++;
		}
		

	}

}
