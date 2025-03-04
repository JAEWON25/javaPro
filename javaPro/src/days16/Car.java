package days16;

public class Car {
	//필드
	String name;
	String gearType;
	int door;
	
	//has - a 관계 : Car + Engine 자동차에 엔진은 중요 하나는 들어온다.
	private Engine engine = new Engine(); //명시적으로 초기화 x
	
	
	//getter setter
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	

	Car(){
		//this.engine = new Engine(); //생성자 초기화 x (새로운 엔진이 나오면 불가)
	}
	Car(Engine engine){
		this.engine = engine;
	}
	
	void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
	}
	
	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}
	
	void stop() {
		this.engine.stop();
	}

}
