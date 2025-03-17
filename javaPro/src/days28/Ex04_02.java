package days28;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex04_02 {

	public static void main(String[] args) {
		//배열을 스트림으로 만들려고한다.
		int [] iArr = {34, 64, 22, 54, 11, 9 , 89, 13, 22, 34, 100};
		
		//[기본형 스트림]
//		IntStream is =  Arrays.stream(iArr);
		//boxed()   int, int-> Integer, Integer 스트림
//		Stream<Integer> is =  Arrays.stream(iArr).boxed();
		IntStream is = IntStream.of(iArr);
		
//		int sum = is.sum(); //stream안에 sum기능이있어 편하게 구할 수 있다.
//		System.out.println(sum); //452
		
//		3) int [] -> List 변환 
//		List<Integer> list = Arrays.stream(iArr).boxed().collect(Collectors.toList()); //boxed붙이면 stream<Integer> 만들어진다.
		//스트림의 모든 요소를 수집해서 list로 돌려준다. *************
		
//		위의 is 스트림을 사용해서 ... 50이상인 것만 필터링하고싶다.
//		IntStream filterIs = is.filter(t-> t>= 50);
//		filterIs.forEach(System.out::println); //메서드 참조 - 에러 뜨면 stream은 일회성이니까 위에 주석.
		
//		is 중복제거 -> 정렬 -> 3개
		IntStream is2 = is.distinct().sorted().limit(3);
		is2.forEach(System.out::println);
//		9 11 13
		
//		max ,min 가져와라 배열에서
		OptionalInt omax = is.max();
		System.out.println(omax.getAsInt());
		
//		String [] -> stream 변환
		String [] strArr = {"aa", "bb", "cc"};
		Stream<String> ss = Stream.of(strArr);
	}

}
