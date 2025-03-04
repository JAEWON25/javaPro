package days16;

public class Ex05_02 {

	public static void main(String[] args) {
		// 클래스 변수의 초기화 순서 : 기본값 -> 명시적 초기화 -> 클래스 초기화
		//인스턴스 변수의 초기화 순서 : 기본값 -> 명시적 초기화 -> 인스턴스 초기화 블럭 -> 생성자
		
		//공장에서 제품을 생산할 때 제품마다 생산 일련번호(serialNumber)를 부여..
		//인스턴스 마다 고유한 일련번호를 부여
		Document doc1 = new Document();
		Document doc2 = new Document();
		Document doc3 = new Document("자바문서.txt");
		Document doc4 = new Document();
		Document doc5 = new Document();
		

	}

}

class Document{
	String fileName;
	static int count = 1;
	
	//인스턴스 초기화 블럭 -> 생성자보다 먼저 호출 1, 2, 자바문서, 4, 5
	{
		count++; //생성자안에서 공통적인게 있을때 인스턴스초기화로 밖으로 뺸다.
	}
	//클래스 초기화하면 처음에 한번만 실행 따라서 1,2,3,4,5 불가능
	
	public Document() {
		//count++;
		this(String.format("noname%d.txt", count));
	}
	
	public Document(String fileName) {
		//count++;
		this.fileName = fileName;
		System.out.printf("문서 \"%s\"가 생성되었습니다.\n", this.fileName);
		
	}
}