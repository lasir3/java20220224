package chap03.book.example;

public class AccuracyExample1 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - (number * pieceUnit); // 0.29999999999999993

        System.out.println("사과 한개에서 ");
        System.out.println("0.7 조각을 빼면, ");
        System.out.println(result + "조각이 남는다.");

        // 정확한 계산이 필요할 경우 부동소수점 타입을 사용하지 않는다.
    }
    
}
