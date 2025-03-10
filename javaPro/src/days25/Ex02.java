package days25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex02 {

	public static void main(String[] args) {
		// 실행파일 .exe 파일 복사
		//문자를 다루는 스트림
		
		String fileName = "C:\\Users\\user\\Downloads\\KakaoTalk_Setup.exe";
		String copyFileName = ".\\KakaoTalk_Setup.exe";
		
		fileCopy_byteStream(fileName, copyFileName);
		
		System.out.println("end");

	}

	private static void fileCopy_byteStream(String source, String target) {

		long start = System.nanoTime();
		
		int code;
		try (FileInputStream reader = new FileInputStream(source);
				FileOutputStream writer = new FileOutputStream(target);){
			
			while((code=reader.read())!= -1) {
				System.out.print((char)code);
				writer.write(code); //스트림에 쓰기 작업
			}
			writer.flush(); // 파일 쓰기 작업 다 완료후 저장하고 끝내라
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		long end = System.nanoTime();
		
		System.out.printf(">처리시간: %d ns\n", (end-start));
		
	}

}
