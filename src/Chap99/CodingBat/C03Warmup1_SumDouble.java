package Chap99.CodingBat;

public class C03Warmup1_SumDouble {

    // Given two int values, return their sum. Unless the two values are the same,
    // then return double their sum.

    // sumDouble(1, 2) → 3
    // sumDouble(3, 2) → 5
    // sumDouble(2, 2) → 8

    public static void main(String[] args) {
        System.out.println(sumDouble(3, 2));
        System.out.println(sumDouble(2, 2));

    }

    public static int sumDouble(int a, int b) {
        // if(a == b) {
        // return (a + b) * 2;
        // } else {
        // return a + b;
        // }
        // Store the sum in a local variable
        // int sum = a + b;

        // // Double it if a and b are the same
        // if (a == b) {
        // sum = sum * 2;
        // }

        // return sum;
        int sum = a + b;
        return (a == b) ? sum * 2 : sum;
    }

}
