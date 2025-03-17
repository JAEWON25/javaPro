package days28;

import java.io.File;
import java.util.stream.Stream;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<File> sf =  Stream.of(
				new File("Ex01"),
				new File("Ex01.bak"),
				new File("Ex02.java"),
				new File("Ex01.txt")
				);
		Stream<String> fnameSt =   
				sf.map(File::getName) //파일 이름만 가지고있는 스트림을 만들었다.
				.filter(s->s.indexOf('.') != -1) //.이있는것만 가져오겠다. (점이 있는 파일만 가져온다.
				.peek( s -> System.out.printf("filename=%s\n", s )) //peek -> 제거하지않고 출력하겠다.
				.map(s->s.substring(s.indexOf('.')+1)) // 확장자만
				.peek( s -> System.out.printf("extension=%s\n", s ))
				.map(String::toUpperCase)  // 대문자 변환
				.distinct();
		;
		fnameSt.forEach(System.out::println);
		
		//peek() 조회
		//연산 + 연산 사이에 올바르게 처리되었는지 확인하는 메서드

	}

}
