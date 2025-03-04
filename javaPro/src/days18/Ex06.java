package days18;

public class Ex06 {

	public static void main(String[] args) {
		//[try catch]
		System.out.println("1-DB Open..");
		try { 
			System.out.println("2");
			System.out.println(100 / 0);
			System.out.println("3");
		}catch(ArithmeticException e) {
			System.out.println("4");
		}catch(Exception e) {
			System.out.println("5");
		}finally {//이 블럭은 try블럭에서 예외가 발생한 유무에 상관없이 실행
			System.out.println("6 - DB Close..");
		}
		System.out.println("7");
		System.out.println("end"); //2467 end
	}
}
