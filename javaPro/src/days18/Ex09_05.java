package days18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex09_05 {

	public static void main(String[] args) {
		
		String dir = System.getProperty("use.dir");
		System.out.println(dir);
		
		//맨 앞 .(점)은 상대 경로를 나타낸다.
		// . 현재 디렉토리
		// .. 상위 디렉토리
		//String fileName = ".\\.classpath";
		//String fileName = ".classpath"; //파일명만 준거다. (현재 디렉토리)라는 뜻이 내포중.
		//String fileName = ".\\src\\days01\\Ex01.java";
		//String fileName = ".\\..\\Sample.java";
		String fileName = dir + "\\classpath"; //dir = javaPro 주소에 있다
		
		int lineNumber = 1;
		String line = null;
		
		
		//try -with - resource 자동으로 반환하는 문
		try(FileReader reader = new FileReader(fileName);) {
			BufferedReader br = new BufferedReader(reader);
			while((line = br.readLine()) != null) {//파일의 끝을 만나면 null을 돌린다.
				System.out.printf("%d : %s\n", lineNumber++, line);
			} 
			System.out.println();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println(e.toString());
		} 
		System.out.println("end");

	}

}
