package days03;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[예] 9.123456 실수 -> 2진수 실수 변환 -> float(4)/double(8)
		//    1001.00011111100110101101101111100110101101101111001101011011011110011010110110111100110101101101...
		//부동소수점
		//    가수(M)
		//    1.00100011111100110101101101111100110101101101111001101011011011110011010110110111100110101101101...
		//    x 2^3
		
		
		// 0.000011111   -> 부동소수점으로 바꾸면 밑처럼 앞에 0 다 지우고 소수점 간 거리만큼 곱
		// 1.1111 x 2^-5 
		
		
		//int(4)
		//[][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][]
		
		//float(4)
		//      [ 8 E(지수값)     ][  가수 23M                                      ]
		//[s(1)][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][]
		
		
		//double(8)
		//      [ 11 E                    ][   52M (52비트 소수점)  ]
		//[s(1)][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][]
		//64 
		
		//BigDecimal 클래스
		//[][][] 8개 표현 2^3
		//[0][0][0][0] [][][][] [0][1][0][0] [0][0][0][1]
		// 0041
		// 16진수면 2^4이니까 [][][][]4 개씩 끊어서 읽으면 값 찾을수있다
		char c = '\u0041'; //
		System.out.printf("%c", c);

	}

}
