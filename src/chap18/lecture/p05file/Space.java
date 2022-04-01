//
package chap18.lecture.p05file;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Space {
	public static void main(String[] args) throws Exception {
		FileReader rd = new FileReader("src/chap18/book/exercise/s180402/Test.java");
		
		System.out.println((char) rd.read());
		System.out.println((char) rd.read());
		System.out.println(rd.read()); // 13 //windows 에선 Space바가 두개의 byte를 갖는다
		System.out.println(rd.read()); // 10
		System.out.println((char) rd.read());
		
		rd.close();
	}
}
