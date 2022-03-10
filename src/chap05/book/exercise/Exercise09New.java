package chap05.book.exercise;

import java.util.Scanner;

public class Exercise09New {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				// 작성위치
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum]; 
			} else if(selectNo == 2) {
				// 작성위치
				if(scores == null) {
					System.out.println("학생의 수를 입력하세요");
				} else {
					for(int i = 0; i < scores.length; i++) {
						System.out.print("scores["+ i + "]>");
						scores[i] = scanner.nextInt();
					}
				}
			} else if(selectNo == 3) {
				// 작성위치
				for(int j = 0; j < scores.length; j++) {
					System.out.println("scores[" + j + "]" + scores[j]);
				}
			} else if(selectNo == 4) {
				// 작성위치
				double sum = 0;
				double avg = 0.0;
				int max = 0;
				for(int score : scores) {
					sum += score;
					max = (score > max) ? score : max;
				}
				avg = sum / scores.length;				
				System.out.println("최고 점수:" + max);
				System.out.println("평균 점수:" + (sum / studentNum));	
			} else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
        scanner.close();
	}
}
