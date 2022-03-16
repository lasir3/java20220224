package Chap99.LeetCode;

public class Solution1672 {

    public int maximumWealth(int[][] accounts) {
        int[] sum = new int[accounts.length];
        int max = 0;
        for(int i = 0; i < accounts.length; i++) {
            for(int j = 0; j < accounts[i].length; j++){
                sum[i] += accounts[i][j];
                if (sum[i] > max) {
                    max = sum[i];
                }
            }
        }
        return max;
    }
}
