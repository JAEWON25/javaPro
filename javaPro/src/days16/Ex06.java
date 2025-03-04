package days16;

public class Ex06 {

	public static void main(String[] args) {
		
		//생성자를 사용해서 의존성 주입 **중요**
		Engine k_engine = new Engine();
		Car car1 = new Car(k_engine);
		car1.speedUp(10);
		
		//SET를 사용한 의존성 주입. **중요**
		Engine h_engine = new Engine();
		car1.setEngine(h_engine);
		
		int speed = car1.getEngine().speed;
		System.out.println("현재 속도 : " + speed);
		
		
		System.out.println("end");

	}//main

}//class
