package chap18.lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class App07 {
	public static void main(String[] args) {
		// Exception
		
		String path = "picture/다형성01.png";

		// try-with-resource
//		InputStream is = null;
		try (
				// try block에서 사용하고 꼭 닫아야(close)하는 객체 초기화
				// 여기서 선언된 타입은 AutoCloseable 타입이어야 함
				InputStream is = new FileInputStream(path);
				InputStream is2 = new FileInputStream("");
				InputStream is3 = new FileInputStream("");
				){
//			is = new FileInputStream(path);

			byte[] datas = new byte[100];
			int len = 0;
			int size = 0;

			while ((len = is.read(datas)) != -1) {
				System.out.println(len);
				System.out.println(Arrays.toString(datas));
				size += len;
			}
			System.out.println(size);
		} 
//		catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} // FileNotFoundException 은 IOException을 상속받기 때문에 삭제 가능 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //close()는 try block에서 처리 했기 때문에 필요X
	}
}
