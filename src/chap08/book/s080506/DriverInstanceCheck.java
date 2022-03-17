package chap08.book.s080506;

import chap08.book.s080504.Bus;
import chap08.book.s080504.Vehicle;

public class DriverInstanceCheck {
	public void drive (Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			System.out.println("vehicle instanceof Bus 검증완료");
			bus.checkFare();
		}
		vehicle.run();
	}
}
