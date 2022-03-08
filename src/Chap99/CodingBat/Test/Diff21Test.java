package Chap99.CodingBat.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Diff21Test {

	@Test
	void test() {
		assertEquals(0, diff21(21));
		assertEquals(2, diff21(19));
		assertEquals(2, diff21(22));

	}
	public int diff21(int n) {
		if (n > 21) {
			return (n - 21) * 2;	
		}
		return 21 - n;
	  }
	  
}
