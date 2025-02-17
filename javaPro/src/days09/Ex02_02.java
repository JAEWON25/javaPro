package days09;

public class Ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = power(2, -3); //int result = power(2, -3); -> 0.125
		System.out.println( result );
		recursivePower(2, -3);

	}
	private static double recursivePower(int b, int e) {
		// TODO Auto-generated method stub
		if(e<0)return 1/recursivePower(b, -e);
		else if(e == 1)return b;
		else          return b*recursivePower(b, e-1);
		
	}
	private static double power(int b, int e) {
		
		if(e == 0) return 1;
		int result =1;
		for(int i = 1; i <= Math.abs(e) ;i++) {
			result *= b;
		}
		
		return e< 0? (double)1/result: result;
	}

}
