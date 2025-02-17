package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05_02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//[문제]
		//국어 점수를 키보드로부터 입력받아서 
		//변수에 저장하고 
		//"국어=90"이라고 출력하는 코딩을 하자.
		
		byte kor = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어 점수 입력: ");
		//Type mismatch: cannot convert from int to byte
		//byte로 맞추자 
		
		//String strKor =  br.readLine();
		//kor = Byte.parseByte(strKor);
		
		//String "90" -> byte 90 변환.
		kor = Byte.parseByte(br.readLine());
		
		System.out.printf("국어 = %d\n", kor);
		//System.out.println("국어 = "+ kor );
		
		

	}

}
