package chap04.lecture.forloop;

public class C08For {
    public static void main(String[] args) {
        int[] arr1 = {3, 1, 9, 0, 7};
        int sum = 0;

        // arr1에 있는 모든 값을 더해서 출력
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        System.out.println(sum);

        // arr1의 값 중 가장 큰 값을 구해서 출력
        int big = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > big) {
                big = arr1[i];
            }
        }
        System.out.println(big);

        // arr1의 값 중 가장 작은 값을 구해서 출력
        int small = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] < small){
                small = arr1[i];
            }
        }
        System.out.println(small);
    }   
}
