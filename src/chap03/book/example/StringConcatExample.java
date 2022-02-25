package chap03.book.example;

public class StringConcatExample {
    public static void main(String[] args) {
        String str1 = "JDK" + 6.0;
        String str2 = str1 + " 특징";
        System.out.println(str2);

        String str3 = "JDK" + 3 + 3.0; // String을 더할시 연결 연산자로 처리
        String str4 = 3 + 3.0 + "JDK"; // 3 + 3.0 은 산술 연산자로 계산 된 후 JDK를 연결 연산자로 처리
        System.out.println(str3);
        System.out.println(str4);
    }
    
}
