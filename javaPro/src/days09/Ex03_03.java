package days09;

public class Ex03_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rrn = "830412-1700001";
		//1)830412-*******
		//2)830412-1****** // 830412-1 여기까지만 잘라오는 메소드가 있다면?
		
		/*
		int beginIndex = 0;
		int endIndex = 7;
		String s = rrn.substring(beginIndex, endIndex);
	    int count = rrn.length() - s.length();
	    System.out.println( s + "*".repeat(count));
		//01234567
		//830412-1******  // - 도 인덱스 포함
		beginIndex = 0;
		endIndex = 8;
		System.out.println(rrn.substring(beginIndex, endIndex) + "******");
		*/
		//[문제] 주민등록번호 뒷자리 7개 출력..
		int beginIndex = 7;
		int endIndex = 14;
		String s = rrn.substring(beginIndex, endIndex);
		System.out.println( s );
		
		//System.out.println(rrn.split("-")[1]);
		
		System.out.println(rrn.indexOf("-")); //자리값 찾을수있다.
		beginIndex = rrn.indexOf("-")+1;
		endIndex = rrn.length();

	}

}
