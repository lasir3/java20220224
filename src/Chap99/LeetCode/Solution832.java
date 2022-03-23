package Chap99.LeetCode;

public class Solution832 {
	public int[][] flipAndInvertImage(int[][] image) {

//		// Array Reverse
//		for (int i = 0; i < image.length; i++) {
//			for (int j = 0; j < (image[i].length / 2); j++) {
//				int temp = image[i][j];
//				image[i][j] = image[i][image[i].length - 1 - j];
//				image[i][image[i].length - 1 - j] = temp;
//			}
//		}
//
//		// Change numbers
//		for (int i = 0; i < image.length; i++) {
//			for (int j = 0; j < (image[i].length); j++) {
//				if (image[i][j] == 0) {
//					image[i][j] = 1;
//				} else if (image[i][j] == 1) {
//					image[i][j] = 0;
//				}
//			}
//		}
//		return image;

//		for (int[] row : image) {
//
//			int left = 0; // 첫 인덱스
//			int right = row.length - 1; // 마지막 인덱스
//
//			while (left <= right) {
//				int temp = row[left];
//				row[left] = row[right];
//				row[right] = temp;
//
//				row[left] = row[left] == 1 ? 0 : 1;
//				row[right] = row[right] == 1 ? 0 : 1;
//
//				if (left == right) {
//					row[right] = row[right] == 1 ? 0 : 1;
//				}
//
//				left++;
//				right--;
//			}
//		}
//		return image;
		

        int [][] Rev = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++){
            int len = image[i].length;
            for (int j = 0; j < len; j++){
                Rev[i][j] = image[i][len - 1 - j] == 0 ? 1 : 0;
            }
        }
        return Rev;
    }
}

