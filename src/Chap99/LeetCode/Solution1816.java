package Chap99.LeetCode;

import java.util.Arrays;

public class Solution1816 {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        String[] str = Arrays.copyOf(arr, k);
        
        return String.join(" ", str);
    }
}
