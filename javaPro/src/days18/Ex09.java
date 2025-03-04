package days18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) {
		//자동으로 자원 반환하는 try - with - resources 문 설명
		//"days17.16일차복습_홍길동.txt" 텍스트파일을 읽어와서 출력
		//FileReader 파일 읽기 클래스
		//FileWriter 파일 쓰기 클래스
		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days17\\16일차복습_홍길동.txt";
		//FileReader reader = new FileReader(fileName); //파일이 존재하지않을때 예외처리 어떻게할건지 정해라
		int one;
		FileReader reader = null;
		try {
			reader = new FileReader(fileName);
			//one = reader.read();
			while((one = reader.read()) != -1) {
				System.out.printf("%c", (char)one);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println(e.toString());
		} finally {
			//reader.close();
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//파일을 못찾았을경우 못닫으니까 예외처리해줘야된다 닫는것도.
		}
		System.out.println("end");
	}

}
