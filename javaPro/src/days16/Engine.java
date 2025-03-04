package days16;

//엔진 클래스
public class Engine {
	
	//필드
	int speed;
	
	//메서드
	void moreFuel(int fuel) {
		this.speed += fuel * 0.05; //연료를 넣을 수록 속도가 조금 빨라진다.
	}
	
	void lessFuel(int fuel) {
		this.speed -= fuel * 0.05;
	}
	
	void stop() {
		this.speed = 0;
	}
}
