package days02;

public class Ex05_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[실수 표현]
		//1)실수 3.14 -> 이진수 형태로 표현이 되어야 저장가능 ->float 4바이트 2^4 [][] ...
		//[예]
		/*
		 * 0.625 -> 이진수로 표현하고 싶다.(2진법 변환)
		 * 0.625 x 2 = [1].25
		 * 0.25  x 2 = [0].5
		 * 0.5   x 2 = [1].0
		 * 
		 * 위에서부터 읽으면 101
		 * 0.625 -> 0.101(2)
		 * 
		 * 0.101(2) -> 10진수 실수 변환
		 * 0.1         0        1
 		 *   2^-1  +   2^-2  +  2^-3     --> 계산하면 0.625
 		 *   
 		 * [예]
 		 * 0.123456실수 유한실수 인데 이진법으로 계속 곱하기 2해서 이진실수로 만들면 무한수가됌
 		 * 0.000111111100110001101011011110001110001101010101... 이러다보니 뒤가 짤려 오차가 발생. 
 		 * 들어갈 수 있는수만 들어가기때문.
 		 * 
 		 * [예] 9.123456 실수 -> 2진수 실수 변환 -> float(4)/double(8)
		 * */
		

	}

}
