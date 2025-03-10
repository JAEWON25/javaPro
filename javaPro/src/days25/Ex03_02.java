package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.StringReader;

public class Ex03_02 {

	public static void main(String[] args) {
		// StringReader / StringWriter
		
		String source = "public class Ex01_02 {\r\n"
				+ "\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "\r\n"
				+ "		\r\n"
				+ "		String fileName = \".\\\\src\\\\days24\\\\Ex01.java\"; //복사할 원본 파일\r\n"
				+ "		String copyFileName = \".\\\\src\\\\days24\\\\CopyEx01.java\"; //복사 했을 때 만들어지는 파일\r\n"
				+ "		\r\n"
				+ "		//>처리시간: 7224100 ns -> 복사하는데 이 만큼 걸렸다.\r\n"
				+ "		fileCopy_testStream(fileName, copyFileName); //파일을 복사할 메서드\r\n"
				+ "		\r\n"
				+ "		System.out.println(\"end\");\r\n"
				+ "\r\n"
				+ "	}\r\n"
				+ "\r\n"
				+ "	private static void fileCopy_testStream(String source, String target) {\r\n"
				+ "		\r\n"
				+ "		long start = System.nanoTime();\r\n"
				+ "		\r\n"
				+ "		int code;\r\n"
				+ "		try (FileReader reader = new FileReader(source);\r\n"
				+ "				FileWriter writer = new FileWriter(target);){\r\n"
				+ "			\r\n"
				+ "			while((code=reader.read())!= -1) {\r\n"
				+ "				System.out.print((char)code);\r\n"
				+ "				writer.write(code); //스트림에 쓰기 작업\r\n"
				+ "			}\r\n"
				+ "			writer.flush(); // 파일 쓰기 작업 다 완료후 저장하고 끝내라\r\n"
				+ "			\r\n"
				+ "		} catch (Exception e) {\r\n"
				+ "			System.out.println(e.toString());\r\n"
				+ "		}\r\n"
				+ "		\r\n"
				+ "		long end = System.nanoTime();\r\n"
				+ "		\r\n"
				+ "		System.out.printf(\">처리시간: %d ns\\n\", (end-start));\r\n"
				+ "		\r\n"
				+ "	}\r\n"
				+ "\r\n"
				+ "}";
		System.out.println(source);
		
		//[문제] source라는 문자열에서 20번째 라인의 문자열을 찾아서 출력.
		
//      [1]		
//		String [] sArr = source.split("\r\n");
//		System.out.println(sArr[19]);
		
//		[2] 메모리 스트림 - String
		try (StringReader sr = new StringReader(source);
			 BufferedReader br = new BufferedReader(sr);){
			
			int i = 1;
			while(i++ <=19) br.readLine();
			String line20 = br.readLine();
			System.out.println(line20);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
