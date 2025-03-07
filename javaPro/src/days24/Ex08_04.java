package days24;

import java.util.ArrayList;


/*
public class Ex08_04 {

	public static void main(String[] args) {
		//[제네릭 클래스의 객체 생성과 사용]
		Box03<Fruit> fruitBox = new Box03<Fruit>();// 과일을 담을 상자
		Box03<Apple> appleBox = new Box03<Apple>();// 사과를 담을 상자
		Box03<Grape> grapeBox = new Box03<Grape>();// 포도를 담을 상자
		Box03<Toy> toy = new Box03<Toy>();// 장난감을 담을 상자
		
//		타입 불일치 예외 발생. 되지않는다.
//		Box03<Apple> appleBox2 = new Box03<Grape>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); //자식은 업캐스팅되어서 들어간다.
//		fruitBox.add(new Toy()); //과일 사장가 아니여서 오류
		

	}//main

}//class
*/
/*
class Fruit{
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit{
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit{
	public String toString() {
		return "Grape";
	}
}

class Toy{
	public String toString() {
		return "Toy";
	}
}

class Box03<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {this.list.add(item);}
	T get(int i) {return this.list.get(i);}
	int size() {return this.list.size();}
	public String toString() {return this.list.toString();}
}
*/