package Chap99.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Solution119 {
	
	public static void main(String[] args) {
		System.out.println(getRow(3));
	}
	
	
	public static List<Integer> getRow(int rowIndex) {
		List<Integer> result = new ArrayList<>();
		result.add(1);

		// 일 잘 하고
		for (int i = 0; i < rowIndex; i++) {
			result = nextRow(result);
		}
		return result;
	}

	private static List<Integer> nextRow(List<Integer> cur) {
		List<Integer> next = new ArrayList<>();

		next.add(1);

		// 더하는 일
		for (int i = 0; i < cur.size() - 1; i++) {
			Integer sum = cur.get(i) + cur.get(i + 1);
			next.add(sum);
		}

		next.add(1);

		return next;
	}
}
