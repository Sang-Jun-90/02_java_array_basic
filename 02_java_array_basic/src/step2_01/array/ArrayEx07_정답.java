package step2_01.array;

import java.util.Scanner;

/*
 * # 학생성적관리 프로그램[4단계] : 1등학생
 */
//2021-02-16 19:17~ 19~23

public class ArrayEx07_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		
		int highHakbun = 0;
		int highScore = 0;
		
		for (int i = 0 ; i < hakbuns.length ; i ++) {
			
			if (scores[i] >= highScore) {
				highScore = scores[i];
				highHakbun = 1001+i;
			}
		}
		
		System.out.print(highHakbun + "번");
		System.out.print("(" + highScore + "점)");
		
		scan.close();
	}
	
}
