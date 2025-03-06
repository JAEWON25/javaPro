package days22;

import java.util.LinkedList;
import java.util.Queue;

public class Ex07_02 {

	public static void main(String[] args) {
		// Queue 
		Queue q = new LinkedList(); //업캐스팅
		q.offer("김예지");
		q.offer("남현수");
		q.offer("서재웅");
		System.out.println(q.offer("이정인")); //boolean offer - true/false -> true
		while(!q.isEmpty()) {
			System.out.println(q.poll()); //큐안 요소들 가져온다(끄집어낸다) 김예지부터 차례로 출력
		}

	}

}
