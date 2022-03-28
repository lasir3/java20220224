package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App06 {
	public static void main(String[] args) {
		// List 탐색 방법
		List<String> list = new ArrayList<>();
		list.add("Spring");
		list.add("java");
		list.add("hello");
		list.add("lunch");
		
		// 그냥 for
		System.out.println("그냥 for");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("");
		
		// 향상된 for
		System.out.println("향상된 for");
		for (String element : list) {
			System.out.println(element);
		}
		
		System.out.println("");
		
		// foreach
		System.out.println("#foreach");
		list.forEach(e -> System.out.println(e));
		
		// Iterator
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
	}
}
