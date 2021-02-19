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
		
		
		int player1 = 1;
		int player2 = 2;
		
		int turn = player1;
		
		int idx1 = 0;	int idx2 = 0;
		p1[idx1] = player1;	p2[idx2] = player2;

		int win1 = 0;	int win2 = 0;		
		
		while (true) {
			
			System.out.println(Arrays.toString(game));
			System.out.print(Arrays.toString(p1));
			System.out.println("[" + win1 + "바퀴]");
			System.out.print(Arrays.toString(p2));
			System.out.println("[" + win2 + "바퀴]");
			
			// P1 이동하기
			if (turn == player1) {
				System.out.print("입력 : ");
				int playerInput = scan.nextInt();
				
				// 1 ~ 3 이외 예외설정 
				if (playerInput > 3 || playerInput <= 0) {
					System.out.println("※ 1~3까지의 숫자만 입력가능");
					System.out.println();
					continue;
				}
				
				for (int i = 1 ; i <= 3 ; i++) {
					if (playerInput == i) {
						System.out.println("p1 이동 :" + i );
						p1[idx1] = 0;   // 이전위치 리셋 
						idx1 += i;		// 위치값 세팅 	
						if (idx1 >= 7) {   // 완주 확인
							win1++;
							idx1 = idx1 % 8;
						}
						p1[idx1] = player1;   // 새로운 위치값 입력 
						if (idx1 == idx2 && idx1 != 0 ) {   // 말 잡기 
							System.out.println("P2 말을 잡았어요.");
							p2[idx2] = 0;
							idx2 = 0;
							p2[idx2] = player2;
						}
					}
				}
				//P1 최종승자 확인 
				if (win1 >= 3) {System.out.println("P1 승리 "); break;}	
				turn = player2;
			}
			
			// P2 이동하기(COM)
			else if (turn == player2) {
				p2[idx2] = 0 ;   // 이전 위치 리셋 
				
				int ranNum = ran.nextInt(3) + 1;   
				idx2 += ranNum;  //  위치값 세팅 
				if (idx2 >= 7) {  // 완주 확인 
					win2++;
					idx2 = idx2 % 8;
				}
				System.out.println("p2 이동 :" + ranNum );
				p2[idx2] = player2;   // 새로운위치값 입력 
				if (idx2 == idx1  && idx2 != 0) {   // 말 잡기 
					System.out.println("P1 말을 잡았어요.");
					p1[idx1] = 0;
					idx1 = 0;
					p1[idx1] = player1;
				}
				
				//P2 최종승자 확인 
				if (win2 >= 3) {System.out.println("P2 승리 ");break;}
				
				turn = player1;
			}
			
		}
		
	}
}
