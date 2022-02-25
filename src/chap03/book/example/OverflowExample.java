package chap03.book.example;

public class OverflowExample {

    public static void main(String[] args) {
        int x = 1000000;
        int y = 1000000;
        int intValue;
        int z = x + y;
        System.out.println(z); // overflow
        System.out.println(Integer.MIN_VALUE);
    }
    
}
