package Chap99.CodingBat;

import java.util.Map;

public class Map1 {
	public Map<String, String> mapBully(Map<String, String> map) {
		if (map.containsKey("a")) {
			String aval = map.get("a");
			map.put("b", aval);
			map.put("a", "");
		}
		return map;
	}

	public Map<String, String> mapShare(Map<String, String> map) {
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
		}
		map.remove("c");
		return map;
	}

	public Map<String, String> mapAB(Map<String, String> map) {
		if (map.containsKey("a") && map.containsKey("b")) {
			String aVal = map.get("a");
			String bVal = map.get("b");

			map.put("ab", aVal + bVal);
		}

		return map;
	}

	public Map<String, String> topping1(Map<String, String> map) {
		if (map.containsKey("ice cream")) {
			map.put("ice cream", "cherry");
		}

		map.put("bread", "butter");

		return map;
	}

	public Map<String, String> topping2(Map<String, String> map) {
		if (map.containsKey("ice cream")) {
			map.put("yogurt", map.get("ice cream"));
		}
		if (map.containsKey("spinach")) {
			map.put("spinach", "nuts");
		}

		return map;
	}

	public Map<String, String> topping3(Map<String, String> map) {
		if (map.containsKey("potato")) {
			map.put("fries", map.get("potato"));
		}
		if (map.containsKey("salad")) {
			map.put("spinach", map.get("salad"));
		}
		return map;
	}

	public Map<String, String> mapAB2(Map<String, String> map) {
		if (map.get("a") != null && map.get("a").equals(map.get("b"))) {
			map.remove("a");
			map.remove("b");
		}
		return map;
	}

	public Map<String, String> mapAB3(Map<String, String> map) {

		if (map.containsKey("a") && map.containsKey("b")) {
			return map;
		} else if (map.containsKey("a")) {
			map.put("b", map.get("a"));
		} else if (map.containsKey("b")) {
			map.put("a", map.get("b"));
		}
		return map;
	}

	public Map<String, String> mapAB4(Map<String, String> map) {

		if (map.containsKey("a") && map.containsKey("b")) {
			int alength = map.get("a").length();
			int blength = map.get("b").length();

			if (alength == blength) {
				map.put("a", "");
				map.put("b", "");
			} else if (alength > blength) {
				map.put("c", map.get("a"));
			} else if (blength > alength) {
				map.put("c", map.get("b"));
			}
		}

		return map;
	}

}
