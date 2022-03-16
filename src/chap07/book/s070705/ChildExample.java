package chap07.book.s070705;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child(); // 자동 형변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 * parent.field2 = "data2"; // 부모 타입은 자식 타입을 자동 형변환 되지 않는다.
		 * paretn.method3();
		 */
		
		Child child = (Child) parent;// 강제 형변환
		child.field2 = "yyy"; // 가능
		child.method3(); // 가능
	}
	
}
