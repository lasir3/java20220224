package Chap99.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Solution1512 {
	
	public static void main(String[] args) {
		int[] a = {1,1,1,1};
		System.out.println(numIdenticalPairs2(a));
	}
	
//	public static int numIdenticalPairs(int[] nums) {
//
//		int count = 0;
//		Map<Integer, Integer> map = new HashMap<>();
//
//		for (int i : nums) {
//			if (map.containsKey(i)) {
//				count += map.get(i);
//				map.put(i, map.get(i) + 1);
//			} else {
//				map.put(i, 1);
//			}
//		}
//
//		return count;
//	}
	
	public static int numIdenticalPairs2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        
        int result = 0;
        java.util.Collection<Integer> values = map.values();
        for (Integer value : values) {
            result += (value) * (value-1) / 2;
        }   
        
        return result;
    }

	// int count = 0;
	// int n = nums.length;
	//
	// for (int i = 0; i < n-1; i++) {
	// for (int j = i + 1; j < n; j++) {
	// if (nums[i] == nums[j]) {
	// count++;
	// }
	// }
	// }
	//
	// return count;
}
