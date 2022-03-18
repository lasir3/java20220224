package chap09.lecture.p02anonymous;

public class App08 {
	public static void main(String[] args) {
		MyInterface1 o2 = new MyInterface1() {
			@Override
			public void method1() {
				System.out.println("마이인터페이스1 메소드1 재정의");
			}
		};
		
		otherMethod(o2);
		
		// 아래와 같이 간략화 시킬 수 있따.
		
//		o1.method1();
		otherMethod(new MyInterface1() {
			@Override
			public void method1() {
				System.out.println("마이인터페이스1 메소드1 재정의");
			}
		});
		
		otherMethod2(new int[] {3,4});
	}
	
	public static void otherMethod(MyInterface1 param) {
		param.method1();
	}
	
	public static void otherMethod2(int[] arr) {
		
	}
}
