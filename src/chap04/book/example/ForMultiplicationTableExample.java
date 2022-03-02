package chap04.book.example;

public class ForMultiplicationTableExample {

    public static void main(String[] args) {

        // 2단 ~ 9단
        System.out.println("*****2단~9단*****");
        for (int m = 2; m <= 9; m++) {
            System.out.println("*** " + m + "단 ***");
            for (int n = 1; n <= 9; n++) {
                System.out.println(m + " x " + n + " = " + (m * n));

            }
        }

        // 9단 ~ 2단
        System.out.println("******9단~2단******");
        for (int m = 9; m >= 2; m--) {
            System.out.println("*** " + m + "단 ***");
            for (int n = 1; n < 10; n++) {
                System.out.println(m + " x " + n + " = " + (m * n));

            }
        }

        // 9단 ~ 2단 (n 이 9부터)
        System.out.println("*******9단~2단****** (9x9 ~ 2x1)");
        for (int m = 9; m >= 2; m--) {
            System.out.println("*** " + m + "단 ***");
            for (int n = 9; n >= 1; n--) {
                System.out.println(m + " x " + n + " = " + (m * n));

            }
        }
    }

}
