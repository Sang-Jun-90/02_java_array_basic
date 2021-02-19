package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 값 교체하기[2단계] 
 */
//2021-02-18 19:13 ~ 20:00
public class ArrayEx12_정답 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,30,40,50};
		int getIndex1 , getIndex2;
		int getValue1 , getValue2;
		int temp = 0;
		
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예    1) 인덱스1 입력 : 1
		//		   인덱스2 입력 : 3
		//		  {10, 40, 30, 20, 50}

//		System.out.print("인덱스 1 입력 : ");
//		getIndex1 = scan.nextInt();
//		System.out.print("인덱스 2 입력 : ");
//		getIndex2 = scan.nextInt();
//		
//		temp = arr[getIndex1]; 
//		arr[getIndex1] = arr[getIndex2];
//		arr[getIndex2] = temp;
//		
//		System.out.println(Arrays.toString(arr));
		
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 10
		//        값2 입력 : 50
		//		  {50, 20, 30, 40, 10}
		
		System.out.print("인덱스 1 입력 : ");
		getValue1 = scan.nextInt();  // 10
		System.out.print("인덱스 2 입력 : ");
		getValue2 = scan.nextInt();  // 50

		for (int i = 0 ; i < arr.length ; i++) {
			if (getValue1 == arr[i]) {   // 10    i = 0
				arr[i] =  getValue2; // 50,20,30,40,50  
			}
			else if (getValue2 == arr[i]) {   // 50    i = 4 
				arr[i] =  getValue1; // 50,20,30,40,10  
			}
		}

		System.out.println(Arrays.toString(arr));
		
		
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		System.out.print("학번 1 입력 : ");
		int hakbun1 = scan.nextInt();    
		System.out.print("학번 2 입력 : ");
		int hakbun2 = scan.nextInt();    
		
		// hakbun1  = 1002
		// hakbun2  = 1003
		
		int temp1 = 0 ;   // 11
		int temp2 = 0 ;   // 45
		int index1 = 0 ;  // 1
		int index2 = 0 ; // 2
		
		
		for (int i = 0 ; i < hakbuns.length ; i++ ) {
			
			if (hakbun1 == hakbuns[i]) {
				// i = 1
				temp1 = scores[i];
				index1 = i;
			}
			else if (hakbun2 == hakbuns[i]) {
				// i = 2
				temp2 = scores[i];
				index2 = i;
			}		
		}

		scores[index1] = temp2;
		scores[index2] = temp1;
		
		System.out.println(Arrays.toString(scores));
		
		
		scan.close();
		
	}
	
}
