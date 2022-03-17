package chap08.lecture.p02polymorphism;

import java.io.Closeable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Scanner;

public class App02 {
	public static void main(String[] args) {
		String str = "java";
		Object o1 = str; // 자동 형변환
		Serializable s1 = str; // 자동 형변환
		CharSequence c1 = str; // 자동 형변환
		Comparable<String> com1 = str; // 자동 형변환
		
		Serializable s2 = "spring";
		CharSequence c2 = "hello";
		Comparable<String> com2 = "jsp";
		
		// Scanner
		Scanner scanner = new Scanner("");
		Object o2 = scanner;
		Closeable cl = scanner;
		AutoCloseable ac = scanner;
		Iterator<String> iter = scanner;
	}
}
