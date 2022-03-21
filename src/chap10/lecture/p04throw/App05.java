package chap10.lecture.p04throw;

public class App05 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // nullpointerexception 발생 가능한 코드
		System.out.println("프로그램 실행 흐름 계속...");
	}
	
	private static void method1() throws Exception {
		method2(); // nullpointerexception 발생 가능한 코드
		System.out.println("메소드1 실행 계속");
	}
	
	private static void method2() throws Exception {
		method3(); // nullpointerexception 발생 가능한 코드
		System.out.println("메소드2 실행 계속...");
	}
	
	private static void method3() throws Exception {
		throw new Exception();
	}
}
