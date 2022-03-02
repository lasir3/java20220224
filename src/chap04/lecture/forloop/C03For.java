package chap04.lecture.forloop;

public class C03For {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        int i; // for 문 종료후에도 사용 가능
        for (i = 0; i < 5; i++){
            System.out.println(i);
        }

        System.out.println(i);
    }
    
}
