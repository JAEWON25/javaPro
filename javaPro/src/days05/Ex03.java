package days05;

public class Ex03 {
	
	public static void main(String[] args) {
		//[문제] 1 + 2 + 3+ ...+9+10 = 55(for문)
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
		
		System.out.printf("=%d", sum);
		
	} //main

}
/*
int i;
for(i = 1; i <= 10; i++) {
	System.out.println(i);
	//i는 지역변수니까 int i를 for문 밖에다 선언.
}
System.out.println(">>빠져나올떄의 i="+i);
*/