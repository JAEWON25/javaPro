package days01;

//import java.lang.System;
//import java.lang.*;
/**
 * @author jaewon
 * 	- 이클립스 단축키 설명
 * 	- 주석 처리 3가지 방법
 *  	1)한 줄
 *  	2)여러 줄 
 *   	3)Javadoc 주석
 *
 */
public class Ex02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("양재원");
		System.out.println("양재원");
		System.out.println("양재원");
		/*
		 * 1. 자바는 객체 지향적 프로그램 언어이다.
		 * 				object oriented Programming
		 * 				(OOP)
		 * 2. class = 부품(객체 ==object)설계도
		 * 		Sample.java 소스파일
		 * 		javac Sample.java -> Sample.class 컴파일
		 * 		java Sample 실행 -> JRE(JVM) -> Sample클래스 시작개체 찾는다.
		 * 
		 * 3. 자바 클래스 선언 형식
		 * 		접근지정자**
		 * 		public class Ex02{}
		 * 		[public] 생략가능
		 * 		[기타 제어자] 
		 * 
		 * 		[접근지정자][기타 제어자] class 예약어 클래스명{ 클래스 몸체}
		 * 
		 * 		-클래명은 반드시 첫 문자 -> 대문자 시작
		 * 		식별자-> (클래스명)
		 * 		자바에서 식별자를 명명하는 규칙
		 * 		:문자 or $ or _로 시작해야됌(숫자x)
		 * 		camel case: totalAmount(클래스명은아님) 매서드명
		 * 
		 * 		4. 자바에서 메서드를 선언 형식
		 * 			public static void main(String[] args)
		 * 			[접근지정자][기타제어자]리턴자료형 메서드명([매게변수}){메서드몸체}
		 * 
		 * 			매게변수, 파라미터: 일을 시킬때 줘야되는 값
		 * 			리턴값(반환값): 함수가 돌려주는값. [return 리턴값.]
		 * 			
		 * 			물건의 설계도: 클래스
		 * 			매서드 = 어떤 물건 부품, 가지는 기능.
		 * 
		 * 			메서드 3가지 기능*******
		 * 			1) 기능: 프로그램의 시작, 종료(main)
		 * 			2) 매개변수(파라미터)
		 * 			3) 리턴값.
		 * 		
		 * 		1. 반드시 시작개체 클래스 선언 
		 * 			ㄴ [접근 지정자][기타제어자] class 클래스명{}
		 * 		클래스명 = 파일명
		 * 		2. 프로그램 진입점 필요: 이것의 이름 메인 메서드.
		 * 		
		 * 		패키지: 관련된 클래스들을 묶어서 관리하기 쉽게 
		 * 				만들어 주는 역할
		 * 		
		 * 		java.lang.System.out.println(); 
		 * 		lang: 물건 설명서
		 * 
		 * 		java.lang 패키지명 system이란 클래스를 가진 명
		 * 
		 * 		ctrl + shift + o 드래그한 모든 클래스들에 대한 패키지들 모두 import해줌
		 * 
		 * 		exo1이라는 클래스들을 관련있는 days01 package로 묶는다.
		 * 
		 * 
		 * 		import는 다른 패키지에 있는 클래스나 현재 클래스에서 사용할 수 있도록 가져오는데 사용.
		 * */
	}//main

}//class
