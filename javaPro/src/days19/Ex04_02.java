package days19;

import java.util.Arrays;

public class Ex04_02 {
	
	

	public static void main(String[] args) {

		//String s = "public static void main(String[] args) {";
		//1.문자열의 길이 반환하는 메서드
		//System.out.println(s.length()); //40
		//2. 문자열 속에서 특정 위치의 한 문자를 반환하는 메서드
		//System.out.println(s.charAt(0));
//		for (int i = 0; i < s.length(); i++) {
//			System.out.printf(" %c ", s.charAt(i));
//		} //for i
		
		/*
		//3. 대문자 변환, 소문자 변환
		System.out.println(s.toUpperCase()); //대문자 변환하는 새로운 문자열을 반환만한다.
		System.out.println(s.toLowerCase());
		System.out.println(s); //s는 바뀌어 있지않다. -> 문자열은 변하지않는다. s는 그대로
		*/
		
		//4  String [] s.split(regex)
		
		//5. String -> char [] 
//		char [] sArr = s.toCharArray();
//		System.out.println(Arrays.toString(sArr));
//		
//		//6. char [] - > String
//		String s2 = new String(sArr);
//		String s2 = String.valueOf(sArr);
//		System.out.println(s2);
		
		//7. trim() 문자열 앞 뒤의 공백 제거해서 문자열 반환하는 메서드
		//System.out.println("   홍길동  ".trim());
		
		//[문제] s 문자열 속에 main 문자열 찾아서 MAIN (대문자)로 변환하는 코드
		//String s = "public static void main(String[] args) {";
		String searchWord = "main";
		
		//s문자열 속에 한글을 제외한 모든 문자는 제거
		String s = "public static void 메인(String[] args) {";
		System.out.println(s.replaceAll("[a-zA-Z() {}\\[\\]]", ""));
		//String s2 = reverse(s);
		
//      [1]
//		System.out.println(s.contains(searchWord));//이 문자열속에 main이 있는지없는지 확인하는것 contains
//		if(s.contains(searchWord)) { //true
//			int index = s.indexOf(searchWord);
//			System.out.println(s.substring(0, index)); //main앞까지 문자열 짤라왔다.
//			System.out.println(searchWord.toUpperCase());
//			System.out.println(s.substring(index+searchWord.length())); //main 뒷부분
//			System.out.println(s.substring(0, index) + searchWord.toUpperCase() 
//								+ s.substring(index+searchWord.length()));
//		}

//      [2]
//		String [] sArr = s.split(searchWord);
//		System.out.println(String.join(searchWord.toUpperCase(), sArr));
		
//		[3]
		System.out.println(s.replaceAll(searchWord, searchWord.toUpperCase()));
		
		System.out.println(s.indexOf("in")); // in을 앞에서부터 찾는다. 21
		System.out.println(s.lastIndexOf("in")); // 뒤에서부터 찾는다. 27
		
		//문자열 연결
		//String s2 = "aaa" + "bbb" + "ccc";
		//String s3 = "aaa".concat("bbb").concat("ccc");
		
		//문자열 비교
		//s2.equals(s3);
		//s2.equalsIgnoreCase(s3);
		
		//문자열 뒤집기
		String s2 = reverse(s);
		System.out.println(s2);
		
		
	}

	private static String reverse(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			result = s.charAt(i) + result;
		} //for i
		return result;
	}

}
