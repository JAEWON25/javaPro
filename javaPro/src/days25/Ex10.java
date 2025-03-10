package days25;

import java.io.File;
import java.io.IOException;

import com.util.FileUtil;

public class Ex10 {

	public static void main(String[] args) throws IOException {
		// File 클래스              상대경로
		String pathname = ".\\src\\days25\\Ex01.java";
		File f = new File(pathname);
		
		if(f.exists()) { //파일 존재 유무 확인.
		System.out.println(f.isDirectory()); //false
		System.out.println(f.isFile()); //true
		System.out.println(f.length() + "(bytes)"); //1151
		}
		
		System.out.println(File.separator);//스태틱이라 파일명으로 바로 접근가능
		// 역슬래쉬(\) 경로 구분자
		
		System.out.println(File.pathSeparator); 
		
		//
		String fileName = f.getName();
		System.out.println(fileName); //Ex01.java
		
		//확장자 .java
		//순수 확장자를 제외한 파일명 Ex01
		int pos = fileName.indexOf("."); 
		String ext = fileName.substring(pos); //점부터 짤라온다
		String baseFileName = fileName.substring(0,pos);
		System.out.println(baseFileName); //Ex01
		
		System.out.println("=".repeat(60));
		System.out.println(FileUtil.getFileName(f));
		System.out.println(FileUtil.getBaseName(fileName));
		System.out.println(FileUtil.getExtension(fileName));
		
		System.out.println("=".repeat(60));
		System.out.println(f.getPath()); //경로
		//.\src\days25\Ex01.java
		
		System.out.println(f.getAbsolutePath()); //절대경로
		//C:\Class\JavaClass\javaPro\.\src\days25\Ex01.java
		//위에 절대 경로를 주면 3개의 메서드 값이 똑같다.
		
		System.out.println(f.getCanonicalPath()); //표준경로
		//C:\Class\JavaClass\javaPro\src\days25\Ex01.java
		
		System.out.println("=".repeat(60));
		File pf = f.getParentFile();
		System.out.println(pf); //.\src\days25 폴더란 뜻
		System.out.println(f.getParent()); // ".\\src\\days25"
	}

}
