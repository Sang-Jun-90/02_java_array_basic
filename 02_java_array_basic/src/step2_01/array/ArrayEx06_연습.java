package step2_01.array;

import java.util.Scanner;

/*
 * # 학생성적관리 프로그램[3단계] : 예외처리
 */



public class ArrayEx06_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		
		int score= 0 ;
		
		Boolean outputData = false;
		
		for (int i = 0; i < hakbuns.length; i++) {
			System.out.println("입력 : ");
			int input = scan.nextInt();


			for (int j = 0; j < scores.length; j++) {
				if (input == hakbuns[j]) {
					outputData = true;
					score = scores[j];
				}
			}
			
			if (outputData) {
				outputData = false;
				System.out.println(score);
			}
			else System.out.println("없는뎁쇼");
			
		}
		
		scan.close();
		
	}
	
}
