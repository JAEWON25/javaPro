package days14;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * [color][power][channel][메서드주소][메서드주소][..]                     [0x100]
		 * 0x100										   					t1
		 * 
		 * 
		 * 							[power()][channelUp()][channelDown()]
		 * */
		
		
		//t1  - [color][power][channel]
		//t2  - [color][power][channel]
		Tv t1 = new Tv();
		Tv t2 = new Tv();    // 메서드는 첫번쨰 객체 생성될때 한번만 올라가고 t1,t2둘다 주소를 가져온다.
		
		
		//복제
		t2.channel = t1.channel;
		t2.power = t1.power;
		t2.color = t1.color; 
		
		//객체 복사 
		//(t3의 주소값이 t1의 주소값을 가르킨다.)
		Tv t3 = t1;
		System.out.println(t1.color);
		System.out.println(t2.color);
		System.out.println(t3.color);  //다 같다 
		
		objectCopy(t1);
		System.out.println(t1.color); //blue 찍한다.
		//

	}
	
	// Tv t = t1; 클레스 복사 (같은 주소를 가르키고있는것)
	private static void objectCopy(Tv t1) {
		t1.color = "blue";
		
	}

}
