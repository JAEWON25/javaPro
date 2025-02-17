package days06;

import java.util.Arrays;

public class Ex09_02 {
	
	public static void main(String[] args) {
		String name = "admin";
		//여기서 첫번째꺼 하나 가져오자
		
		//name.charAt(int index)
		char ch;
		char [] nameArr = new char[name.length()];
		for(int i = 0; i < name.length();i++) {
			ch = name.charAt(i);
			System.out.printf("%s -> %d -> %c\n", name, i , ch);
		}
		//char [] nameArr = name.toCharArray();
		
		System.out.println(Arrays.toString(nameArr));
		
		/*
		char ch = name.charAt(0);
		System.out.printf("%s -> %c\n", name, ch);
		
		ch = name.charAt(1);
		System.out.printf("%s -> %c\n", name, ch);
		
		ch = name.charAt(2);
		System.out.printf("%s -> %c\n", name, ch);
		
		ch = name.charAt(3);
		System.out.printf("%s -> %c\n", name, ch);
		*/
		
	} //main

}
