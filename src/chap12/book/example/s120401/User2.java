package chap12.book.example.s120401;

public class User2 extends Thread { 
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMEmory(50);
	}
}
