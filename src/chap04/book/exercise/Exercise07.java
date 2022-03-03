package chap04.book.exercise;

import java.util.Scanner;
public class Exercise07 {
    public static void main(String[] args) {
        boolean run = true;

        int balance = 0;

        Scanner scanner = new Scanner(System.in);

        while(run) {
            System.out.println("------------------------------");
            System.out.println("1. 예금 | 2. 출금 || 3. 잔고  4. 종료");
            System.out.println("------------------------------");
            System.out.print("선택> ");

            int sel = scanner.nextInt();
            int input = 0;
            
            switch (sel) {
                case 1:
                    System.out.print("예금액>" );
                    input = scanner.nextInt();
                    balance += input;
                    System.out.println();
                    break;

                case 2:
                    System.out.print("출금액> ");
                    input = scanner.nextInt();
                    if (balance - input > 0){
                        balance -= input;
                        System.out.println();
                    } else {
                        System.out.println("잔액이 부족합니다.");
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("잔고> " + balance);
                    System.out.println();
                    break;

                case 4:
                    run = false;
                    break;
                    
                default:
                    System.out.println("번호를 다시 입력하세요");
                    break;
             }
        }
        System.out.println("프로그램 종료");
        scanner.close();
    }
}
