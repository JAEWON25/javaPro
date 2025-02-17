package days04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BuffedReader br 키보드로부터 입력
		//[Scanner 클래스]
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("> 정수 (n)입력? ");
		int n = sc.nextInt();
		System.out.println(n);
		*/
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("> 이름 국어 영어 수학 입력 ? ");//홍길동 90 87 65
		
		name = sc.next(); //string 을 읽어옴
		kor = sc.nextByte();
		eng = sc.nextByte();
		mat = sc.nextByte();
		
		tot = (short)(kor + eng + mat);
		
		avg = (double)tot / 3;
		
		

	}

}
