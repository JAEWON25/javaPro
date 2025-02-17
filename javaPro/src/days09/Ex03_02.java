package days09;

public class Ex03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rrn = "830412-1700001";
		//830412-*******
		String []rrnArr = rrn.split("-");
		System.out.println(rrnArr[0]+"-*******");
		
		
		System.out.println(rrnArr[0].concat("-*******"));
		
		System.out.println(rrnArr[0] + "-" + rrnArr[1].charAt(0)+"******");
		
		

	}

}
