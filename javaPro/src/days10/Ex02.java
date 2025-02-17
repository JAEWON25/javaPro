package days10;

public class Ex02 {

	public static void main(String[] args) {
		// [정보처리기사]
		/*
		5만원 : 2 개
		1만원 : 2 개
		5천원 : 1 개
		1천원 : 0 개
		5백원 : 1 개
		1백원 : 2 개
		5십원 : 1 개
		1십원 : 1 개
		5원 : 0 개
		1원 : 0 개
		*/
		
		int money = 125760;
		int share, rest;
		/*
		share = money / 50000;
		System.out.printf("5만원 : %d개\n", share);
		rest = money % 50000; //25760
		money = rest;
		
		share = money / 10000;
		System.out.printf("1만원 : %d개\n", share);
		rest = money % 10000; 
		money = rest;

		money = rest;
	    share = money/5000;
	    System.out.printf("5천원 : %d 개\n", share);
	    rest = money%5000;
	      
	    money = rest;
	    share = money/1000;
	    System.out.printf("1천원 : %d 개\n", share);
	    rest = money%1000;   
	    */
		
		//int [] unit = {50000,10000,5000,1000,500,100,50, 10, 5, 1};
		String [] s_unit = { "5만원","1만원","5천원", "1천원", "5백원", "1백원","5십원","1십원","5원","1원" };
		for(int i =0; i < s_unit.length; i ++) {
			//share = money / s_unit[i];
			//System.out.printf("%s : %s", s_unit[i], );
		}
	}

}
