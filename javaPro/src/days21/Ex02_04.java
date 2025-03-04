package days21;

import java.text.MessageFormat;

public class Ex02_04 {

	public static void main(String[] args) {
		
		String s = "이름:홍길동, 나이:20, 성별:여자";
		
		String name;
		int age;
		boolean gender;
		
		String pattern = "이름:{0}, 나이:{1}, 성별:{2}";
		MessageFormat mf = new MessageFormat(pattern);
		
		try {
			Object [] objArr = mf.parse(s);
//			for(Object obj: objArr) {
//				System.out.println(obj);
//			}
			name  = (String)objArr[0];
			age =Integer.parseInt((String)objArr[1]);
			gender = ((String)objArr[2]).equals("남자")?true:false;
			System.out.println( name ); 
	        System.out.println( age ); 
	        System.out.println( gender ); 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
