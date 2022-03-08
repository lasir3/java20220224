package Chap99.programmers;

public class Solution12948 {
    public String solution(String phone_number) {
        String answer = "";
        int pl = phone_number.length() - 4;
        for (int i = 0; i < pl; i++) {
            answer += "*";
        }
        return answer + phone_number.substring(pl);
    }
}
