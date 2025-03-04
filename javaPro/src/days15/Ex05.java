package days15;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// [private로 필드를 선언한 후 필드에 접근하는 방법]
		//  getter setter
		Person p1 = new Person(true);
		
		//The field Person.name is not visible / private name이라서 찾지 못한다.
		//p1.name = "홍길동";
		//첫번째 해결책 private 접근 지정자를 바꾼다.
		
		//p1.age = 20;
		p1.setAge(20);
		System.out.println(p1.getAge()); //20
		
		//나이를 키보드로부터 얻어와서 입력
		Scanner scanner = new Scanner(System.in);
		System.out.print(">나이 입력 ");
		int age = scanner.nextInt();	
		
//		if(age >= 0 && age <= 120) {
//			p1.age = age;
//		}
		//p1.setGender(false); //성별 쓰기 가능, 읽기x
		
		System.out.println("end");

	}

}
