package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author J1
 * @date 2025. 2. 5. - 오후 2:12:51
 * @subject  
 * @content  형변환
 */
public class Ex06_02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Type Convert( 형 변환)
		//1) 자동 형 변환
		//2) 강제 형 변환
		// int -> byte
		// byte -> long
		
		//[문제]
		// 이름, 국어, 영어, 수학 점수를 입력받아서
		//총점
		//평균
		//출력
		//이름="홍길동", 국어=90, 영어=89, 수학=77, 총점=256, 평균=85.33
		
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 입력: ");
		name =  br.readLine();
		
		System.out.print("국어 입력: ");
		kor = Byte.parseByte(br.readLine());
		
		System.out.print("영어 입력: ");
		eng = Byte.parseByte(br.readLine());
		
		System.out.print("수학 입력: ");
		mat = Byte.parseByte(br.readLine());
		
		//Type mismatch: cannot convert from int to short
		//왜 kor + eng + mat는 int형으로 계산되는가: 컴퓨터가 연산할때 integer로 계산한다. cpu처리때문에.
		tot = (short)(kor + eng + mat);
		
		avg = (double)tot / 3;
		
		System.out.printf("이름 =%s, 국어 = %d, 영어 = %d, 수학 = %d, 총점 = %d, 평균 = %.2f", 
				name, kor, eng, mat, tot, avg);

	}

}
