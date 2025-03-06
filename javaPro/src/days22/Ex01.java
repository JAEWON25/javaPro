package days22;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Ex01 {
	
	

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		list.add(p1);
		
		list.add(new Person("서영학", 24));
		list.add(new Person("정창기", 30));
		
		System.out.println(list);
		
		/*
		list.sort(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.name.compareTo(o2.name);
			}
			
		});
		*/
		
		list.sort(null);
		System.out.println(list);
	}

}
class Person implements Comparable<Person>{ //Comparable<T> 비교할수있는 기능이 포합된다.
	
	public String name;
	public int age;
	
	
	Person() {
		super();
	}

	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	@Override
	public int compareTo(Person o) {
		
		return this.name.compareTo(o.name);
	}
	
}