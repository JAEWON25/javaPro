package days06;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Ex04_06_02 {
	
	public static void main(String[] args) {
		
		//람다식과 스트림(Stream)
		int [] n = {10, 31, 98, 38, 68, 91, 95, 76, 27, 29};
		//int[] -> int스트림 변환
		OptionalInt max = IntStream.of(n).max();
		
		//getAsInt() : OptionalInt -> int
		if(max.isPresent()) {
			System.out.println(max.getAsInt());
		}
		
	} //main

}
