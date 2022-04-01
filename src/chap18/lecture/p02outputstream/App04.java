package chap18.lecture.p02outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class App04 {
	public static void main(String[] args) {
		// picture/다형성01.png를
		// output/다형성01.png로 복사하는 코드
		String inputFile = "picture/다형성01.png"; // inputFile에 불러올 파일주소 저장
		String outputFile = "output/다형성01.png"; // outputFile에 생성할 파일주소 저장
		
		try (InputStream is = new FileInputStream(inputFile); // FileInputStream 메소드를 이용해 inputFile 파일의 byte를 읽는다
				OutputStream os = new FileOutputStream(outputFile); //FileOutputStream 메소드를 이용해 outputFile에 해당하는 주소에 파일 생성
				)/* try-with-resource */ {
			
			int data = 0; // 복사할 byte를 저장하기위해 변수 선언
			
			while((data = is.read()) != -1) { // read메소드를 사용하여 읽은 byte 베열을 data에 저장
				os.write(data); // write메소드를 사용하여 byte값을 OutputStream에 전달
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료....");
	}
}
