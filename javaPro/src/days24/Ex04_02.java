package days24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      String className = "oracle.jdbc.driver.OracleDriver";  // JDBC드라이버            
	      String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
	      String user = "scott";                                                                   
	      String password = "tiger";
	      
	      String fileName = "oarcle.config";
	      
	      try (FileReader reader = new FileReader(fileName);
	    		  BufferedReader br = new BufferedReader(reader)){
	       
	    	  className = br.readLine().split("=")[1];
	    	  url = br.readLine().split("=")[1];
	    	  user = br.readLine().split("=")[1];
	    	  password = br.readLine().split("=")[1];
	    	  
	    	  System.out.println(className);
	    	  System.out.println(url);
	    	  System.out.println(user);
	    	  System.out.println(password);
	    	  
	         System.out.println(" end ");
	      } catch (Exception e) {
	         System.out.println(e.toString());
	      }

	}

}
