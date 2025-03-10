package days25;

import java.io.FileWriter;

public class Ex06 {

	public static void main(String[] args) {
		
		String name = "홍길동"; 
		//기본형 8가지중에 3가지(int, double, boolean)
		int kor = 90, eng = 80, mat = 99;
		int tot = kor + eng + mat;
		double avg = (double) tot/3;
		boolean gender = true;
		
		//이 학생정보를 파일로 저장
		String fileName = "student.txt"; //javaPro 폴더에 저장
		
		try (FileWriter writer = new FileWriter(fileName, true)){ //
			
//			writer.append(0) 끝에 계속 추가하겠다는 메서드
			String data = String.format("%s, %d, %d, %d, %d, %.2f, %b\n", name, kor, eng, mat, tot, avg, gender);
			writer.append(data); //누적
//			김길동, 90, 80, 99, 269, 89.67, true
//			홍길동, 90, 80, 99, 269, 89.67, true

//			writer.write(data); //파일이 덮어쓰기된다.
			writer.flush();
		} catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println("end");

	}

}
