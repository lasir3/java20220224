package chap15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class App01 {
	public static void main(String[] args) {
		// Set : 순서없고, 중복x
		// 구현클래스 : HashSet
		
		Set<String> set = new HashSet<>();
		
		// add : element 추가
		set.add("jimin");
		set.add("suga");
		set.add("jin");
		set.add("rm");
	}
}
