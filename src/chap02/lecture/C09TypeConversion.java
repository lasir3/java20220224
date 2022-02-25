package chap02.lecture;

public class C09TypeConversion {
    public static void main(String[] args) {

        byte b1 = 120;
        short s1 = 30000;
        int i1 = 210000000;
        long l1 = 420000000L;

        byte b2;
        short s2;
        int i2;
        long l2;

        b2 = b1;
        System.out.println(b2);
        s2 = b1;
        System.out.println(s2);
        i2 = b1;
        System.out.println(i2);
        l2 = b1;
        System.out.println(l2);


        s2 = s1;
        i2 = s1;
        l2 = s1;
        System.out.println(s2);
        System.out.println(i2);
        System.out.println(l2);

        b2 = (byte) s1; // 강제 타입 변환 (type casting)
        System.out.println(b2);

        i2 = i1;
        l2 = i1;
        b2 = (byte) i1; // 강제 타입 변환
        s2 = (short) i1; // 강제 타이 변환
    
        System.out.println(b2);
        System.out.println(s2);
        System.out.println(i2);
        System.out.println(l2);

        b2 = (byte) l1;
        s2 = (short) l1;
        i2 = (int) l1;
        l2 = l1;
        System.out.println(b2);
        System.out.println(s2);
        System.out.println(i2);
        System.out.println(l2);

        // char -> int
        // char -> long
        char c1 = '가';
        i2 = c1;
    }
}
