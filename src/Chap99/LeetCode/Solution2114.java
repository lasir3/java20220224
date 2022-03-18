package Chap99.LeetCode;

public class Solution2114 {
    public int mostWordsFound(String[] sentences) {
        // int max = 0;
        // for(int i = 0;i<sentences.length;i++){
        //     String[] newStr = sentences[i].split("\s+");
        //     max = Math.max(newStr.length,max);
        // }
        // return max;
        int max = 0;
        for(String str : sentences) {
            String[] arr = str.split(" ");
            max = arr.length > max ? arr.length : max;
        }
        return max;
    }
}
