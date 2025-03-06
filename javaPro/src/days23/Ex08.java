package days23;

import java.io.FileReader;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     String fileName = ".\\src\\days18\\Ex10.java";
	      char one = '\u0000';
	      int code = -1;
	      //      'A'      10개
	      Map<Character, Integer> hm = new HashMap<Character, Integer>();
	      
	      try (FileReader reader = new FileReader(fileName);){

	         while ( (code = reader.read()) != -1 ) {
	            
	        	 // 'a' --> key값으로 존재? 존재하면 ++1 존재안하면 entry로 추가
	        	 //if ( [A-Za-z0-9] )
	            if ( Character.isAlphabetic(code) || Character.isDigit(code) ) {
	            	
	            	one = (char) code; //key존재 유무 확인
	            	if(hm.containsKey(one)) {
	            		//value++
	            		int oldValue = hm.get(one);
	            		hm.put(one, ++oldValue);
	            		
	            	}else {
	            		//처음 보는 글자라면 entry추가
	            		hm.put(one, 1);
	            	}
	           
	            }
	           } 
	          

	         
	         // 막대그래프 그리기
	      Set<Entry<Character, Integer>> es = hm.entrySet();
	      Iterator<Entry<Character, Integer>> ir = es.iterator();
	      while (ir.hasNext()) {
			Entry<Character, Integer> entry = ir.next();
			char key = entry.getKey();
			int value = entry.getValue();
			
			System.out.printf("%c(%d) %s\n", key, value, "#".repeat(value));
	      }
		
	          /*
	         int count = 0;
	         for (int i = 0; i < counts.length; i++) {      
	            // int[] -> IntStream
	            //               Arrays.stream(counts[i]).sum()
	            int totalCount = IntStream.of(counts[i]).sum();
	            System.out.printf("==%s:%d==\n"
	                  ,i==0?"대문자":(i==1?"소문자":"숫자")
	                  ,  totalCount );
	            
	            for (int j = 0; j < counts[i].length; j++) {
	               count  = counts[i][j];
	               System.out.printf("%c(%d) %s\n", 
	                     j+(i==0?'A':(i==1?'a':'0')), count, "#".repeat(count));
	            } // for j
	            
	         } // for i
	          */

	      } catch (Exception e) {
	         System.out.println(e.toString());
	     }


	}

}
