package days18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex09_03 {

	public static void main(String[] args) {

		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days17\\16일차복습_홍길동.txt";
		int one;
		int lineNumber = 1;
		
		
		//try -with - resource 자동으로 반환하는 문
		try(FileReader reader = new FileReader(fileName);) {
			System.out.printf("%d : ", lineNumber++);
			while((one = reader.read()) != -1) {
				System.out.printf("%c", (char)one); //(char) one 이니까 10.
				if(one == 10) { // 10("\n) 개행
					System.out.printf("%d : ", lineNumber++);
				}
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println(e.toString());
		} 
		System.out.println("end");
	}

}