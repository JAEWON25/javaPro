package days02;

public class Ex03_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="홍길동";
		
		//"홍길동!!! 안녕하세요. 홍길동입니다. "
		System.out.println(name + "!!! 안녕하세요. "+ name +"입니다.");
		System.out.printf("%s!!! 안녕하세요. %s입니다. %s입니다.\n", name, name, name);
		System.out.printf("%1$s!!! \n 안녕하세요. %1$s입니다. %1$s입니다.", name); // 1$로 인해 name 하나로 가능
	}

}
