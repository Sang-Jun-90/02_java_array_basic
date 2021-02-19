package step2_01.array;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/*
 * # 미니마블
 * 
 * 1. 플레이어는 p1과 p2 2명이다.
 * 2. 1p는 사용자가 1~3 사이의 숫자를 입력해 이동하고 2p는 랜덤값으로 1~3값으로 이동한다.
 * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
 *    상대 플레이어는 잡히게 되어 원점으로 되돌아간다.
 * 4. 먼저 3바퀴를 돌면 이긴다.
 *    
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p1사용자]1~3 입력 : 3 
 *
 *  1 2 3 4 5 6 7 8  
 *  0 0 0 1 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p2컴퓨터] : 3
 *  [p2컴퓨터]가 p1을 잡았다! 
 *  
 *  1 2 3 4 5 6 7 8 
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  0 0 0 2 0 0 0 0  [0바퀴]
 * [p1사용자]1~3 입력 : 
 *
 *
 *
 */

public class ArrayEx18_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		
		int turn = 0;
		
		int idx1 = 0;	int idx2 = 0;
		p1[idx1] = 1;	p2[idx2] = 2;
		
		int win1 = 0;	int win2 = 0;		
		
		Boolean isRun = true;
		Boolean isRunning = true;
		
		while (isRun) {
			
			System.out.println(Arrays.toString(game));
			System.out.println(Arrays.toString(p1));
			System.out.println(Arrays.toString(p2));
			
			System.out.print("입력 : ");
			int input = scan.nextInt();
			
			// 1 ~ 3 이외 예외설정 
			if (input > 3 || input <= 0) continue;
			
			// P1 이동하기
			for (int i = 1 ; i <= 3 ; i++) {
				if (input == i) {
					p1[idx1] = 0;   // 이전위치 리셋 
					idx1 += i;		// 위치값 세팅 	
					if (idx1 >= 7) {   // 승리 확인
						win1++;
						idx1 = 0;
						System.out.println("============");
						System.out.println("P1 : " + win1);
						System.out.println("P2 : " + win2);
						System.out.println("============");
					}
					p1[idx1] = 1;   // 새로운 위치값 입력 
					if (idx1 == idx2) {   // 말 잡기 
						System.out.println("P2말이 잡혔어요.");
						p2[idx2] = 0;
						idx2 = 0;
						p2[idx2] = 2;
					}
				}
			}
			//P1 최종승자 확인 
			if (win1 >= 3) {
				System.out.println("P1 승리 ");
				break;
			}
			
			p2[idx2] = 0 ;   // 이전 위치 리셋 
			
			int ranNum = ran.nextInt(3) + 1;   
			idx2 += ranNum;  //  위치값 세팅 
			if (idx2 >= 7) {  // 승리확인 
				win2++;
				idx2 = 0;
			}
			p2[idx2] = 2;   // 새로운위치값 입력 
			if (idx2 == idx1) {   // 말 잡기 
				System.out.println("P1말이 잡혔어요.");
				p1[idx1] = 0;
				idx1 = 0;
				p1[idx1] = 1;
			}
			isRunning = true;
			
			//P2 최종승자 확인 
			if (win2 >= 3) {
				System.out.println("P2 승리 ");
				break;
			}
		}
		
		
		
		
	}
}
