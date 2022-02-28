package chap03.lecture.method;

public class C05Return {
    public static void main(String[] args) {
        System.out.println("명령문1");
        mymethod1();
        System.out.println("명령문2");
        int i = mymethod2(); // return 3
        System.out.println("명령문3");
        System.out.println(i);

    }

    public static void mymethod1() {
        System.out.println("my method1 명령문1");
        System.out.println("my method1 명령문2");

        // return : 1.메소드 종료, 2. 오른쪽에 있는 값을 호출한 곳으로 반환 (reture)

        return;

        // System.out.println("my method1 명령문3"); // return 으로 메소드 종료
    }

    public static int mymethod2() {
        // 메소드명 앞에 리턴하는 값의 타입 명시해야함
        // 만약 리턴하는 값이 없으면 void로 명시

        System.out.println("my method2 명령문1");

        return 3; // int 3
    }
    
}
