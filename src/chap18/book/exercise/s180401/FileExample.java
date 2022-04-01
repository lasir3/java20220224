package chap18.book.exercise.s180401;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
		File dir = new File("output/Temp/Dir");
		File file1 = new File("output/Temp/file1.txt");
		File file2 = new File("output/Temp/file2.txt");
		File file3 = new File(new URI("file:///C:/Users/user/Desktop/work/java/workspace/java20220224/output/Temp/file3.txt")); // 파일경로를 URI 객채로 생성해서 매개값으로 제공

		if (dir.exists() == false) {
			dir.mkdir();
		}
		if (file1.exists() == false) {
			file1.createNewFile();
		}
		if (file2.exists() == false) {
			file2.createNewFile();
		}
		if (file3.exists() == false) {
			file3.createNewFile();
		}

		File temp = new File("output/Temp");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd   a   HH:mm");
		File[] contents = temp.listFiles();
		System.out.println("날짜                        시간                     형태                         크기             이름");
		System.out.println("------------------------------------------------");
		for (File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if (file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
	}
}
