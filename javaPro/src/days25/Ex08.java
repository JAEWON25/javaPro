package days25;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Ex08 {

	public static void main(String[] args) throws IOException {
		byte[] n = {1,2,3};
		byte[] m = {4,5,6};
		byte [] k = {7,8,9};
		//각각의 byte[] -> 메모리 스트램 3개로 생성
		// -> 읽 -> sequence[Inputstream]1개 -> 처리
		ByteArrayInputStream baisN = new ByteArrayInputStream(n);
		ByteArrayInputStream baisM = new ByteArrayInputStream(m);
		ByteArrayInputStream baisK = new ByteArrayInputStream(k);
		
//		SequenceInputStream sis = new SequenceInputStream(baisN, baisM);
//		SequenceInputStream sis2 = new SequenceInputStream(sis, baisk);
		
//		[2]
		Vector<ByteArrayInputStream> v = new Vector<>();
		v.add(baisN);
		v.add(baisM);
		v.add(baisK);
		Enumeration<ByteArrayInputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		
		int b;
		while((b=sis.read())!= -1) {
			System.out.println(b);
		}
		
	}

}
