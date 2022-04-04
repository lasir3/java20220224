package chap18.book.example.p07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		// 정확한 경로로 수정하세요.
		String fileRead = "src/chap18/lecture/p06filter/App09.java";
		String fileWrite = "output/App09_copy.java";
		// 작성위치
		
		FileReader fr = new FileReader(fileRead);
		BufferedReader br = new BufferedReader(fr);
		
		// 연습
		FileWriter fw = new FileWriter(fileWrite);
		BufferedWriter bw = new BufferedWriter(fw);
		
		int lineNumber = 1;
		String line = "";

		while((line = br.readLine()) != null) {
//			System.out.println(lineNumber + ": " + line);
			bw.write(lineNumber+ ": " + line + "\n");
			lineNumber++;
		}
		bw.flush();		
		br.close(); fr.close();	fw.close();	bw.close();
		
		System.out.println("넘버 추가 후 파일 복사완료");
		
	}
}
