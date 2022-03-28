package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App07 {
	public static void main(String[] args) {
		// ArrayList를 만들고
		// 0부터 99까지의 Integer를 element로 추가
		List<Integer> list = new ArrayList();
		for (int i = 0; i < 100; i++) {
			list.add(i);
		}
		System.out.println(list);

		System.out.println();
		
		list.removeAll(list);
		for (int i = 99; i >= 0; i--) {
			list.add(i);
		}
		System.out.println(list);
		
		// ArrayList를 만들고
		// 99부터 0까지의 Integer를 element로 추가
	}
}
