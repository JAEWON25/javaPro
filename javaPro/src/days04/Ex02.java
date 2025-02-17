package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//[문제] 두 문자열 비교
		//System.out.println( 3 ==5) ; //false
		String n1 = "홍길동";
		String n2;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(">이름(n2) 입력 ? ");
		n2 = br.readLine();
		System.out.printf(">n2 = [%s]\n", n2);
		
		//System.out.println(n1 == n2); //false
		//두 문자열 비교할 떄는 == 비교 연산자를 사용하지않는다.
		//String 클래스의 equals()메서드를 사용한다.
		
		System.out.println(n1.equals(n2));
		System.out.println(n1.equals(n2)?"같다":"다르다");

	}

}
