1: package chap18.lecture.p06filter;
2: 
3: import java.io.BufferedReader;
4: import java.io.FileNotFoundException;
5: import java.io.FileReader;
6: 
7: public class App09 {
8: 	public static void main(String[] args) throws Exception {
9: 		String path = "src/chap18/lecture/p06filter/App09.java";
10: 		FileReader fr = new FileReader(path);
11: 		BufferedReader br = new BufferedReader(fr);
12: 		
13: 		String line = "";
14: 		
15: 		while((line = br.readLine()) != null) {
16: 			System.out.println(line);
17: 		}
18: 		
19: 		br.close();
20: 	}
21: }
