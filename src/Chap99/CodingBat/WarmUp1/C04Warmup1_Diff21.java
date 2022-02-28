package Chap99.CodingBat.WarmUp1;

public class C04Warmup1_Diff21 {
    
    // Given an int n, return the absolute difference between n and 21, except
    // return double the absolute difference if n is over 21.

    // diff21(19) → 2
    // diff21(10) → 11
    // diff21(21) → 0

    public static void main(String[] args) {

        System.err.println(diff21(19));
        System.err.println(diff21(10));
        System.err.println(diff21(21));
        System.err.println(diff21(40));

    }

    public static int diff21(int n) {
        // if (n <= 21) {
        // return 21 - n;
        // } else {
        // return (n - 21) * 2;
        // }
        return n <= 21 ? 21 - n : (n - 21) * 2;
    }
}
