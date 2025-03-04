package days16;

public class Ex03 {

	public static void main(String[] args) {
		// JDK1.5 메서드의 매개변수의 갯수가 고정->동적 지정할 수 있다.
		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3));
		
		int [] m = {1,2,3,4,5,6};
		System.out.println(sum(m));
 
	}
	private static int sum(int i, int j, int k) {
		return i+j+k;
	}
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int sum(int[] args) {
		int result = 0;
		for(int i : args) {
			result += i;
		}
		return result;
	}

}
