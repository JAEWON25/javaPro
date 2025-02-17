package days09;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		//주민등록번호: Resident Registration Number, RRN
		//ㄱㄴㄷㄹㅁㅂ - ㅅㅇㅈㅊㅋㅌㅍ
		//ㅅ - 18세기,19,20세기인지 성별
		//ㅇㅈㅊㅋ 출생지
		
		Scanner scanner = new Scanner(System.in);
		String rrn = getRrn(scanner);
		System.out.println(rrn);
		
		boolean gender = getGender(rrn);
		System.out.println(gender ? "남자":"여자");
		
		//2. 1880/1900/2000 어느세기 사람인지.
		int centry = getCentry(rrn);
		System.out.println(centry);
		
	} //main
	
	private static int getCentry(String rrn) {
		
		
		
		return 0;
	}

	//남자true, 여자 false
	private static boolean getGender(String rrn) {
		/*
		char gender = rrn.charAt(7); //char형으로 가져온다. //rrn.charAt(7)-'0' 하면 int형으로 바뀐다.
		switch(gender) { // '2' => 50
		case '9': case '1': case '3': case '5': case '7':
			return true;	//남자
		default:
			return false;   //여자
		}
		*/
		
		//[2] 830412-2700001
		String strGender = rrn.substring(7, 8); //"2"
		int gender = Integer.parseInt(strGender); // 2
		return gender%2==1? true:false;
	}

	private static String getRrn(Scanner scanner) {
		//유효성 검사 숫자6-7개
		//String regex = "[0-9]{6}-[0-9]{7}";
		String regex = "\\d{6}-\\d{7}";
		String rrn;
		
		do {
			System.out.print("주민등록번호 14자리 입력: 예 000000-0000000");
			rrn = scanner.next();
			
			}while(!rrn.matches(regex));
		
		return null;
	}

}
