package days13;

public class Ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 배열의 초기화 
		
		//int [][] m = new int[2][4]; //2행 사열 int 2차원 배열
		/*
		int [][] m = new int[][] {
			{1,2,3,4}, //0번째행 4열
			{5,6,7,8} // 1형  4열
		};
		*/
		
		int [][] m = {
			{1,2,3,4}, //0번째행 4열
			{5,6,7,8} // 1형  4열
		};
		
		dispM(m);
	}

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) { //행의 크기 m.length
			for (int j = 0; j < m[i].length; j++) {// 열의 크기 m[i].length
				System.out.printf("m[%d][%d] = %d ", i, j, m[i][j]);
			} //for j
			System.out.println();
		} //for i
		
	}

}
