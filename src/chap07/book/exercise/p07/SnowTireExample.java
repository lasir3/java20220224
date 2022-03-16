package chap07.book.exercise.p07;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
//		Tire tire = new Tire();
		
		snowTire.run();
		tire.run();
	}
	
}
