package Chap99.LeetCode;

import java.util.HashSet;
import java.util.Set;

class Solution287 {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if(!set.add(num)) {
                return num;
            }
        }
        return 0;
    }
}