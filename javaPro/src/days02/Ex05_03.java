package days02;

public class Ex05_03 {

	public static void main(String[] args) {
		
		String name ="admin";
		int age = 20;
		
		System.out.printf("[%s]\n", name);
		System.out.printf("[%10s]\n", name); //우측정렬
		System.out.printf("[%-10s]\n", name); //좌측정렬
		
		//나이(age)를 4자리로 출력 0020
		//100				  0100
		//5                   0005
		
		System.out.printf("[%04d]\n", age);  //0은 flags에 해당. 빈자리는 0으로 채운다.
		
		int money = 12573000; // 12,573,000 출력
		System.out.printf("[%,4d]\n", money);
		
		System.out.printf("[%(d]\n", 30);
		System.out.printf("[%,(d]\n", -30);
		
		System.out.println("-".repeat(50)); //구분선
		System.out.printf("[%d]\n", 10); // [10]
		//d 정수를 10진수로 출력
		System.out.printf("[%#o]\n", 10); //[12]
		//o 정수를 8진수로
		System.out.printf("[%#x]\n", 10); //[a]
		//x 정수를 16진수로
		
		
		double avg = 79.96844;
		System.out.printf("평균=%f\n", avg);
		System.out.printf("평균=[%.2f]\n", avg); //자동 반올림
		System.out.printf("평균=[%10.2f]\n", avg); //10자리 확보하고 소수점 2번째 자리까지.
		System.out.printf("평균=[%010.2f]\n", avg); //10앞에 0은 flags
	}

}
