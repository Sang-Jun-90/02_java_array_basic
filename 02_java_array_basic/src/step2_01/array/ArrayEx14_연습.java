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

public class ArrayEx14_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		int player = 0;
		
		while(true) {

			int temp = 0;
			for (int i=0; i<7; i++) {
				if (game[i] == 2) {
					player = i;
				}
			}
			System.out.println(Arrays.toString(game));
			System.out.println("입력 : ");
			int input = scan.nextInt();
			
			if (input== 1) {
				if (player <= 0) {
					System.out.println("X");
					continue;
				}
				game[player] = 0;
				game[player-1] = 2;
				player--;
			}
			else if (input == 2) {
				if (player >= game.length) {
					System.out.println("X");
					continue;
				}
				game[player] = 0;
				game[player+1] = 2;
				player++;
			}
			
		}
		
	
				
	}
	
}
