package days19;

import java.util.StringJoiner;

public class Ex05_05 {

	public static void main(String[] args) {
		/*
		 * [1] String.join()
		String team1 = "박정현, 김하은, 김민곤, 박예진, 양희동";
		String [] team1Arr = team1.split("\\s*,\\s*");
		String content = "<ol>\n  <li>";
		content += String.join("<li>\n  </li>", team1Arr);
		content += "<li>\n  <ol>";
		System.out.println(content);
		*/
		
		//[2] StringJoiner클래스
		String team1 = "박정현, 김하은, 김민곤, 박예진, 양희동";
		String [] team1Arr = team1.split("\\s*,\\s*");
		
		StringJoiner sj = new StringJoiner("<li>\n </li>", "<ol>\n  <li>", "</li>\n<ol>");
		for (int i = 0; i < team1Arr.length; i++) {
			sj.add(team1Arr[i]);
		} //for i
		System.out.println(sj.toString());

	}

}

/*
  <li>박정현<li>
  </li>김하은<li>
  </li>김민곤<li>
  </li>박예진<li>
  </li>양희동<li>
  <ol>
  
  */