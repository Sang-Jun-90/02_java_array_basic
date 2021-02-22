package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx24_테스트문제1_1_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = { 10, 4, 5, 3, 1 };
		
		// 문제 1) 위 배열를 이용해서 전체 요소의 합출력
		
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
		
		// 문제 2) 값을 입력하면 인덱스 출력
		// 예) 5 ==> 2  ,  1 ==> 4
		
		System.out.print("입력 : ");
		int input1 = scan.nextInt();
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == input1) System.out.println(i);
		}
		
		
		// 문제 3)  인덱스를 입력하면 값 출력
		// 예) 2 ==> 5  , 4 ==> 1
		
		System.out.print("입력 : ");
		int input2 = scan.nextInt();
		
		for (int i = 0; i < a.length; i++) {
			if (i == input2) System.out.println(a[i]);
		}

		// 문제 4) 위 배열중 가장 큰 값 출력 
		// 예) 10
		
		int high = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= high) {
				high = a[i];
			}
		}
		System.out.println(high);
		

		// 문제 5) 위 배열중 홀수의 개수 출력 
		// 예) 홀수의 개수 : 3
		
		int countOdd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				countOdd++;
			}
		}
		System.out.println(countOdd);
		
			
		// 문제 6) a의 값중 홀수만 b에 저장 (저장위치는 a와 b의 동일한 위치에 저장)
		// 예) b => {0, 0, 5, 3, 1}
		int[] b = {0, 0, 0, 0, 0};
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				b[i] = a[i];
			}
		}
		System.out.println(Arrays.toString(b));
		
		
		
		// 문제 7) 다음 리스트를 이용해서 a의 값중 홀수만 c에 저장(저장위치는 앞에서부터  저장 , 3번 문제와 다름)
		// 예) b => {5, 3, 1, 0, 0}
		int[] c = { 0,0,0,0,0 };
		
		int countIdx = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				c[countIdx] = a[i];
				countIdx++;
			}
		}
		System.out.println(Arrays.toString(c));
		
		
		scan.close();
		
	}

}
