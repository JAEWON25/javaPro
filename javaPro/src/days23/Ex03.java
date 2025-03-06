package days23;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Ex03 {

	public static void main(String[] args) {
		// Student 클래스 -> HashSet 컬렉션 클래스 저장.
		//[문제점] 파악
		// hashCode() 오버라이딩 - 학번
		//학생 비교 equals() 오버라이딩 - 학번
		HashSet<Student> hs = new HashSet<>();
		hs.add(new Student("2020001", "홍길동", 25));
		hs.add(new Student("2020002", "서영학", 25));
		hs.add(new Student("2020003", "최승우", 25));
		hs.add(new Student("2020001", "권태정", 25));
		
		Iterator<Student> ir = hs.iterator();
		while(ir.hasNext()) {
			Student s = (Student) ir.next();
			System.out.println(s);
		}

	}

}

class Student{
	String no; //학번 -학생을 구별하는 고유번호

	String name;
	int age;
	
	Student() {
		super();
	}
	
	Student(String no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return this.no.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student && obj != null) {
			Student s = (Student)obj;
			return this.no.equals(s.no);
		}
		return false;
	}
	
}