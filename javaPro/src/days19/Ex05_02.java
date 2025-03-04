package days19;

public class Ex05_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * [1]
		//long start = System.currentTimeMillis();
		long start = System.nanoTime();
		int sum = 0;
		for (int i = 0; i < 100000000; i++) {
			sum += i;
			
		} //for i
		long end = System.nanoTime();
		//long end = System.currentTimeMillis();
		//System.out.println(">>처리 시간 : " + (end-start)+"ms");
		System.out.println(">>처리 시간 : " + (end-start)+"ns");
		*/
		//[2]
		testStringBuffer();
	}

	//0.01초 걸린다. 
	private static void testStringBuffer() {
		long start = System.nanoTime();
		StringBuffer s = new StringBuffer("a");
		for (int i = 0; i < 2000000; i++) {
			//s += "a";
			s.append("a");
		} //for i
		long end = System.nanoTime();
		System.out.println(">>처리 시간 : " + (end-start)+"ns");
		
	}

	//결과 9분걸린다 StringBuffer or StringBuilder사용할것 변경사항있으면.
	private static void testString() {
		long start = System.nanoTime();
		String s = "a";
		for (int i = 0; i < 2000000; i++) {
			s += "a";
		} //for i
		long end = System.nanoTime();
		System.out.println(">>처리 시간 : " + (end-start)+"ns"); //결과 9분걸린다 StringBuffer or StringBuilder사용할것 변경사항있으면.
	}

}
