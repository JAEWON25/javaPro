package days24;

import java.util.Enumeration;
import java.util.Properties;

public class Ex06 {

	public static void main(String[] args) {
		
		/*
		//C:\Class\JavaClass\javaPro
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		*/
		
		Properties p =  System.getProperties();
		p.propertyNames();  //p의 목록 가져올때 쓴다. 모든 key -> 열거자로 변환 메서드
		Enumeration<String> en = (Enumeration<String>) p.propertyNames();
		while (en.hasMoreElements()) {
			String key = en.nextElement();
			String value = p.getProperty(key);
			System.out.printf("%s=%s\n", key, value);
			
		}

	}

}
