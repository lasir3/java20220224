package chap03.book.example;

public class ArithmeticOperatorExample {
    public static void main(String[] args) {
        int v1 = 5;
        int v2 = 2;

        int result1 = v1 + v2;
        System.out.println("result1 = " + result1); // result1 = 7

        int result2 = v1 - v2;
        System.out.println("result2 = " + result2); // result2 = 3

        int result3 = v1 * v2;
        System.out.println("result3 = " + result3); // result3 = 10

        int result4 = v1 / v2;
        System.out.println("result4 = " + result4); // reuslt4 = 2

        int result5 = v1 % v2;
        System.out.println("result5 = " + result5); // result5 = 1
        
        double result6 = (double) (v1 / v2); // 강제 형변환으로 2.0 반환
        System.out.println("result6 = " + result6); // result6 = 2.0
    }
    
}
