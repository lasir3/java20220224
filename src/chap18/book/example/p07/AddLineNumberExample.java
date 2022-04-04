package chap18.book.example.p07;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		// 정확한 경로로 수정하세요.
		String filePath = "src/chap18/lecture/p06filter/App09.java";
		// 작성위치
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		int i = 1;
		while((line = br.readLine()) != null) {

			System.out.println(i + ": " + line);
			
			i++;
		}
		
		br.close();
	}
}
