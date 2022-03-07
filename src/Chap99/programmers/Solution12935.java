package Chap99.programmers;

public class Solution12935 {
	public int[] solution(int[] arr) {
		if (arr.length == 1) {
			return new int[] { -1 };
		}

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		int[] answer = new int[arr.length - 1];

		for (int i = 0, j = 0; i < arr.length; i++) { // j:새로운 배열의 인덱스를 추가
			if (arr[i] != min) { // i의 값을 j의 array에 집어넣다가 arr의 최소값을 만날때의 i 인덱스를 한번 스킵
				answer[j] = arr[i];
				j++; // arr 인덱스 번호가 증가함에 따라 answer 인덱스도 같이 증가시킨다
			}
		}

		return answer;
	}
}
