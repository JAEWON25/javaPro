package days20;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex10_02 {

	public static void main(String[] args) {
		// 문자열 money를 int형으로 바꾸고싶다.
		String strMoney = "3,257,600.00";
		
		//replaceAll 써서 ,랑 . 다 제거 방법도 있다.
		
//		[1]
//		String strMoney = "3,257,600";
//		int money = Integer.parseInt(strMoney.replace(",", ""));
		
//		[2] DecimalFormat 형식화 클래스
		String pattern = "\u00A4#,###";
		DecimalFormat df = new DecimalFormat(pattern);
		try {
			Number n = df.parse(strMoney);
			int money = n.intValue();
			System.out.println(money);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//숫자 -> 형식화된 문자열 변환 : df.format() 메서드
		//형식화된 문자열 -> 숫자 변환 : df.parse() 메서드
		

	}

}
