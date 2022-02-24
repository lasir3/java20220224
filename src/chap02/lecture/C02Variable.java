package chap02.lecture;

public class C02Variable {
    public static void main(String[] args) {
        // 변수의 사용범위(scope) : 선언된 블럭{} 안

        boolean b = true;

        // 같은 이름의 변수를 선언 할 수 없다.
        // int a = 4;
        
        if (b) {
            int a = 3;
            System.out.println(a);
        }
        // 코드블럭 안에서 선언된 변수는 밖에서 사용 할 수 없다.
        // System.out.println(a);

    }
}
