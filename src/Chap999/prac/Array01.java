package Chap999.prac;

import java.util.Arrays;

public class Array01 {
	public static void main(String[] args) {
		int[] arr0 = {0, 3, 4, 5};
		int[] arr1 = new int[arr0.length];
		arr1 = arr0;
		
		System.out.println(Arrays.toString(arr1));
	}
}
