package days18;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class days18_Test {

	public static void main(String[] args) {
		
		String fileName = "C:\\Users\\user\\Desktop\\복습문제_양재원\\학생명단.txt";
		int one;
		int lineNumber = 1;

		try (FileReader reader = new FileReader(fileName)){
			System.out.printf("%d : ", lineNumber);
			while((one = reader.read()) != -1) {
				System.out.printf("%c", one);
				if(one == 10) System.out.printf("%d : ", lineNumber++);
			}
			System.out.println();
			
		} catch(FileNotFoundException e) {
			System.out.println(e.toString());
		} catch(Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println("end");

	}

}
