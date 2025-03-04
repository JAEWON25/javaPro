package days19;

import java.util.StringTokenizer;

public class Ex05_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String team1 = "박정현, 김하은, 김민곤, 박예진, 양희동";
		//           [token] [token] [token] [token] [token]
//		[1]
//		String [] teamArr = team1.split("\\s*,\\s*");
		
//		[2]
		StringTokenizer st = new StringTokenizer(team1, ", ");
		
//		System.out.println(st.countTokens());//5
//		st.hasMoreTokens(); //이 객체안에 짤린 token이 있는지없는지 true false
//		st.nextToken(); //토큰을 하나 끄집어 내온다.
		
		//다 끄집어 내올려면
		while(st.hasMoreTokens()) {
			String name = st.nextToken();
			System.out.println(name);
		}//while
	}

}
