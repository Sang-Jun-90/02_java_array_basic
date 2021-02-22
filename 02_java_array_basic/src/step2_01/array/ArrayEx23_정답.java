package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # ATM[3단계]
 * 
 * 1. 가입
 *  - 계좌번호와 비밀번호를 입력받아 가입
 *  - 계좌번호 중복검사
 * 2. 탈퇴
 *  -  계좌번호를 입력받아 탈퇴
 */


public class ArrayEx23_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int accsCnt = 2;
		int selectMenu = 0;
		boolean isRun = true;
		
		while (isRun) {
			
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			System.out.println("3.종료");
			System.out.print("메뉴 선택 : ");
			selectMenu = scan.nextInt();
			
			
			// 가입
			if	(selectMenu == 1) {
				System.out.print("계좌번호 : ");
				int inputAcc = scan.nextInt();
				
				for (int i = 0; i < accsCnt ; i++) {
					if (accs[i] == inputAcc) {
						System.out.println("※ 중복계좌입니다.");
						System.out.println();
						continue;
					}
				}
				accs[accsCnt] = inputAcc;
				
				System.out.print("비밀번호 : ");
				int inputPw = scan.nextInt();
				
				pws[accsCnt] =inputPw;
				accsCnt++;
				
			}
			
			// 탈퇴
			else if (selectMenu == 2) {
				System.out.print("계좌번호 : ");
				int inputAcc2 = scan.nextInt();
				
				int findAcc = -1;
				
				for (int i = 0; i < accs.length; i++) {
					if (inputAcc2 == accs[i]) {
						accs[accsCnt-1] = 0;
						pws[accsCnt-1] = 0;
						findAcc = i;
						System.out.println("탈퇴 완료");
						System.out.println(Arrays.toString(accs));
						System.out.println(Arrays.toString(pws));
					}
				}
				if (findAcc == -1) System.out.println("계좌가 없는뎁쇼");
				
			}
			
			// 종료
			else if (selectMenu == 3) break;
			
		}

	}
}
