package days02;

public class Ex03_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[문제]
		//이름을 저장할 변수 선언
		//나이를 저장할 변수 선언
		//키를 저장할 변수 선언
		//원하는 값으로 각 변수를 초기화 한 후 
		//(출력 형식)
		//이름은 "홍길동"이고, 나이는 25살이고, 키는 180.78cm이다.
		
		String name = "홍길동";
		int age = 25;
		double height = 180.78;
		System.out.println("이름은 \"홍길동\"이고, 나이는 25살이고, 키는 180.78cm이다."); //이 상태에서 변수로 끊는게 편함.
		System.out.println("이름은 \"" +name + "\"이고, 나이는 "+ age + "살이고, 키는 " + height + "cm이다."  );
	}

}
