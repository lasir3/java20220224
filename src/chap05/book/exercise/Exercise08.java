package chap05.book.exercise;

public class Exercise08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
//		int arrcount = 0;
		double avg = 0.0;
		
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array[i].length; j++) {
//				sum += array[i][j];
//				arrcount++;
//			}
//		}
//		avg = (double)sum / arrcount;
		//μμ± μμΉ
		
		int cnt = 0;
		for (int[] item : array ) {
			for (int num : item) {
				sum += num;
				cnt++;
			}
		}
		avg = (double) sum / cnt;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
