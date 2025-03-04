package days18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//한 라인이 끝나면 줄 번호 증가
public class Ex09_04 {

	public static void main(String[] args) {

		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days17\\16일차복습_홍길동.txt";
		
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
