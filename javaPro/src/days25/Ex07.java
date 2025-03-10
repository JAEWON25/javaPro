package days25;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex07 {
//dataOutputStream 보조 스트림 -> 파일 읽기
	public static void main(String[] args) {
		
		String name = "김현태"; 
		//기본형 8가지중에 3가지(int, double, boolean)
		int kor = 90, eng = 80, mat = 99;
		int tot = kor + eng + mat;
		double avg = (double) tot/3;
		boolean gender = true;
		
		//이 학생정보를 파일로 저장
		String fileName = "student02.dat"; // .dat 는 이진 data를 뜻한다. -> .data로 줘도된다.
		
		try (FileOutputStream out = new FileOutputStream(fileName, true);
				DataOutputStream dos = new DataOutputStream(out);){ 
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(tot);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);
			
			dos.flush();


		} catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println("end");

	}

}


