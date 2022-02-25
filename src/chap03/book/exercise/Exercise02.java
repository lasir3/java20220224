package chap03.book.exercise;

public class Exercise02 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) /*연산전 + 1 = 11*/ + (y--); // 연산 후 -- = 20
		System.out.println(z);
	}
}
