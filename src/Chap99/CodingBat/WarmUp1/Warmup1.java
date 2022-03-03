package Chap99.CodingBat.WarmUp1;

public class Warmup1 {
	public String notString(String str) {

		String front = "";

		if (str.length() >= 3) {
			front = str.substring(0, 3);
		}

		if (front.equals("not")) {
			return str;
		} else {
			return "not " + str;
		}

	}

	public boolean posNeg(int a, int b, boolean negative) {

		if (negative) {
			return a < 0 && b < 0;
		} else {
			return (a * b) < 0;
		}
	}

	public boolean nearHundred(int n) {
		// return (n >= 90 && n <= 110) || (n >= 190 && n <= 210);
		return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
	}

	public boolean makes10(int a, int b) {

		int sum = a + b;

		return (sum == 10) || (a == 10) || (b == 10);
	}

	public boolean parrotTrouble(boolean talking, int hour) {
		return talking && (hour < 7 || hour > 20);
	}

	public int diff21(int n) {
		int diff = 21 - n;
		return (diff < 0) ? diff * -2 : diff;
	}

	public int sumDouble(int a, int b) {
		int sum = a + b;

		return (a == b) ? sum * 2 : sum;
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return !(aSmile ^ bSmile);
	}

	public boolean sleepIn(boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}
}
