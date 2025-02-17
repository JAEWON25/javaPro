package days05;

public class Ex02 {
	
	public static void main(String[] args) {
		//대소문자를 구분하지 않고 문자열 비교
		String n1 = "admin", n2 = "Admin";
		n1 = n1.toUpperCase(); //대문자로 바꾼다.
		n2 = n2.toUpperCase(); 
		
		System.out.println(n1.equalsIgnoreCase(n2)); //대소문자 구분안하고 비교.
		
		System.out.println(n1.equals(n2));

	} //main

}
