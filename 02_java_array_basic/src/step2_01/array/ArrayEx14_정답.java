package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 숫자이동[1단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 
 * @) 정답을 보지않고 소스를 동작시켜 본뒤에 내용을 이해하고 코드를 작성할 것
 * 
 */

public class ArrayEx14_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Boolean isRunning = true;
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		int player = 0;   //    2
		int temp = 0;
		
		// 플레이어의 위치 값 찾기
		for (int i=0; i<7; i++) {
			if (game[i] == 2) {
				player = i;
			}
		}
		
		while (isRunning) {
			System.out.println(Arrays.toString(game));
			System.out.print("입력 : ");
			int input = scan.nextInt();
			
			// 숫자1 입력시
			if (input == 1) {
				if (player <= 0 ) {
					System.out.println("이미 끝에 도달했어요.");
					break;
				}
				else {
					game[player] = 0;
					game[player-1] = 2;
					player--;
				}
			}
			
			// 숫자2 입력시
			else if (input == 2) {			
				if (player >= 6 ) {
					System.out.println("이미 끝에 도달했어요.");
					break;
				}
				else {
					game[player] = 0;
					game[player+1] = 2;
					player++;
					System.out.println(player);
				}
			}
			
			// 숫자를 잘못 입력한 경우
			else if (input !=2 || input != 1 ) {
				System.out.println("숫자를 다시 입력하세요.");
				continue;
			}	
		}
		
		
		scan.close();
		
	}
	
}
