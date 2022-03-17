package chap08.book.s080500;

public class CarExampleArr {
	public static void main(String[] args) {
		CarArr myCar = new CarArr();
		
		myCar.run();
		
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		
		myCar.run();
	}
}
