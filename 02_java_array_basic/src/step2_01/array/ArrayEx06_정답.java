package step2_01.array;

import java.util.Scanner;

/*
 * # 학생성적관리 프로그램[3단계] : 예외처리
 */

// 2021-02-16 19:06 ~ 19:17
// 뭔가 더 깔끔한 방법을 찾아야함

public class ArrayEx06_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		
		System.out.print("학번입력 : ");
		int inputNum = scan.nextInt();
		
		for (int i = 0 ; i < hakbuns.length ; i++) {
			
			if (inputNum == (1001+i)) {
				System.out.print("성적 : ");
				System.out.print(scores[i]);
			}
				
		}
		if (inputNum <1001 || inputNum > 1005 ) {
			System.out.println("해당학번은 존재하지 않습니다.");
		}
				
				
				
		scan.close();
		
		
	}
	
}
