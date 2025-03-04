package days13;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//가변배열 : 행마다 크기가 다르다
		int [][] m = new int[3][];
		m[0] = new int [5];
		m[1] = new int [6];
		m[2] = new int [7];
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
