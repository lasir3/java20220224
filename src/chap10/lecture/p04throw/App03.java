package chap10.lecture.p04throw;

public class App03 {
	public static void main(String[] args) {
		method1();
		
		System.out.println("프로그램 실행 계속...");
	}
	
	private static void method1() {
		method2();
		
		System.out.println("메소드1 실행 계쏙...");
	}
	
	private static void method2() {
		try {
			method3();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Exception이 발생할 수 있는 코드
		
		System.out.println("메소드2 실행 계속...");
	}
	
	private static void method3() throws Exception {
		throw new Exception();
	}
}
