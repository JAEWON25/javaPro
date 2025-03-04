package days16;

import java.util.Arrays;

public class days15_Test {

	public static void main(String[] args) {
		
        String n = "keNik";
        String m = "kKnie";
        
        n = n.toUpperCase();
        m = m.toUpperCase();
        
        char[] arr1 = n.toCharArray();
        char[] arr2 = m.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int flag = 1;
        for(int i = 0; i < 5; i++) {
        	if (arr1[i] == arr2[i]) {
                flag = 0;
            } 
        }
        
        if (flag ==0) {
        	System.out.println("같다");
        }else {
        	System.out.println("다르다");
        }

	}//main

}//class
