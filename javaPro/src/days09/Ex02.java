package days09;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = factorial(5);
		System.out.printf("\b=%d", result);
		recursiveFactorial(5);

	}

	private static int recursiveFactorial(int n) {
		// TODO Auto-generated method stub
		if(n ==1 || n == 0)return 1;
		else return n * recursiveFactorial(n-1);
	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		int result = 1;
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d", i);
			result *= i;
		} //for i
		return result;
	}

}
