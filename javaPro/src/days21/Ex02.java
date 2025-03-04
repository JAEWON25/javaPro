package days21;

import java.text.MessageFormat;

public class Ex02 {

	public static void main(String[] args) {
		// 형식화 클래스
		
		String name = "홍길동";
		int age = 20;
		boolean gender = false;
		
		//출력형식 : "이름: 홍길동, 나이:20살, 성별:여자"
		
//		[1]
//		String s = String.format("이름:%s, 나이:%d살, 성별:%s", name, age, gender?"남자": "여자");
//		System.out.println(s);
//		
		
//		[2]
//		String pattern = "이름:{0}, 나이:{1}, 성별:{2}";
//		MessageFormat mf = new MessageFormat(pattern);
//		String s =  mf.format(new Object[] {name, age, gender?"남자": "여자"});
//		System.out.println(s);
		
		
//		[3]static method
		String pattern = "이름:{0}, 나이:{1}, 성별:{2}";
		String s = MessageFormat.format(pattern, name, age, gender?"남자": "여자");
		System.out.println(s);
	}

}
