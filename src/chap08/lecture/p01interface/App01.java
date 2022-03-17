package chap08.lecture.p01interface;

public class App01 {
	public static void main(String[] args) {
		System.out.println(MyInterface2.FIELD1);
		System.out.println(MyInterface2.FIELD2);

		// Myinterface2.FIELD1 = 33; // xx
		// Myinterface2.FIELD2 = 99; // xxx

		// Myinterface2 o1 = new Myinterface2(); // 인터페이스로 인스턴스를 만들 수 없다
	}
}
