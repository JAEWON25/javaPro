package days25;

import java.io.File;
import java.io.FileReader;
import java.util.Date;

public class Ex01 {

	public static void main(String[] args) {
		// 스트림
		
//		String pathname = ".\\src\\days24\\Ex01.java";
//		File f = new File(pathname); //전체 경로 가져온다
		
//		System.out.println(f.isDirectory()); //디렉토리이니? - false
//		System.out.println(f.isFile()); //파일이니? - true
//		
//		System.out.println(f.length()); //long 2431bytes - 파일 크기 나타낸다.
		
		String parent = ".\\src\\days24"; //디렉토리
		String child = "Ex01.java"; //파일명
		File f = new File(parent, child);
//		
//		
//		System.out.println(f.lastModified()); //1741314680466 -> 마지막 수정된 날짜 (long형 값)
//		
//		Date d = new Date(f.lastModified());
//		System.out.println(d.toLocaleString()); //2025. 3. 7. 오전 11:31:20
		
		//파일 출력
		int code;
		try (FileReader reader = new FileReader(f)){
			
			while((code=reader.read())!= -1) {
				System.out.print((char)code);
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
