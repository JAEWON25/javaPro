package days23;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Ex06 {

	public static void main(String[] args) {
		//Map 
		HashMap<String, String> hm = new HashMap<>();
		//{hong=홍길동, kenik=이창익, admin=관리자} 키 - value 값 
		//순서 유지 x
		
//		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
		//{admin=관리자, kenik=이창익, hong=홍길동} 순서유지
		
		hm.put("admin", "관리자");
		hm.put("kenik", "이창익");
		hm.put("hong", "홍길동");
//		hm.put("hong", "서주원"); //키는 유일해야돼서 같을 수 없다.
		
		System.out.println(hm);
		
		//검색, 수정, 삭제 - [key], value
		//"kenik" 키
//		hm.containsKey("kenik"); //찾는 키가 있으면 true 없으면 false
//		hm.containsValue("이창익"); //찾는 value가 있으면 true 없으면 false
		
		//indexOf  --> x 없다
		//순서 유지가 안되기 때문에 인덱스 없다.
		if(hm.containsKey("kenik")) {
			//엔트리( Entry )를 찾아온다 무언가 수정하고싶으면
			
			hm.put("kenik", "서주원");
//			hm.replace("kenik", "서주원");
			System.out.println(hm); //{hong=홍길동, kenik=서주원, admin=관리자}
			
//			String value = hm.get("kenik");
//			System.out.println(value); //이창익
		}
		
		hm.put("park", "서주원");
		hm.put(null, null);
		hm.put(null, "널");
		
//		{hong=홍길동, null=널, kenik=서주원, admin=관리자, park=서주원}
		System.out.println(hm);
		
		//null 키의 엔트리 삭제
		System.out.println(hm.remove(null)); //리턴값: 삭제된 엔트리의 Value값
		System.out.println(hm);
		//{hong=홍길동, kenik=서주원, admin=관리자, park=서주원}
		
//		String value = hm.get("kenik"); //키값을 주니 벨류값을 돌려주는 것
//		String value = hm.get("abc"); //null
		String value = hm.getOrDefault("abc", "익명"); //abc가 없으면 익명이 출력나오게 하겠다.
		System.out.println(value); //서주원
		
		//merge() 병합 메소드
		Map<String, Integer> map = new HashMap<>();
        
        // 초기 데이터 추가
        map.put("apple", 1);
        map.put("banana", 2);
        
        // merge() 메서드 사용 예
        map.merge("apple", 3, (oldValue, newValue) -> oldValue + newValue);  // 기존 값 + 새 값
        map.merge("banana", 1, (oldValue, newValue) -> oldValue + newValue); // 기존 값 + 새 값
        map.merge("cherry", 5, (oldValue, newValue) -> oldValue + newValue); // cherry는 처음 등장
        
        System.out.println(map);

	}

}
