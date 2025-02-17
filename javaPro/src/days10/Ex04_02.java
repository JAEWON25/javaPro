package days10;

import java.io.IOException;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

import days08.Ex07;

public class Ex04_02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int [] kors = new int[3];
		
		Scanner scanner = new Scanner(System.in);
		
		int index = 0;
		int score;
		String regex = "^(100|[1-9]?[0-9])$";
		char con = 'y';

		do {
			System.out.printf("%d번 학생 점수 입력? ", index + 1);
			score = Ex07.getRandomInteger(0, 100);
			
			if(index == kors.length) { //배열 방 늘리고싶은데 배열 다 찼는지 확인
				int [] temp = new int[kors.length + 2];
				for(int i = 0; i < kors.length; i++) {
					temp[i] = kors[i];
				}
				kors = temp;
				
			}
			
			
			kors[index++] = score;
			
			System.out.printf("입력 계속 할래?");
			con = (char)System.in.read();
			System.in.skip(System.in.available()); // 13(\r), 10(\n) 제거
		}while(Character.toUpperCase(con) == 'Y');
		//while(con == 'y' || con == 'Y');
		
		System.out.printf(" > 입력한 수 : %d \n", index);
		
		dispScore(kors, index);
		
		//최고 점수/ 최저 점수/ 평균 

	}

	private static void dispScore(int[] kors, int index) {
		// TODO Auto-generated method stub
		for (int i = 0; i < kors.length; i++) {
	         System.out.printf("[%d]번 학생의 점수 : %d점\n", i+1, kors[i]);
	      } // for i
		
		IntStream stream = IntStream.of(kors);
		OptionalInt oMax = stream.max();
		int maxScore = oMax.getAsInt();
		int minScore = IntStream.of(kors).limit(index).min().getAsInt();
		double avgScore = IntStream.of(kors).limit(index).average().getAsDouble();
		System.out.printf("최고점: %d , 최저점 : %d, 평균: %.2f\n", maxScore, minScore, avgScore);
		
	}
	

}
