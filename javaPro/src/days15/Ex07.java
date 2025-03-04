package days15;

import java.util.Iterator;

public class Ex07 {

	public static void main(String[] args) {
		
		
		//[static]                        이자율
		
		/*
		Save s1 = new Save("권태정", 10000, 0.04);
		Save s2 = new Save("김가은", 23000, 0.04);
		Save s3 = new Save("김도훈", 3300, 0.04);
		Save s4 = new Save("김민선", 100000, 0.04);
		Save s5 = new Save("김승효", 100500, 0.04);
		
		s1.printSave();
		s2.printSave();
		s3.printSave();
		s4.printSave();
		s5.printSave();
		//클래스 배열로 수정
		 */
		/*
		//alt shift a
		//ctrl c
		//ctra v
		Save [] sArr = new Save[5];
		sArr[0] =new Save("권태정", 10000, 0.04); 
		sArr[1] =new Save("김가은", 23000, 0.04); 
		sArr[2] =new Save("김도훈", 3300, 0.04);  
		sArr[3] =new Save("김민선", 100000, 0.04);
		sArr[4] =new Save("김승효", 100500, 0.04);
		
		for (int i = 0; i < sArr.length; i++) {
			sArr[i].printSave();
		} //for i
		*/
				
		
		Save [] sArr = {
				new Save("권태정", 10000, 0.04),
				new Save("김가은", 23000, 0.04),
				new Save("김도훈", 3300, 0.04),
				new Save("김민선", 100000, 0.04),
				new Save("김승효", 100500, 0.04)
			
				
		};
		
		//객체명.인스턴스변수
		
		//클래스명.클래스멤버(필드, 메소드);
		//The field Save.rate is not visible 접근지정자 오류
		//private 접근하려면 get/ set 필요
		//Save.rate = 0.08;
		Save.setRate(0.08);
		System.out.println(Save.getRate());
		
		
		for(Save s : sArr) {
			s.printSave();
		}

	}

}
