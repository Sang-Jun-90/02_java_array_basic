package step2_01.array;

import java.util.Scanner;

/* 
 * # 틱택토
 * 
 * 1. 구글에 검색해보면 실제로 게임을 진행해볼 수 있음
 * 2. 미니 오목처럼 1p 혹은 2p가 먼저 가로로 3줄 , 세로로 3줄, 대각선 3줄을 선택한 플레이어가 승리하는 게임
 * 3. 1p가 입력한 부분은 화면에 O표시 , 2p가 입력한 부분은 화면에 X표시
 * 
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */

public class ArrayEx17_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = new int[9]; /// 0 = [] , 1 = [O] , 2 = [X]
		
		char turn = 'O';
		
		while (true) {
			
			System.out.print("=== 틱택토 ===");
			System.out.println("");
			for (int i = 0 ; i < 9 ; i ++) {
				if (game[i] == 0) System.out.print("[ ]");	
				else if (game[i] == 1) System.out.print("[O]");	
				else if (game[i] == 2) System.out.print("[X]");	
				if (i % 3 == 2) System.out.println("");		
				
			}
			
			
			System.out.print(turn + "턴 입력 : ");
			int input = scan.nextInt();
			
			if (turn == 'O' && game[input] == 0) {
				game[input] = 1;
				turn = 'X';
			}
			else if (turn == 'X'&& game[input] == 0) {
				game[input] = 2;
				turn = 'O';
			}
			else if (game[input] != 0) System.out.println("이미 차있는칸 입니다.");
			
			// 승리검수.
			// 가로 .
			for (int i = 0 ; i < 9 ; i += 3) {
				if (game[i] * game[i+1]* game[i+2] == 1) {System.out.print("P1 승리 ");break;}
				if (game[i] * game[i+1]* game[i+2] == 8) {System.out.print("P2 승리 ");break;}
			}
			// 세로
			for (int i = 0 ; i < 3 ; i += 1) {
				if (game[i] * game[i+3]* game[i+6] == 1) {System.out.print("P1 승리 ");break;}
				if (game[i] * game[i+3]* game[i+6] == 8) {System.out.print("P2 승리 ");break;}
			}
			// 대각선
			if (game[0] * game[4]* game[8] == 1) {System.out.print("P1 승리 ");break;}
			if (game[2] * game[4]* game[6] == 8) {System.out.print("P2 승리 ");break;}
		}
		
		
		
		
	}
		
}
