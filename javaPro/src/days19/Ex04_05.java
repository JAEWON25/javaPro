package days19;

import java.util.Arrays;

/*
 * 원하는 화면 출력
<ol>
    <li>권용범</li>   
    <li>김대원</li>
    <li>김민곤</li>
    <li>김하은</li>
    <li>라일락</li>
 </ol>
*/

public class Ex04_05 {
	public static void main(String[] args) {
		String team1 = "권용범,   김대원   , 김민곤  ,   김하은,  박세훈";   
		String regex ="\\s*,\\s*"; // split 구분자로 사용할 정규표현식(,사이로 앞뒤로 공백이 얼마나있든 상관없다)
		//String [] nameArr = team1.split(regex, 3); //짜를때 3개까지만 짤라라
		String [] nameArr = team1.split(regex);
		System.out.println(Arrays.toString(nameArr));
		
		String content = "<ol>\n  </li>";
			   content += String.join("</li>\n  </li>", nameArr);
			   content += "</li>\n</ol>";
		System.out.println(content);
	} //main
}
