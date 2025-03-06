package days22;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex07_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue pq = new PriorityQueue();
		pq.offer(3);
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		
		
//		System.out.println(pq); //[1, 2, 5, 3, 4]
		
		//숫자는 우선순위가 높은 것 - (작은 숫자) 1, 2, 3, 4, 5
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}//while
	}

}
