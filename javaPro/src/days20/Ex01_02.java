package days20;

public class Ex01_02 {

	public static void main(String[] args) {
		
        String data = "안녕하세요. 홍길동입니다. 이름은 홍길동입니다. 별명도 홍길동입니다.";
        
        int index = 0;  
        int count = 1;  
        while ((index = data.indexOf("홍길동", index)) != -1) {
            System.out.printf("> %d번째 찾은 위치 : %d\n", count, index);
            index += 3;  
            count++;
        }
        
        String changeName = data.replaceFirst("홍길동", "양재원");
        System.out.println("ㄴ. 결과");
        System.out.println(changeName);

	}

}
