package days02;

public class Ex03_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "홍길동";
		int age = 25;
		double height = 180.78;
		
		//println
		//System.out.println("이름은 \"홍길동\"이고, 나이는 25살이고, 키는 180.78cm이다."); //이 상태에서 변수로 끊는게 편함.
		//System.out.println("이름은 \"" +name + "\"이고, 나이는 "+ age + "살이고, 키는 " + height + "cm이다."  );
		
		//printf에 f = format
		//메서드 3가지 기능: 기능, 매개변수, 리턴값
		//%conversion
		System.out.printf("이름은 \"%s\"이고, 나이는 %d살이고, 키는 %.2fcm이다.\n", name, age, height);
	}

}
