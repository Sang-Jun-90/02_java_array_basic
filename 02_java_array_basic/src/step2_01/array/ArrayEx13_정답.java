package step2_01.array;

import java.util.Arrays;

/*
 * # 4의 배수만 저장
 * 
 * - arr 배열에서 4의 배수의 개수를 계산하여 temp 배열을 생성한뒤에 
 *   arr 배열의 요소들을 temp로 옮겨담자.
 * 
 * 
 */

// 2021-02-18 20:00 ~ 20:17

public class ArrayEx13_정답 {

	public static void main(String[] args) {
		
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		
		int count = 0;
		int tempCount = 0;
		
		for (int i = 0 ; i < arr.length ; i++) {
			// count 찾기
			if (arr[i] % 4 == 0) {
				count++;
			}
		}
		
		temp = new int[count];
		
		for (int i = 0 ; i < arr.length ; i++) {
			// count 찾기
			if (arr[i] % 4 == 0) {
				temp[tempCount] = arr[i];
				tempCount++;
			}
		}
		
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		
		
	}
	
}
