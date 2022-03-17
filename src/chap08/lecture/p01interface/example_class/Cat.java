package chap08.lecture.p01interface.example_class;

public class Cat extends Feline implements Pet {

	@Override
	public void cry() {
		System.out.println("야옹~");
		
	}

	@Override
	public void roll() {
		System.out.println("고양이가 무시합니다.");
	}

}
