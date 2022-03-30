package Chap99.CodingBat;

import java.util.List;

public class Functional2 {
	public List<String> no34(List<String> strings) {
		strings.removeIf(e -> e.length() == 3 || e.length() == 4);
		return strings;
	}

	public List<String> noLong(List<String> strings) {
		// List<String> result = new ArrayList<>();

		// for (String str : strings) {
		//   if (str.length() < 4) {
		//     result.add(str);
		//   }
		// }

		// return result;

		strings.removeIf(s -> s.length() >= 4);
		return strings;
	}

	public List<String> noZ(List<String> strings) {
		strings.removeIf(e -> e.contains("z"));

		return strings;
	}

	public List<Integer> noTeen(List<Integer> nums) {
		nums.removeIf(e -> e >= 13 && e <= 19);

		return nums;
	}

	public List<Integer> no9(List<Integer> nums) {
		nums.removeIf((e) -> e % 10 == 9);

		return nums;
	}

	public List<Integer> noNeg(List<Integer> nums) {
		nums.removeIf(e -> e < 0);

		return nums;
	}

}
