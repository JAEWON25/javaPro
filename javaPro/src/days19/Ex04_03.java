package days19;

public class Ex04_03 {

	public static void main(String[] args) {
//		System.out.println("abC".compareTo("abc"));
//		System.out.println("abC".compareToIgnoreCase("abc"));
		
		//시작이 https:// 인지 ftp:// 를 원하는지 고르게하고싶다
//		String url = "www.naver.com";
		String url = "http://www.naver.com";
//		String url = "ftp://www.naver.com";
			
//		url.substring(0,7).equals("https://");
		
		String prefix = "https://";
		//System.out.println(url.startsWith(prefix));
		
		String fileName = "Sample.java";
		
		String suffix = ".java";
		//System.out.println(fileName.endsWith(suffix));
		
		String[] urls = {
				"http://www.naver.com"
				,"www.naver.com"
				,"ftp://www.naver.com"
				,"https://www.naver.com"
		};
		
		String regex = "http://.*"; // ^의 의미는  http://  시작해야된다.
		for(String u : urls) {
			if(u.matches(regex)) System.out.println(u);
		}
		System.out.println("end");
		
	}

}
