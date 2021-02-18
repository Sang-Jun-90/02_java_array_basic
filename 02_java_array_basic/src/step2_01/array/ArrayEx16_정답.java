package step2_01.array;

import java.util.Arrays;
import java.util.Random;

/*
 * # 1 to 50[1단계] : 1 to 4
 * 
 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
 * 2. 사용자는 가장 작은수 1부터(다음은 2) 순서대로 해당 위치 값을 입력한다.
 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
 
 * 예)
 * [ 4 2 3 1 ]
 * 
 * 입력 : 3  (가장 작은수 1이 3번째에 위치 )
 * 4 2 3 9
 * 입력 : 1  ( 그 다음으로 작은 수 2가 1번째에 위치 )
 * 4 9 3 9
 * 입력 : 2  ( 그 다음으로 작은 수 3이 2번째에 위치 )
 * 4 9 9 9
 * 입력 : 0  ( 그 다음으로 작은 수 4가 0번째에 위치 )
 * 9 9 9 9
 * 
 * 코드 종료
 */


public class ArrayEx16_정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] arr = new int[4];
		boolean[] isCheck = new boolean[4];
		
		// 셔플
		
		Boolean isRun = true;
		int temp = 0;  
		
		
		while (isRun) {
			int ranNum = ran.nextInt(4)+1;
			int ranIndex = ran.nextInt(4);
			
			// 없는경우
			
			
			// 이미 있는경우
			
		}
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(isCheck));

		
	}
	
}
