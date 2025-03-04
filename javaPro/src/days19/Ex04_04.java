package days19;

public class Ex04_04 {

	public static void main(String[] args) {
		
		String path ="c:\\temp\\src\\days01\\Sample.java";
		
		String fileName; //Sample.java
		fileName = path.substring(path.lastIndexOf("\\")+1);
		System.out.println(fileName);
		
		String ext;      //.java
		String baseFileName; //Sample
		
		//split(string regex)
		// . : 임의의 모든 문자
		baseFileName = fileName.split("\\.")[0];
		ext = fileName.split("\\.")[1];
		
		System.out.println(baseFileName);
		System.out.println(ext);
		

	}

}
