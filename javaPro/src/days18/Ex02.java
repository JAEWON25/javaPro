package days18;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Ex00 obj = new Ex00();
		obj.aaa();
		obj.bbb();
		obj.ccc();
	*/
		
		//인터페이스 업캐스팅
//		IC Ex00 obj = new Ex00();
//		obj.aaa();
		
		//부모 인터페이스에도 업캐스팅이 가능하다.
	//	IA Ex00 obj = new Ex00();
	//	obj.aaa();

	}

}

interface IA{
	void aaa();
}

interface IB{
	void aaa();
}

//인터페이스끼리 상송할 때 사용하는 키워드? extends
interface IC extends IA,IB{
	void ccc(); //추상 메서드
}

class Ex00 implements IC{
	
	//구현하지않으면class앞에 abstract붙여야되지만 구현한다면 abstract 불필요
	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}
	
	public void bbb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ccc() {
		// TODO Auto-generated method stub
		
	}
	
}