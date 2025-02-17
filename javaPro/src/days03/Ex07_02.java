package days03;

public class Ex07_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//산술 연산자 + - * /
		
		int i = 10, j = 3;
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println((double)i/j);
		System.out.println(i % j);
		
		//System.out.println( 10 / 0 ); //by zero at javaPro/days03.Ex07_02.main(Ex07_02.java:16)
		//System.out.println( 10 % 0 ); //0으로 나머지, 나누기 연산 불가.
		
		System.out.println( 10.0 / 0 ); //무한대
		System.out.println( 10.0 % 0 ); //not a number  (실수를 0으로 나눌때 정수를 0으로 나눌때가 다르다.)

	}

}
