package days20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex05 {

	public static void main(String[] args) {
		//[정규 표현식] (regular expression == regex
		
		String[] data = { "bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date",
	            "disc", "fx" };
		
	      // String regex = "c[a-z]*"; // c문자 시작해서 소문자 0~여러개 패턴
	      // String regex = "c[a-z]";  // c문자 + 소문자 1개
	      // String regex = "c[a-zA-Z]"; // c문자 + 알파벳 1개
	      
	      // String regex = "c[a-zA-Z0-9]";
	      // String regex = "c\\w";
	      // String regex = ".*";
	      // String regex = "c.";
	      // String regex = "c\\.";
	      // String regex = "c[0-9]";
	      // String regex = "c.*t";
	      // String regex = "[b|c]";
	      // String regex = "[bc]";
	      // String regex = "[b-c].*";
	      // String regex = "[^bc].*";

	      // String regex = ".*a.*";

	      // String regex = "[^bcd].*";

	      // String regex = "[a-zA-Z].*";
	      // String regex = "[ae-zA-Z].*";
		  //String regex = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*_])[A-Za-z\\d!@#$%^&*_]{8,15}";
				//비밀번호       ?=.*[] 괄호 안에 있는게 어디있든지간에 하나 있어야된다. 8글자에서 15글자 사이.
		
		String regex = "[a-zA-Z&&[^b-d]].*";
		
//		[1]
//		for (int i = 0; i < data.length; i++) {
//			System.out.printf("%s - %s패턴 : %b\n", data[i], regex, data[i].matches(regex));
//		} //for i
		
		
		Pattern pattern = Pattern.compile(regex);
		for (int j = 0; j < data.length; j++) {
			
			Matcher matcher = pattern.matcher(data[j]);
			if(matcher.matches()) {
				System.out.println(data[j]);
			}
		} //for j

	}

}
