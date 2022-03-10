package chap05.book.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {-1, -5, -3, -8, -2};
		max = array[0];
		
		/*
		for(int i=1; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		*/
		
		for(int mmm : array) {
			if(mmm > max) {
				max = mmm;
			}
		}
		
		System.out.println("max : " + max);
	}
}
