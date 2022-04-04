package chap18.lecture.p06filter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class App05 {
	public static void main(String[] args) throws Exception {
		normalWriter();
		bufferedWriter();
	}
	
	private static void bufferedWriter() throws Exception {
		String path = "output/FilterExample52.txt";
		Writer writer = new FileWriter(path);
		Writer bw = new BufferedWriter(writer);
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			bw.write('한');
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		
		bw.close();
		writer.close();
	}
	
	private static void normalWriter() throws Exception {
		String path = "output/FilterExample51.txt";
		Writer writer = new FileWriter(path);
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			writer.write('한');
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		
		writer.close();
	}
}




