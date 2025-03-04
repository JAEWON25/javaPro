package days13;

public class Ex02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3차원 배열의 초기화 설명
		
		int [][][] m = {
				{
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12}
				},
				{
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12}
				}
		};
		
		dispM(m);
	}

	private static void dispM(int[][][] m) {
		// TODO Auto-generated method stub
		for (int i = 0; i < m.length; i++) { //면 크기 m.length
			System.out.printf("[%d]면\n ", i);
			for (int j = 0; j < m[i].length; j++) { // 행크기
				for (int j2 = 0; j2 < m[i][j].length; j2++) { //열크기
					System.out.printf("m[%d][%d][%d] = %d ", i, j, j2, m[i][j][j2]);
				} //for j2
				System.out.println();
			} //for j
			System.out.println();
		} //for i
		
	}

}
