package days25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		
		/*[1]
//		System.in.read(); //키보드로부터 한 문자 입력..
//		표준입력장치(키보드)로부터 읽어 들일수있는 입력 바이트 스트림(0, 1 값으로..)
		InputStream is = System.in;
		
		System.out.print(">한 문자 입력: ");
		int b = is.read(); //바이트 정수값
//		System.out.printf("%d-%c\n", b, b); //>한 문자 입력: a -> 97-a 
		System.out.printf("%1$d-%1$c\n", b);
		*/
		/*
//		[2]
		System.out.printf(">이름을 입력 : ");
		String name;
		//Scanner 사용
		//InputStream Systemin : 바이트 스트림
		//InputStream[Reader] 클래스 : 문자 스트림
		//Buffered[Reader] 클래스 : 문자 스트림
		
		// 키보드 -> System.in 표준 바이트스트림 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(">이름입력 ");
		name = br.readLine();
		System.out.println(name);
		*/
		
//		[3]
		InputStream is = System.in;
		
		System.out.print(">한 문자 입력: ");
//		int b = is.read(); //바이트 정수값
//		System.out.printf("%d-%c\n", b, b); //>한 문자 입력: a -> 97-a 
//		System.out.printf("%1$d-%1$c\n", b);
		
		//scanner, br사용하지않고
		//[문제] > 이름 입력: 홍길동
		byte [] b = new byte[3];
		int n = is.read(b);
		
		for (byte c : b) {
			System.out.println(c);
		}
		
		char one = new String(b).charAt(0);
		System.out.println(one); //홍
		
		
		

	}

}
