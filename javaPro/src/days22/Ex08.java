package days22;

import java.util.ArrayList;
import java.util.ListIterator;

public class Ex08 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		System.out.println(list);
		//양방향 조회기능 반복자
		ListIterator ir = list.listIterator();
		while(ir.hasNext()) {
			String n = (String)ir.next();
			System.out.println(n);
		}
		System.out.println("-".repeat(60));
		while(ir.hasPrevious()) {
			String n = (String) ir.previous();
			System.out.println(n);
		}

	}

}
