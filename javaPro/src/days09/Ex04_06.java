package days09;

public class Ex04_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String rrn = "830412-2700001";
		int sum = 0;
	      String nohypen = "";

	      for (String tmp : rrn.split("-")) {
	         nohypen += tmp;
	      }
	      
	      System.out.println(nohypen);
	      for(int i=0; i<=11; i++) {
	         char a = nohypen.charAt(i);
	         int k = Integer.parseInt(a+"");
	         sum += k*(2+i%8);
	         //{2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
	      }

	      int result = (11 - (sum % 11))%10;
	      
	      if (Integer.parseInt(nohypen.charAt(12)+"") == result) System.out.println("유효");

	}

}
