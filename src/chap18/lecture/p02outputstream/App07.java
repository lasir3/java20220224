package chap18.lecture.p02outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class App07 {
	public static void main(String[] args) {
		// 원본 파일 : "picture/참조타입01.png"
		// 복사 파일 : "output/참조타입01_copy.png"
		
		String input = "picture/참조타입01.png";
		String output = "output/참조타입01_copy.png";
		
		try (InputStream is = new FileInputStream(input);
				OutputStream os = new FileOutputStream(output);
				){
			
			byte[] datas = new byte[1000];
			int len = 0;
			
			while ((len = is.read(datas)) != -1) {
				os.write(datas, 0, len);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료....");
	}
}
