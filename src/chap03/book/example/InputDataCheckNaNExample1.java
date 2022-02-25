package chap03.book.example;

public class InputDataCheckNaNExample1 {
    public static void main(String[] args) {

        // 부동소수점(실수) 입력 받을시 반드시 NaN 검사 필요
        String userInput = "Nan";
        double val = Double.valueOf(userInput);

        double currentBalance = 10000.0;

        currentBalance += val;
        System.out.println(currentBalance);
    }    
}
