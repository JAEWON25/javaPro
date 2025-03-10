package days25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;

//BufferedReader / BufferedWriter 보조 스트림을 사용해서 복사.
public class Ex01_03 {

	public static void main(String[] args) {

		
		String fileName = ".\\src\\days24\\Ex01.java"; //복사할 원본 파일
		String copyFileName = ".\\src\\days24\\CopyEx01.java"; //복사 했을 때 만들어지는 파일
		
		//>처리시간: 7224100 ns -> 복사하는데 이 만큼 걸렸다. -> ex01_02
		//>처리시간: 884800 ns -> ex01_03
		fileCopy_testStream(fileName, copyFileName); //파일을 복사할 메서드
		
		System.out.println("end");

	}

	private static void fileCopy_testStream(String source, String target) {
		
		long start = System.nanoTime();
		
		final int BUFFER_SIZE = 1024;
		
		int code;
		try (FileReader reader = new FileReader(source); //한 문자씩 읽는중
				FileWriter writer = new FileWriter(target);
				BufferedReader br = new BufferedReader(reader, BUFFER_SIZE);//1024만큼 읽어와서 1024만큼 이동하겠다.
				BufferedWriter bw = new BufferedWriter(writer, BUFFER_SIZE);){ 
			/*[1]
			String line = null;
			while((line = br.readLine()) != null) {
				bw.write(line+"\r\n");
			}
			*/
			
			//[2] 1024 버퍼크기 만큼 읽고 쓰기
			//1030이면 1024 - 6 -> 6개까지만 복사
			char [] cbuf = new char[BUFFER_SIZE];
			int n = -1; //읽어온 개수(실제 읽어온 문자 수)
			while(( n = br.read(cbuf)) != -1) {
				bw.write(cbuf, 0, n); //배열을 읽을 건데 읽어온개수까지만 저장하겠다. cbuf배열
			}//while
			bw.flush();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		long end = System.nanoTime();
		
		System.out.printf(">처리시간: %d ns\n", (end-start));
		
	}

}
