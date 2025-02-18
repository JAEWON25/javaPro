package days12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] m = {3,5,2,4,1};
		System.out.println(m.length);
		System.out.println(Arrays.toString(m)); //배열 출력
		//1. 6이라는 값을 배열의 제일 뒤에 추가
		//2. 2 가 있는 위치를 찾아서 100을 삽입
		
		// m[5] = 6; -> 오류 (배열 크기 부족) 
		m = Arrays.copyOf(m, m.length+1); //배열 크기 2증가
		m[5] = 6;
		
		/*
		int index = -1;
		for (int i = 0; i < m.length; i++) {
			if(m[i] == 2) index = i;
		} //for i
		
		for(int i =0; i < 7; i++) {
			if(m[i] == 2) {
				m = Arrays.copyOf(m, m.length+1);
				m[i] = 100;
				
				m[i+1] = m[i];
			}
		}
		//배열 단점 -> 컬렉션 클래스 사용(List) + indexOf() 메서드
		List<Integer> list = List.of{3,5,2,4,1,6};
		int index = list.indexOf(2);
		System.out.println(">index:"+index);
		System.out.println(Arrays.toString(m));
				*/
		
		//암기
		//배열 -> List 변환 . indexOf() 메서드
		
		int index = Arrays.stream(m)         //배열 -> stream변환
						.boxed()   // 기본형 int[] -> 래퍼클래스 Integer[] 변환
						.collect(Collectors.toList()) //list변환
						.indexOf(2);
		System.out.println(">index:"+index);
		/*
		for (int i = m.length-2; i >= index; i--) {
			m[i+1] = m[i];
		} //for i
		m[index] = 100;
		System.out.println(Arrays.toString(m));
		*/
		
		int [] temp = new int[m.length+1];
	    System.arraycopy(m, 0, temp, 0, index);
	    System.arraycopy(m, index, temp, index+1, m.length - index);
	    m = temp;
	    m[index] = 100;
	    System.out.println(Arrays.toString(m));
	    
	    index = 2;
	    temp = new int[m.length-1];
	    System.arraycopy(m, 0, temp, 0, index);
	    System.arraycopy(m, index+1, temp, index, m.length-1 - index);
	    m = temp;
	    System.out.println(Arrays.toString(m));
	}

}
