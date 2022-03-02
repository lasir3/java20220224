package chap04.book.example;

public class ForFloatCounterExample {
    public static void main(String[] args) {

        //루프 카운트 변수를 선언할 때 부동소수점 타입을 사용하면 안됨
        for(float x = 0.1f; x <= 1.0f; x += 0.1f) {
            System.out.println(x);

            // 10번 반복하지 않고 9번만 반복하게 됨
        }
    }
    
}
