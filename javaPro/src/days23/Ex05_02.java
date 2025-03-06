package days23;

import java.util.TreeSet;

public class Ex05_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("abc");      ts.add("alien");      ts.add("bat");
	    ts.add("car");      ts.add("Car");        ts.add("disc");
	    ts.add("dance");    ts.add("dzzz");       ts.add("dzzzz");
	    ts.add("elephant"); ts.add("elevator"); ts.add("fan");
	    ts.add("flower");
	    //오름차순으로 정리되어있다.
	    //[Car, abc, alien, bat, car, dance, disc, dzzz, dzzzz, elephant, elevator, fan, flower]
	    System.out.println(ts);
	    
	    //[abc, alien, bat, car]
	    System.out.println(ts.subSet("a", "d")); //a랑 d 사이 관련만 출력
	    
	    //[car, dance, disc]
	    System.out.println(ts.subSet("c", "dzzz"));
	}

}
