package days24;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;


public class Ex05 {

   public static void main(String[] args) {
      
      Properties p = new Properties();
      
      // Oracle DBMS
      // DB 연결 문자열( 설정값 )
      
      //         key               value    로 저장하려고 한다.
      String className =   "oracle.jdbc.driver.OracleDriver";  // JDBC드라이버            
      String url       =   "jdbc:oracle:thin:@localhost:1521:xe";                  
      String user      =   "scott";                                                                   
      String password  =   "tiger";
      
      
  
      
//      p.put(password, fileName)
      p.setProperty("className", className); //이걸로 저장한다.
      p.setProperty("url", url );
      p.setProperty("user", user);
      p.setProperty("password", password);
      
      //{password=tiger, className=oracle.jdbc.driver.OracleDriver, user=scott, url=jdbc:oracle:thin:@localhost:1521:xe}
      System.out.println(p);
      
      /*
      try (FileWriter writer = new FileWriter(fileName)){
    	  String comments = "Oracle ConnectionString";
    	  p.store(writer, comments);
       } catch (Exception e) {
    	   System.out.println(e.toString());
       }
       */
      String fileName = "oracle.xml";
      try (FileOutputStream outputStream = new FileOutputStream(fileName)){
    	  String comments = "Oracle ConnectionString";
    	  p.storeToXML(outputStream, comments);
       } catch (Exception e) {
    	   System.out.println(e.toString());
       }

   } // main

} // class
