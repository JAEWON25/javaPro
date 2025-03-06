package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {
		
		String [] names = {"박예진", "양희동", "박정현", "김대원", "주정호", "이찬희"};
		
//		[1]
//		ArrayList list = new ArrayList();
//		for (int i = 0; i < names.length; i++) {
//			list.add(names[i]); //배열에 있는 요소들이 list안으로 들어간다.
//		} //for i
//		
//		System.out.println(list);
		
//		[2] T..args 가변인자
//		String [] -> List<String>
		List list = Arrays.asList(names);
		System.out.println(list);
		//list -> ArrayList 변환
		ArrayList list2 = new ArrayList(list); //매개변수 다형성
		System.out.println(list2);
		
		
//		ArrayList -> String [] 변환
//		[1]
//		String [] sArr = new String[list2.size()];
//		for (int i = 0; i < list2.size(); i++) {
//			sArr[i] = (String) list2.get(i);
//		} //for i
//		System.out.println(Arrays.toString(sArr));
		
//		[2]
//		Object[] oArr = list2.toArray();
//		for(Object obj : oArr) {
//			String name = (String) obj;
//			System.out.println(name);
//		}
		
//		[3]Obj[] -> String[] 변환 
//		String [] sArr(String[])list.toArray();
		
//		String [] sArr = (String[])list2.toArray(new String[list2.size()]);
//		System.out.println(Arrays.toString(sArr));
		
		//[암기]
		String [] sArr = (String[])list2.toArray(String[]:: new);
		System.out.println(Arrays.toString(sArr));

	}

}
