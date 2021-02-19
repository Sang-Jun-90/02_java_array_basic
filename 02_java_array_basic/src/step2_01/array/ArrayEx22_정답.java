package step2_01.array;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 최종
 * 
 *  20번 21번 22번의 문제를 한 코드로 병합하여 보자.
 * 
 * 1) 추가
 * 2) 삭제
 * 3) 삽입
 * 
 *  정답 없음
 */


public class ArrayEx22_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,0,0,0};
		int elementCnt = 2;
		int selectMenu = 0;
		int delIdx = 0;  // 삭제할 데이터의 위치값   // 1
		
		while (true) {
			System.out.println("================");
			System.out.print("[ ");
			for (int i = 0 ; i < elementCnt ; i++) {System.out.print(arr[i] + " ");}
			System.out.println("]");
			
			System.out.println("\n1추가");
			System.out.println("2삭제");
			System.out.println("3삽입");
			System.out.println("4종료\n");
			System.out.print("입력 : ");
			selectMenu = scan.nextInt();
			
			// 1 추가
			if (selectMenu == 1) {
				System.out.print("추가할 데이터 : ");
				int inputData = scan.nextInt();
				if (elementCnt == 5) System.out.println("더이상 데이터를 추가 할 수 없습니다.");
				arr[elementCnt] = inputData;
				elementCnt++;
			}
			
			// 2 삭제
			else if (selectMenu == 2) {
				System.out.print("삭제할 데이터 : ");
				int delData = scan.nextInt();
				for (int i = 0; i < elementCnt-1; i++) {   
					if(arr[i] == delData) delIdx = i;
				}
				// 데이터가 없는 경우
				if (delIdx == 0) System.out.println("요청하신 데이터는 없습니다.");
				else {
					arr[delIdx] = 0;
					elementCnt--;
				}
				delIdx = 0;
			}
			
			// 3 삽입
			else if (selectMenu == 3) {
				
			}
			
			// 4 종료
			else if (selectMenu == 4) {
				
			}
			
			// 숫자 잘못 입력
			else System.out.println("다시 입력하세요.");
			
		}
		
		
		
	}
	
}
