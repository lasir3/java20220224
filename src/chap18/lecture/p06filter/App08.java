package chap18.lecture.p06filter;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class App08 {
	public static void main(String[] args) throws Exception {
		String out = "output/FilterExample8.txt";
		OutputStream os = new FileOutputStream(out);
		//OutputStreamWriter로 변환
		Writer ouw = new OutputStreamWriter(os);
		//BufferedWriter로 변환
		Writer bw = new BufferedWriter(ouw);
		
		
		//천만개의 문자 파일에 쓰는 코드 작성
		for ( int i = 0; i < 1000_000; i++) {
			bw.write('가');
			
		}
		
		//스트림 닫기
		bw.close();
	}
}
