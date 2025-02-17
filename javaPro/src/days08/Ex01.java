package days08;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[정보처리기사 문제]
		//1+2+4+7+11+... ?? = ???
		// 1 2 3 4 5
		
		int sum = 0;
		int num = 1;
		int n = 1;
		
		System.out.printf("%d+", num);
		while(num <= 100) {
			sum += num;
			System.out.printf("%d+", num);
			num += n;
			n++;
			
			
		}//while
		
		System.out.printf("\n=%d", sum);
		
		
		/*
		int sum = 0;
		int term = 1;
		int inc = 1;
		
		while(term <= 100) {
			
			sum += term;
			System.out.printf("%d+", term);
			
			term += inc++;
		}
		System.out.printf("=%d", sum);
		*/

	}

}
