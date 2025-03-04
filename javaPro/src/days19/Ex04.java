package days19;

public class Ex04 {

	public static void main(String[] args) {
		// [문자열 다루는 클래스]
		
		//String name = "이창익"; // 참조형, String은 클래스타입 / 주소값을 저장중
		//String name = new String("이창익"); 원래 class는 이게 맞다
		//String name2 = "이창익";
		//System.out.println(name == name2); //true 같은 주소값이니까 같다. 
		
		String name = new String("이창익");
		String name2 = new String("이창익");
		System.out.println(name == name2); //false
	}

}
