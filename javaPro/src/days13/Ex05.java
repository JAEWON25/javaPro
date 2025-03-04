package days13;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//30개 0~20정수
		//순차 검색 (하나하나 맞는지 확인)
		int [] m = { 0, 2, 12, 16, 7, 9, 2, 9, 0, 13, 7, 13, 3, 14, 10
	            , 15, 11, 6, 19, 5, 2, 0, 16, 18, 15, 18, 0, 9, 13, 16 };
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(">배열에서 찾을 정수 입력? ");
		int n = scanner.nextInt();
		
		//만약에 찾는 값이 배열 속에 없다면 -1반환
		int index = sequenceSearch(m, n); 
		
		if (index != -1) {
			System.out.printf("찾는 정수 %d는 %d 위치에 있다.", n, index);
		} else {
			System.out.println("찾는 정수는 없다.");
		}
	}

	private static int sequenceSearch(int[] m, int n) {
		int index = -1;
		//검색 작업 -> index = 찾은 위치값
		for(int i = 0; i < m.length; i++) {
			if(m[i] == n) {
				index =i;
				break;
			}
			//if(m[i] == n) return i;
		}
		return index;
	}

}
