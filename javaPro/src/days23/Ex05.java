package days23;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(7);
		ts.add(4); //왼쪽 자식
		ts.add(9);
		ts.add(1);
		ts.add(5);
		ts.add(6);
		System.out.println(ts); //[1, 4, 5, 6, 7, 9]
		ts.add(5); //중복 허용 x
		System.out.println(ts); //[1, 4, 5, 6, 7, 9]
		
		System.out.println(ts.first()); //1 맨 왼쪽
		System.out.println(ts.last()); //9 맨 오른쪽
		
		SortedSet<Integer> ss = ts.subSet(4, 7); //4 <=   <7
		System.out.println(ss);
		
		//지정된 노드에 가장 가까운 노드
		System.out.println(ts.higher(1)); //4
		System.out.println(ts.lower(1)); //null
		
		System.out.println(ts.floor(3)); //1
		System.out.println(ts.floor(3)); //4

	}

}
