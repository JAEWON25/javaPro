package days23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Stack;

public class Ex02 {

	public static void main(String[] args) {
		
		/*[1]
	      int[][] bingo = new int[5][5];
	      
	      Stack<Integer> stack = new Stack<>();
	      
	      int[] numbers = new Random().ints(1,26).distinct().limit(25).toArray();
	      
	      for(int k : numbers) {
	         stack.push(k);
	      }
	      
	      for(int i=0; i<5; i++) {
	         for(int j=0; j<5; j++) {
	            bingo[i][j] = stack.pop();
	            //bingo[i][j] = numbers[5*i+1]
	         }
	      }
	      
	      for(int i=0; i<5; i++) {
	         for(int j=0; j<5; j++) {
	            System.out.printf("%[2d]", bingo[i][j]);
	            
	         }
	         System.out.println();
	         
	         
	      }
	      */
		
		/*[2]
	      int[][] bingo = new int[5][5];

          LinkedHashSet<Integer> num = new LinkedHashSet<>();
          while (num.size()<25) {
             Random rnd = new Random();
             int n = rnd.nextInt(25)+1;
             num.add(n);
          } //  while
          
          // 2. HashSet -> bingo 옮기는 작업
          //왜 배열로 바꿔서 넘겨냐라고하면 
          //num.get() 가져오는 이런 메서드가 없다. 
          //1.반복자
          //2.Set -> List get() 사용가능
          Object[] numArr = num.toArray();
          for (int i = 0; i < numArr.length; i++) {
             bingo[i/5][i%5] = (int) numArr[i] ;
          } // for i
          
          for (int i = 0; i < bingo.length; i++) {
             for (int j = 0; j < bingo[i].length; j++) {
                System.out.printf("[%02d]", bingo[i][j]);
             } // for j
             System.out.println();
          } // for i
          */
		
		/*[3]*/
		
		int [][] bingo = new int [5][5];
		//HashSet<Integer> hs = new HashSet<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 1; i <= 25; i++) {
			al.add(i);
		}
		System.out.println(al);
		
		//HashSet -> bingo 이차원 배열 옮기는 작업
	      Random rnd = new Random();
	      
	      int i = 0;
	      while(!al.isEmpty()) {
	    	  int index = rnd.nextInt(al.size()); //0<=  < al.size()
	    	  int n = al.remove(index); //제거하고 돌려준다.
	    	  bingo[i/5][i%5] = n; // 1차원배열 -> 2차원 배열로 수식.
	    	  i++;
	      }
		
	    
		
		for (int i1 = 0; i1 < bingo.length; i1++) {
			for (int j = 0; j < bingo[i1].length; j++) {
				System.out.printf("[%02d]", bingo[i1][j]);
			} //for j
		} //for i


	}

}
