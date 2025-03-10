package days25;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex07_02 {
//DataInputStream 파일읽어드릴때
	public static void main(String[] args) {
		
		String name; 
		//기본형 8가지중에 3가지(int, double, boolean)
		int kor , eng , mat ;
		int tot;
		double avg ;
		boolean gender ;
		
		//이 학생정보를 파일로 저장
		String fileName = "student02.dat"; // .dat 는 이진 data를 뜻한다. -> .data로 줘도된다.
		
		try (FileInputStream in = new FileInputStream(fileName);
				DataInputStream dis = new DataInputStream(in);){ 
			
			//[1] while(true) { 같은 내용 }
			//[2] 스트림에 남아있는 것 까지
			while(dis.available() > 0) {
				name = dis.readUTF();
				kor = dis.readInt();
				eng = dis.readInt();
				mat = dis.readInt();
				tot = dis.readInt();
				avg = dis.readDouble(); 
				gender = dis.readBoolean();
				
	            System.out.printf("%s,%d,%d,%d,%d,%.2f,%b\n"
	                    , name, kor, eng, mat, tot, avg, gender);
			}
			

		}catch(EOFException e) {} 
		catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println("end");

	}

}



