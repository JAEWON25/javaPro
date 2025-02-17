package days08;

public class Ex04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("-----------------"); //50줄 그었다고 가정.
		drawLine();
		System.out.println("부서명 : 사원명"); //50줄
		//System.out.println("-----------------");
		drawLine();
		System.out.println("영업부 : 이태규");
		System.out.println("영업부 : 이태규");
		System.out.println("영업부 : 이태규");
		System.out.println("영업부 : 이태규");

	}//main
	
	//method 위치
	//기능: 라인을 긋는 메소드 
	public static void drawLine() {
		System.out.println("--------------");
	}
	
	public static void drawLine(int length) { //drawLine(10);
		for(int i = 0; i < length; i++) {
			System.out.println("--------------");
		}
	}
	
	public static void drawLine(int length, String style) { //drawLine(10, "*");
		for(int i = 0; i < length; i++) {
			System.out.print(style);
		}
	}
	
	//com.util.Graphic2D.java
	//패키지명 + 클래스명 = 풀 네임(패지키명 + 클래스명)

}//class
