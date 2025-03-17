package days28;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ex04_04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String url = ".\\src\\days28\\Ex01.java";
		//라인 단위로 읽어와서 출력(처리
		//FileReader, BufferedReader, String line, while(line != null){}
		
//		Path path = Path.of(URL url);
		Path path = Path.of(url);
//		Path path = Paths.get(url);
		Stream<String> lines =  Files.lines(path);
		lines.forEach(System.out::println);

	}

}
