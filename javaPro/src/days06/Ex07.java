package days06;

public class Ex07 {
	
	public static void main(String[] args) {
		//ASCII + FOR문 출력
		//256가지 문자 나타낸다
		
		
		for (int i = 0; i <256; i++) {
			System.out.printf("[%d('%c')]\n", i, (char)i);
		} //for i
	} //main

}
