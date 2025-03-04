package days20;

import java.io.FileReader;

public class Ex01 {

	public static void main(String[] args) {
		
		String fileName = ".\\src\\days18\\Ex10.java";
		
		
		//char one = '\u0000';
		int code = -1;
		int [] counts = new int[26];
		int [] counts2 = new int[26];
		int [] countNum = new int[10];
		//counts[0] = 'A' 65-A의 갯수
		
		try(FileReader reader = new FileReader(fileName);) {
			
			while((code = reader.read()) != -1) {
				
				if(Character.isUpperCase(code)) {
					int index = code - 'A';
					counts[index]++;
				}
				else if (Character.isLowerCase(code)) {
					int index = code -'a';
					counts2[index]++;
				}
				else if (Character.isDigit(code) ) {
					int index = code - '0';
					countNum[index]++;
				}
					
			}
			
		
			//막대그래프 그리기
			for (int i = 0; i < counts.length; i++) {
				
				System.out.printf("%c(%d) %s\n", i+'A', counts[i], "#".repeat(counts[i]));
				
			} //for i
			
			for (int i = 0; i < counts2.length; i++) {
				
				System.out.printf("%c(%d) %s\n", i+'a', counts2[i], "#".repeat(counts2[i]));
				
			}
			
			for (int i = 0; i < countNum.length; i++) {
				
				System.out.printf("%c(%d) %s\n", i+'0', countNum[i], "#".repeat(countNum[i]));
				
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
