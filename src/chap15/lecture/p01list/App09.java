package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App09 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		// 홀수 element 삭제
		// while 샤용
		/*
		int i = 0;
		while (i < list.size()) {
			Integer elem = list.get(i);
			if(elem % 2 == 1) {
				list.remove(i);
				continue;
			}
			i++;
		}
		*/
		// removeIf 사용
//		list.removeIf(e -> (e % 2) == 1);
		
		// Iterator 사용
		Iterator<Integer> iter = list.iterator();
		
		while (iter.hasNext()) {
			if(iter.next() % 2 == 1) {
				iter.remove();
			}
		}
		
		System.out.println(list); // [0, 2, 4, 6, 8]
	}
}
