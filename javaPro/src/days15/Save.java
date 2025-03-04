package days15;

//저축과 관련된 클래스
public class Save {
	//필드
	//인스턴스 변수
	private String name; //예금주
	private int money; //예금액
	
	//static(클래스)변수 또는 필드, 공유변수, 정적변수
	private static double rate = 0.04; //이자율
	//0.04 이자율은 모두가 같은 적금으로 같으니 매번 메모리 공간으로 만들지 말고 하나의 static공간으로 관리하자.
	
	
	//생성자 
	public Save() {
		
	}
	
	// alt shitf s
	//3개 생성자
	public Save(String name, int money, double rate) {
		this.name = name;
		this.money = money;
		this.rate = rate;
	}
	
	//메소드
	public void printSave() {
		System.out.printf("> 예금주:%s, 예금액:%d, 이자율:%.2f\n"
	            , this.name, this.money, this.rate);
	}
	
	//getter, setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	//인스턴스가 생성되어야 뜬다. 객체가 생성이되어야 사용가능
	//하지만 static 붙이면 프로그램 시작되면 메모리에 올라간다.
	public static double getRate() {
		return rate;
	}

	public static void setRate(double rate) {
		//this.rate = rate;
		Save.rate = rate; //클래스명.rate
		//rate = rate 도 가능 근데 rate가 두개니 매개변수명 변경
	}	

}
