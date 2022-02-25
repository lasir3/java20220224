package chap02.lecture;

public class C14TypeConversion {
    public static void main(String[] args) {
        // 정수와 실수끼리 연산 결과 : 실수
        int i1 = 99;
        double d1 = 3.14;

        int i2 = (int) (i1 + d1);
        double d2 = i1 + d1;
        System.out.println(i1);
        System.out.println(d2);

        
    }
}
