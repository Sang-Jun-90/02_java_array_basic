package step2_01.array;

import java.util.Scanner;

/*
 * # 즉석복권
 * 
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 * 2. 메뉴를 선택해서 1번 2번 3번이 당첨인지 확인한다.
 * 3. 0번은 반복문을 종료한다.
 * 
 */
//2021-02-16 20:30 ~ 20:50

public class ArrayEx10_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] lotto1 = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lotto2 = {7, 0, 7, 7, 0, 0, 0, 0};
		int[] lotto3 = {7, 0, 7, 7, 7, 0, 7, 0};
		int sel      = 0;
			
		while (true) {
					
			System.out.println("\n[1]번복권 결과확인");
			System.out.println("[2]번복권 결과확인");
			System.out.println("[3]번복권 결과확인");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			sel = scan.nextInt();
			
			// 1번 선택
			if (sel == 1) {
				Boolean getLotto = false;

				for (int i = 0 ; i < lotto1.length-3 ; i++) {
					int triple = lotto1[i]+lotto1[i+1]+lotto1[i+2];
					if (triple == 21) getLotto = true;
				}
				if(getLotto) System.out.println("당첨");
				else System.out.println("낙첨");
			}
			// 2번 선택
			else if (sel == 2) {
				Boolean getLotto = false;
				for (int i = 0 ; i < lotto2.length-3 ; i++) {
					int triple = lotto2[i]+lotto2[i+1]+lotto2[i+2];
					if (triple == 21) {
						getLotto = true;
					}
				}
				if(getLotto) System.out.println("당첨");
				else System.out.println("낙첨");

				
			}
			// 3번 선택
			else if (sel == 3) {
				Boolean getLotto = false;
				for (int i = 0 ; i < lotto1.length-3 ; i++) {
					int triple = lotto3[i]+lotto3[i+1]+lotto3[i+2];
					if (triple == 21) {
						getLotto = true;
					}
				}
				if(getLotto) System.out.println("당첨");
				else System.out.println("낙첨");

				
			}
			// 0번 선택
			else if (sel == 0) {
				break;
			}
			else {
				System.out.println("번호를 다시선택해주세요.");
				continue;
			}
			
		}
		
		scan.close();
		
	}
}
