package days13;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] m = new int [5][5];
		
		//fillM01(m); //채워넣는 함수
		//fillM02(m);
		fillM03(m);
		fillM04(m);
		dispM(m);
		

	}

	private static void fillM04(int[][] m) {
	      /*
	       0열 1열 2열 3열 4열
	   0행 [ 5][10][15][20][25]   //+5씩 
	   1행 [ 4][ 9][14][19][24]
	   2행 [ 3][ 8][13][18][23]
	   3행 [ 2][ 7][12][17][22]
	   4행 [ 1][ 6][11][16][21]
	   */
		/*
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = 5 - i + j*5; 
			} //for j
		} //for i
		*/
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[4-j][i] = 5*i+j+1; 
			} //for j
		} //for i
	}

	private static void fillM03(int[][] m) {
		/*
		for (int i = 0; i < m.length; i++) {           // 행크기
	         for (int j = 0; j < m[i].length; j++) {    // 열크기
	        	 if(i%2==0 )//짝수행일때는 안건든다
	        			 m[i][j] = 5*i+j+1;
	        	 else
	        		 m[i][j] = 5*(i+1)-j;
	         } // for j
	         
	      } // for i
	      */
		for (int i = 0; i < m.length; i++) {           // 행크기
	         for (int j = 0; j < m[i].length; j++) {    // 열크기
	        			m[i][i%2==0?j:4-j] = 5*i+j+1;
	        	 
	         } // for j
	         
	      } // for i
		
	}

	private static void fillM02(int[][] m) {
		// TODO Auto-generated method stub
		for (int i = 0; i < m.length; i++) {           // 행크기
	         for (int j = 0; j < m[i].length; j++) {    // 열크기
	            //m[i][j] = (m.length*m[i].length) - (m[i].length*i + j);  25부터 채워넣겠다
	        	 m[4-i][4-j] = 5*i+j+1;
	         } // for j
	         
	      } // for i
	}

	private static void fillM01(int[][] m) {
		
		/*
		//v를 통해 2차원 배열에 값넣기
		for (int i = 0, v=1; i < m.length; i++) {           // 행크기
	         for (int j = 0; j < m[i].length; j++, v++) {    // 열크기
	            m[i][j] = v; 
	         } // for j
	         
	      } // for i
	      */
		//v변수를 선언하지 않고 값넣기
		for (int i = 0, v=1; i < m.length; i++) {           // 행크기
	         for (int j = 0; j < m[i].length; j++, v++) {    // 열크기
	            m[i][j] = 5*i+j+1; 
	         } // for j
	         
	      } // for i
	}

	private static void dispM(int[][] m) {
		// TODO Auto-generated method stub
		System.out.println("     0열 1열 2열 3열 4열");
	       
	      for (int i = 0; i < m.length; i++) {           // 행크기
	         System.out.printf("%d행 " , i);
	         for (int j = 0; j < m[i].length; j++) {    // 열크기
	            System.out.printf("[%2d]", m[i][j]);
	         } // for j
	         System.out.println(); // 개행
	      } // for i
	}

}
