package days09;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 13. - 오후 12:33:54
 * @subject 
 * @content
 */
public class Ex04_03 {

   public static void main(String[] args) { 
      // 830412-2700001
      Scanner scanner = new Scanner(System.in); 
      String rrn = getRrn(scanner);
      System.out.println( rrn );
      
      // 주민등록번호를 가지고 나이 알기
      //세는나이 = 올해연도 -생일년도 + 1 = 2
      int age = getCountingAge(rrn);
      System.out.println(age);
      
      int age2 = getAmericanAge(rrn);
       
   } // main

   private static int getAmericanAge(String rrn) {
	/*
	LocalDate d = LocalDate.now();
	int currentYear = d.getYear();
	int currentMonth = d.getMonthValue();
    int currentDay = d.getDayOfMonth();
	
	 int year = getCentury(rrn) + Integer.parseInt(rrn.substring(0,2));
     int month = Integer.parseInt(rrn.substring(2, 4));
     int day = Integer.parseInt(rrn.substring(4, 6));
	
     int age = currentYear - year;

 
     if (currentMonth < month || (currentMonth == month && currentDay < day)) {
         age--;
     }

	return age;
	*/
	//년월 가져오지말고 313 < 1225 이런식으로 비교
	int americanAge = getCountingAge(rrn)-1;
	int birthMD = Integer.parseInt(rrn.substring(2, 6));
	Date d = new Date();
	int currMD= (d.getMonth()+1)*100 + d.getDate();
	if(birthMD > currMD) americanAge--;
	return americanAge;
	
}

private static int getCountingAge(String rrn) {
	      // 자바에서 날짜/시간 다루는 기능이 구현된 클래스 : Date, Calendar
	      //                                         LocalDate, LocalTime, LocalDateTime
	      /* [1]
	      Date d = new Date();
	      System.out.println( d.getYear() + 1900 );
	      */
	      
	      /* [2]
	      Calendar c = Calendar.getInstance();
	      System.out.println(  c.get(Calendar.YEAR) );
	      */
	      
	      LocalDate d = LocalDate.now();
	      int currentYear = d.getYear(); // 올해년도
	      
	      // int birthYear = Integer.parseInt(getBirthday(rrn).substring(0, 4));
	      int birthYear = getYear(rrn);
	      
	      return currentYear - birthYear + 1;
	   }

private static int getYear(String rrn) {
	// TODO Auto-generated method stub
	int year = getCentury(rrn) + Integer.parseInt(rrn.substring(0,2));
	return year;
}

private static String getBirthday(String rrn) {
      int year = getCentury(rrn) + Integer.parseInt(rrn.substring(0,2));
      int month = Integer.parseInt(rrn.substring(2, 4));
      int day = Integer.parseInt(rrn.substring(4, 6));
      String birthday = String.format("%d년 %d월 %일", year, month, day);
      return birthday;
   }

   private static boolean getNationality(String rrn) {
      char gender = rrn.charAt(7) ;
      switch (gender) {  
      case '9': case '0': 
      case '1': case '2': case '3': case '4':   
         return true;
      // case '5': case '6': case '7': case '8':
      default:
          return false;          
      } // switch
   }

   private static int getCentury(String rrn) {
      char gender = rrn.charAt(7) ;
      switch (gender) {  
      case '9': case '0':
         return 1800; 
      case '1': case '2': case '5': case '6':   
         return 1900;
      // case '3': case '4': case '7': case '8':
      default:
          return 2000;          
      } // switch
   }
   
   private static boolean getGender(String rrn) {
      // [2]  String rrn.substring(0, 0)
      String strGender = rrn.substring(7, 8); // "2"
      int gender = Integer.parseInt(strGender); // 2
      return  gender%2==1 ? true:false;
      
      /* [1]
      // char   rrn.charAt(index); 
      // 830412-[2]700001
       char gender = rrn.charAt(7) ;
      switch (gender) { // '2' => 2
      case '9': case '1': case '3': case '5': case '7':
         return true; // 남자         
      default:
          return false; // 여자         
      } // switch
      */      
   }

   private static String getRrn(Scanner scanner) {
      // 유효성 검사   숫자6-숫자7
//      String regex = "[0-9]{6}-[0-9]{7}";
      String regex = "\\d{6}-\\d{7}";
      String rrn ;
      
      // [알림], 실패횟수
      do {
         System.out.print("> 주민등록번호 14자리 입력( 예: 000000-000000) ? ");
         rrn = scanner.next();
      } while ( !rrn.matches(regex) );
      
      return rrn;
   }

} // class