package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

// 2021-02-16 20:04 ~ 20:30

/*
 * 
 * # 영화관 좌석예매
 * 
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * [X] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 1
 * [X] [O] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 
 * [X] [O] [X] [O] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 *
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 이미 예매가 완료 되었습니다.
 * 
 * [X] [O] [X] [O] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (2번 입력)
 * ----------------------
 * 매출액 : 24000원
 * 
 */


public class ArrayEx09_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char seat[] = {'X','X','X','X','X','X','X'};
		int balance = 0;
		
		
		// 예시화면
		
		Boolean isRun= true;
		
		while (isRun) {
			System.out.println(Arrays.toString(seat));
			System.out.println("1. 좌석 예매");
			System.out.println("2. 종료");
			System.out.print("입력 : ");
			int input1 = scan.nextInt();
			
			// 좌석예매를 선택하는 경우
			if (input1 == 1) {
				System.out.print("좌석선택(1~7) : ");
				int input2 = scan.nextInt()-1;
				
				for (int i = 0 ; i < seat.length ; i++) {
					if (input2 == i) {
						// 빈자리인 경우
						if (seat[i] == 'X' ) {
							seat[i] = 'O';
							balance += 12000;
						}
						// 빈자리가 아닌 경우
						else if (seat[i] == 'O') {
							System.out.println("이미 예매가 완료 되었습니다.");
							continue;
						}		
					}
				}
			}
			// 종료를 선택하는 경우
			else if (input1 == 2) {
				System.out.println("총 매출 : "  + balance);
				isRun = false;
			}
			// 잘못입력하는 경우
			else {
				System.out.println("번호를 잘못 입력했습니다.");
				continue;
			}
			
		}
		
		
	}
	
}
