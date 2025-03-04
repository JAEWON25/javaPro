package days15;

public class Ex02 {

	public static void main(String[] args) {
		// [JVM 메모리 구조]
		/*
		 * # [JVM 메모리 구조]

- 본인이 설계한 응용프로그램을 실행하면 JVM이 OS로부터 프로그램을 실행하는 데 필요한 메모리를 할당 받는다.
- 할당 받은 메모리를 JVM은 용도에 따라서 여러 영역으로 나누어서 관리
    - Method Area :
        - 프로그램 실행 시 클래스 파일(.class) → 읽어서 클래스에 대한 정보를 Method   Area 영역에 올린다.
        - 클래스 변수
    - call [stack](호출) :
        - 메소드가 호출 될 때 메소드에서 사용할 저장 공간. ( 지역 변수도 스택영역에 잡힌다.)
    - Heap(동적 영역)
        - new 연산자에 의해서 저장 공간 잡힌다. new int[3] , new Person()
        - 동적영역에 잡히는 걸 인스턴스라고 한다. → 인스턴스 변수는 heap 영역에 잡힌다.
		 * 
		 * */
		

	}

}
