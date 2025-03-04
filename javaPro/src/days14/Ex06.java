package days14;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이 곳(지역변수) 에는 pulic(접근 지정자) 못붙인다.
		
		Tv t1 = new Tv();
		t1.power();
		t1.channelUp();
		System.out.println(t1.channel);
		t1.power();
		System.out.println(" end ");

	}

}

//자바파일을 생성하면 자바 파일안에는 반드시 1개의 public선언된 클래스(파일 같은이름)가 있어야된다.(즉, public 하나오는것만 가능)
//The public type Tv must be defined in its own file
class Tv{
	//필드
	//[접][기타] 자료형 변수명[=초기값];
	public String color;
	boolean power = false; //앞에 아무것도 없어서 default(package)이다
	public int channel = 11;
	
	public void power() {
		power = !power;
	}
	
	public void channelUp() {
		channel++;
	}
	
	public void channelDown() {
		channel--;
	}
	
	//메서드
}