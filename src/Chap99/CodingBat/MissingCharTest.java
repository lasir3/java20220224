package Chap99.CodingBat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MissingCharTest {

	@Test
	void test() {
		assertEquals("ktten", missingChar("kitten", 1));
		assertEquals("itten", missingChar("kitten", 0));
		assertEquals("kittn", missingChar("kitten", 4));

	}
	
	public String missingChar(String str, int n) {
		  String front = str.substring(0, n);
		  
		  String back = str.substring(n+1);
		  return front + back;
		}


}
