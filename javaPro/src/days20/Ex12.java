package days20;

import java.text.ChoiceFormat;

public class Ex12 {

	public static void main(String[] args) {
		//ChoiceFormat 클래스
		
		
		int [] kors = { 100, 57,  95, 88, 77, 80, 0 };
		/*
		 * [1]
		//            규칙 낮은 값부터 넣는다.
		double [] limits = {0, 60, 70, 80, 90}; //0에서 60까지 60에서 70까지 ... 위랑 아래 매치.
		String [] formats = {"가","양", "미", "우","수"};
		ChoiceFormat cf = new ChoiceFormat(limits, formats);
		*/
		
//		[2]
		String newPattern = "0#가|60#양|70#미|80#우|90#수";
		ChoiceFormat cf = new ChoiceFormat(newPattern);
		for (int i = 0; i < kors.length; i++) {
			System.out.printf("%d점 - %s등급\n", kors[i], cf.format(kors[i]));
		} //for i

	}

}
