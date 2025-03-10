package days25;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		// [메모리 스트림]
		
		byte [] buf = {0,1,2,3,4,5,6,7,8,9};
		
		try (ByteArrayInputStream bais = new ByteArrayInputStream(buf);
			 ByteArrayOutputStream baos = new ByteArrayOutputStream();){
			int b;
			while((b = bais.read()) != -1) { //byte값을 읽어온다.
//				System.out.println(b);
				baos.write(b);
			}//while
			
			byte [] outBuf =  baos.toByteArray();
			System.out.println(Arrays.toString(outBuf));//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
	}

}
