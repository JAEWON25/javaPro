package days18;

import java.io.IOException;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) throws IOException {
		// 예외처리 2번째 방법: throw[s]문 설명
		// 예외를 강제로 발생시키는 문: throw문 설명
		
		//System.in.read(); 이해
		//국어점수를 입력받아서 수~가 출력
		
		int kor = 0;
		kor = getScore();
		System.out.println("kor = "+ kor);
		System.out.println("end");

	}

	private static int getScore() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		
		System.out.println(">점수입력? ");
		String input = scanner.next();
		
		//0~100유효성검사
		String regex = "^([0-9]|[1-9][0-9]|100)$";
		
		if(input.matches(regex)) {
			score = Integer.parseInt(input);
		}else {
			//강제 예외 발생 시키겠다 : throw문 사용
			throw new IOException(">점수 범위 0-100~~"); //컴파일 예외
			//throw new ArithmeticException(">점수 범위 0-100~~"); //실행 예외
		}
		
		return score;
	}

}
