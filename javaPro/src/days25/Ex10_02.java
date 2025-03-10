package days25;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_02 {

	public static void main(String[] args) {
		
		String currentDirectory = System.getProperty("user.dir");
//		System.out.println(currentDirectory); //C:\Class\JavaClass\javaPro
		File parent = new File(currentDirectory);
//		parent.isDirectory(); //true
		
		String pattern = "yyyy-MM-dd a h:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		//파일 목록 + 하위 디렉토리 포함 String[]
//		String [] list = parent.list();
		File[] list = parent.listFiles();
		for (int i = 0; i < list.length; i++) {
//			System.out.println(list[i]); //하위에 있는 폴더명들이 보인다.
			File f = list[i];
			String name = f.getName();
			
			long l =  f.lastModified(); //마지막 수정된 날짜가 보인다.
			Date d = new Date(l);
			long fLength =  f.length(); //파일일 경우
			System.out.printf("%s\t%s\t%s\n",f.isDirectory()?"["+name+"]": name,
					sdf.format(d),
					f.isDirectory()? " ": ( (int)( Math.ceil((double)fLength/1024)))+"KB" );


		} //for i

	}

}
