package days14;

//default(package) 같은 패키지 안에서만 사용가능하다
class Person {
	//필드
	public String name;
	public int age;
	
	//메서드
	public void work() {
		System.out.println(name + "이 일한다.");
	}
	public void run() {
		System.out.println(name + "이 달린다.");
	}

}
