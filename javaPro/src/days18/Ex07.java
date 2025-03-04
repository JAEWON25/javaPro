package days18;

public class Ex07 {

	public static void main(String[] args) {
		// Unhandled exception type IOException 예외 발생
		//System.in.read();
		try {
			System.in.read();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//1. unchecked 예외
		//	  RuntimeException 및 자식 예외클래스들은 컴파일러가 예외처리를 확인하지않는 예외이다.
		//
		//2. checked 예외
		//    그 외 모든 Exception 클래스들은 컴파일러가 예외처리를 확인하는 예외이다. 
		//			예) read() IOException 발생 시킬수있다.

	}

}
