package chap04.lecture.string;

public class C01String {
    public static void main(String[] args) {
        String str1 = "java";

        System.out.println(str1);
        System.out.println(str1.equals("spring"));
        System.out.println(str1.equals("java"));

        String sub1 = str1.substring(0, 2);
        System.out.println(sub1);

        System.out.println(str1.substring(2, 4));
        System.out.println(str1.substring(2));

        // System.out.println(str1.substring(2, 5));
        System.out.println(str1.length());
    }
}
