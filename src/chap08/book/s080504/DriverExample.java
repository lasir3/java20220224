package chap08.book.s080504;

import chap08.book.s080506.DriverInstanceCheck;

public class DriverExample {
	public static void main(String[] args) {
		DriverInstanceCheck driver = new DriverInstanceCheck();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	} 
}
