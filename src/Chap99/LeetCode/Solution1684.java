package Chap99.LeetCode;

import java.util.HashSet;
import java.util.Set;

class Solution1684 {
	
	public static void main(String[] args) {

		String[] ary = {"ad","bd","aaab","baa","badab"};
		int result = countConsistentStrings("ab", ary);
		System.out.println(result);
	}
	
	
    public static int countConsistentStrings(String allowed, String[] words) {
		Set<Character> set = new HashSet<>();

		for (char c : allowed.toCharArray()) {
			set.add(c);
		}

		int cnt = 0;
		for (String word : words) {
            if(consistent(set, word)) {
            
                cnt++;
            }        
        }
        
        return cnt;
	}
    
    private static boolean consistent(Set<Character> set, String word) {
        for (char c : word.toCharArray()) {
            if (!set.contains(c)) {
                return false;
            }
        }
        return true;
    }
}
