package days20;

import java.text.DecimalFormat;

public class Ex10 {

	public static void main(String[] args) {
		//[형식화 클래스]
		//Decimal Format
		
		int money = 3257600;
		// 3,245,600 으로 출력되길 원한다.
		
		//[1]
//		String strMoney = String.format("%,d", money);
//		System.out.println(strMoney);
		
//		[2]DecimalFormat 숫자를 형식화하는 클래스
		String pattern = "\u00A4#,###";
		DecimalFormat df = new DecimalFormat(pattern);
		String strMoney = df.format(money);
		System.out.println(strMoney);

	}

}
