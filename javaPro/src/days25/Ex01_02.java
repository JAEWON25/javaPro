package days25;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;

public class Ex01_02 {

	public static void main(String[] args) {

		
		String fileName = ".\\src\\days24\\Ex01.java"; //복사할 원본 파일
		String copyFileName = ".\\src\\days24\\CopyEx01.java"; //복사 했을 때 만들어지는 파일
		
		//>처리시간: 7224100 ns -> 복사하는데 이 만큼 걸렸다.
		fileCopy_testStream(fileName, copyFileName); //파일을 복사할 메서드
		
		System.out.println("end");

	}

	private static void fileCopy_testStream(String source, String target) {
		
		long start = System.nanoTime();
		
		int code;
		try (FileReader reader = new FileReader(source);
				FileWriter writer = new FileWriter(target);){
			
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
