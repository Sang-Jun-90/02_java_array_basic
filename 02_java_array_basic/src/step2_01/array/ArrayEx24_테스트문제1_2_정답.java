package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx24_테스트문제1_2_정답 {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		
		
		// 문제 8) 아래 d에서 scanner로 내가 입력한 값만 빼고 e에 저장 
		int[] d = { 10,20,30,40,50 };
		int[] e = { 0,0,0,0,0 };
		// 예) 30 ==> e = {10,20,40,50,0};
		
		
		// 앞 뒤를 자르지 않고 넣는 방법 고민해보기
//		System.out.print("입력 : ");
//		int input1 = scan.nextInt();
//		
//		for (int i = 0; i < e.length; i++) {  
//			if (d[i] == input1) {
//				d[i] = 0 ;
//				// 앞
//				for (int j = 0; j < i; j++) {  
//					e[j] = d[j];
//				}
//				// 뒤
//				for (int k = 4; k > i  ; k--) {  
//					e[k-1] = d[k];
//				}
//				
//			}
//		}
//		System.out.println(Arrays.toString(e));
		

		// 문제 9) 아래 f에서 scanner로 내가 입력한 번호와 값을 빼고 g에 저장 
		int[] f = { 1001, 40, 1002, 65, 1003,  70 };
		int[] g = { 0,0,0,0,0,0 };
		// 예) 1002 ==> {1001, 40, 1003, 70 , 0, 0};
		
//		System.out.print("입력 : ");
//		int input2 = scan.nextInt();
//		
//		for (int i = 0; i < f.length; i++) { // i = 2 
//			if (f[i] == input2) {
//				
//				// 앞
//				for (int j = 0; j < i; j++) { // j = 0 , 1
//					g[j] = f[j];
//				}
//				// 뒤
//				for (int k = f.length-3; k >= i; k--) {   // k = 3 , 2
//					g[k] = f[k+2];
//				}
//			}
//		}
//		System.out.println(Arrays.toString(g));
		
		// 문제 10) 숫자를 하나 입력받고 아래 배열을 앞으로 하나씩 밀어낸후 맨뒤에 저장
		int[] h = { 10,20,30,40,50 };
		// 예)  60 ==> {20,30,40,50,60};
		
		System.out.print("입력 : ");
		int input3 = scan.nextInt();
		
		for (int i = 0; i < h.length-1; i++) {
			h[i] = h[i+1];
		}
		h[4] = input3;
		
		System.out.println(Arrays.toString(h));
		
		// 문제 11) 숫자를 하나 입력받고 아래 배열을 뒤로 하나씩 밀어낸후 맨 앞에 저장 
		int[] i = { 10,20,30,40,50 };
		// 예) 60 ==> {60,10,20,30,40};
		
		// 문제 12) 아래배열을 거꾸로 저장 
		int[] j = { 1,2,3,4,5 };
		int[] k = { 0,0,0,0,0 };
		//예) k => {5,4,3,2,1};

		
		
		
	}

}
