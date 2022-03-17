package chap08.lecture.p03extends;

public interface MySubInterface1 extends MySuperInterface1, MySuperInterface2{
	
	void subMethod1();
	
	// MySuperInterface1의 요소
	// MuSuperInterface2의 요소
	
	default void superDefalutMethod1() {
		// TODO Auto-generated method stub
		
	}
}
