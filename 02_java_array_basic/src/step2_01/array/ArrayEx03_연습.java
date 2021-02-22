package step2_01.array;

import java.util.Arrays;

/*
 * # 배열 기본문제
 */

public class ArrayEx03_연습 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		// 문제1) for문을 이용하여 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 10;
		}
		System.out.println(Arrays.toString(arr));
		
		
		// 문제2) 1번에서 생성한 arr에서 4의 배수만 출력
		// 정답2) 20 40

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		// 문제3) 1번에서 생성한 arr에서 4의 배수의 합 출력
		// 정답3) 60

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) sum += arr[i];
		}
		System.out.println(sum);
		
		// 문제4) 1번에서 생성한 arr에서 4의 배수의 개수를 출력
		// 정답4) 2

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) count++;
		}
		System.out.println(count);
		
		
		// 문제5) 1번에서 생성한 arr에서 짝수의 개수를 출력
		// 정답5) 5

		int count1 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) count1++;
		}
		System.out.println(count1);
		
		
	}
	
}
