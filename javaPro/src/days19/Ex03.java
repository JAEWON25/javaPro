package days19;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card();
		System.out.println(c1);
		
		/*
		//Class 객체 얻어오는 첫번째 방법
		Class cls = c1.getClass();
		String fullName = cls.getName();
		System.out.println(fullName); //days19.Card
		*/
		
		/*
		//두번째 방법 - 모든 클래스마다 static필드 : class
		Class cls = Card.class;
		//cls을 사용해 실제 Card객체(인스턴스)를 생성해보자
		//new Card();
		try {
			Card c2 = (Card)cls.newInstance();
			System.out.println(c2);
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //새로운 인스턴스를 생성해서 반환. 밑줄 - duplicate로 앞으로 없어질거다
		*/
		
		
		//3번째 방법
		String className = "days19.Card";
		try {
			Class c3 = Class.forName(className);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

//final 클래스 : 최종 클래스(자식 가질수없다)
//final 메서드 : 재정의 할 수 없다
//final 필드 : 상수
//final 지역변수 : 상수
final class Card{
	
	String kind; //카드 종류
	int num; //카드 번호
	
	
	Card() {
		this("SPADE", 1);
	}



	public Card(String kind, int num) {
		super();
		this.kind = kind;
		this.num = num;
	}



	@Override
	public String toString() {
		return "Card [kind=" + kind + ", num=" + num + "]";
	}
	
}