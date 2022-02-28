package chap03.lecture.method;

public class C04Method {
    public static void main(String[] args) {
        //myMethod1(); // x
        //myMethod1(3); // x
        myMethod1(3, 5);
        myMethod1(33, 55);
        myMethod1('가', 55);

        mymethod2(999, 888);
    }
    public static void myMethod1(int i, int j) {
        System.out.println(i);
        System.out.println(j);
    }

    public static void mymethod2(int age, int weight) {
        System.out.println(age * 2);
        System.out.println(weight * 2);
    }

    
}
