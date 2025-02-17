package days08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) throws IOException {
		
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		
		//System.out.print("이름 입력: ");
		name =  getName(scanner);
		kor = getScore(scanner, "국어");
		eng = getScore(scanner, "영어");
		mat = getScore(scanner, "수학");
		
		tot = getTotal(kor, eng, mat);
		
		avg = getAvg(tot);
		
		printScore(name, kor, eng, mat, tot, avg);
		
		System.out.println(name);
	

	}//main
	private static void printScore(String name, byte kor, byte eng, byte mat, short tot, double avg) {
		System.out.printf("이름 =%s, 국어 = %d, 영어 = %d, 수학 = %d, 총점 = %d, 평균 = %.2f", 
				name, kor, eng, mat, tot, avg);
		
	}
	private static double getAvg(short tot) {
		return (double)tot / 3;
	}
	private static short getTotal(byte kor, byte eng, byte mat) {
		return (short)(kor + eng + mat);
	}
	
	private static byte getScore(Scanner scanner, String subject) {
		//String.matches()메서드 사용해서 유효성 검사
		  byte score;
	      String strScore;
	      //String regex = "[0-9]{1,3}";
	      //String regex = "^(100)[1-9]?[0-9])$";
	      String regex = "^(100)[1-9]?\\d)$";
	      //
	      //{n} n번반복
	      //? 0번 아니면 1번
	      //[0-9]   \d 0에서부터 9까지
	      //[^0-9]  \D 대문자 d면 0에서부터 9까지 숫자중 하나가 오면 안된다.
	      
	      boolean isFirst = false;
	      do {
	         if (isFirst) {
	            System.out.print("[다시] ");
	         } // if
	         System.out.printf("> %s 점수 입력 ? ", subject);
	         strScore = scanner.next();
	         isFirst = true;
	      } while ( !strScore.matches(regex ) );
	      
	      score = Byte.parseByte(strScore);      
	      return score;

	}
	
	private static String getName(Scanner scanner) {
		//Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력하세요 ");
		String name = scanner.next();
		return name;
	}
	

}//class
