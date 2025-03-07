package days24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Map.Entry;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = ".\\src\\days18\\Ex10.java";
		
		Map<Character, HashSet<String>> hm = new LinkedHashMap<>();
		
		for (int i = 'A'; i <= 'z'; i++) {
			if ( Character.isAlphabetic(i)) { //알파벳일 경우에만
				// System.out.printf("%c(%d)\n", (char)i, i);
				hm.put((char)i, new HashSet<String>()); //key 알파벳, value 공간 만들기(객체 생성)
			} // if
		} // for i
		
		String line = null; //전체를 읽어오기
		
		try (FileReader reader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(reader)){
			
			StringBuilder sb = new StringBuilder();
			while ( (line = br.readLine()) != null ) { //한 라인씩 읽어오기
				sb.append(line); //파일의 모든 내용을 읽어오기
				sb.append("\r\n");
				
			} // while
			String content = sb.toString();
			
			Pattern pattern = Pattern.compile("[A-Za-z][A-Za-z0-9_가-핳]*"); // [A-Za-z] 앞문자는 알파벳이고 그뒤는 아무거나와도된다.
			Matcher matcher = pattern.matcher(content);
			
			char key;
			HashSet<String> value;
			while(matcher.find()) { //패턴이랑 일치하는걸 찾겠다
				String word = matcher.group();
				//System.out.println(word); //여기까지하고 결과창하면 package하나 나온다. -> ^[A-Za-z] 앞에 ^ 때어준다.
				key = word.charAt(0);
				value = hm.get(key);
				value.add(word);
			}
			
			Set<Entry<Character, HashSet<String>>> es = hm.entrySet();
			Iterator<Entry<Character, HashSet<String>>>  ir = es.iterator();
			while (ir.hasNext()) {
				Entry<Character, HashSet<String>> entry =  ir.next();
				key = entry.getKey();
				value = entry.getValue();
				System.out.printf("[%c로 시작하는 단어 - %d개]\n", key, value.size());
				Iterator<String> ir2 = value.iterator();
				int no = 1;
				while (ir2.hasNext()) {
					String word = (String) ir2.next();
					System.out.printf("   %d. %s\n", no++, word);
					
					
				}
				System.out.println("=".repeat(60));
				
			}


		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
