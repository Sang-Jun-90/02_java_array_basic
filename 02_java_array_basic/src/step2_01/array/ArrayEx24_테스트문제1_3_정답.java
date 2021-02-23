package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx24_테스트문제1_3_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 문제 13) 아래 배열 l과 m을 비교해서 둘의 합이 짝수 일때만 n에 저장 	
		// 예) n = {74,82,0,0,0}
		int[] l = { 10, 20, 30, 40, 50 };
		int[] m = { 13, 54, 17, 42, 1 };
		int[] n = { 0,0,0,0,0};
				
		int cnt1 = 0;
		for (int i = 0 ; i < l.length ; i++) {
			if ((l[i] + m[i]) % 2 == 0 ) {
				n[cnt1] = (l[i] + m[i]);
				cnt1++;
			}
		}
				
		System.out.println(Arrays.toString(n));
		System.out.println();
		
		// 문제 14) 아래는 시험결과 이다. 시험에 합격한 사람의 번호만 win에 저장 (60점이상 합격)
		int[] num = { 1001, 1002, 1003 };
		int[] score = { 50, 83, 78 };
		int[] win = { 0,0,0 };
		// 예) win[3]= {1002, 1003, 0};
		
		int cnt2 = 0;
		
		for (int i = 0 ; i < num.length ; i++) {
			if (score[i] >= 60) {
				win[cnt2] = num[i];
				cnt2++;
			}
		}
		System.out.println(Arrays.toString(win));
		System.out.println();
		
		// 문제 15) 아래는 시험결과 이다 시험에 합격한 사람의 번호만 win2에 저장 (60점이상 합격)
		int[] data = { 1001, 80 , 1002, 23, 1003 , 78 };
		int[] win2 = { 0,0,0 };
		// 예) win2[3] = {1001, 1003, 0};
		
		int cnt3 = 0;
		
		for (int i = 0 ; i < data.length; i+=2) {
			if (data[i+1] >= 60) {
				win2[cnt3] = data[i];
				cnt3++;
			}
		}
		System.out.println(Arrays.toString(win2));
		System.out.println();
		
	
		// 문제 16) 아래 배열 o 에서 내가 입력한 값만 빼고p 에 저장 
		int[] o = { 10,20,30,40,50 };
		int[] p = { 0,0,0,0,0 };
		// 예) 30 ==> p = {10,20,40,50,0};
		
		System.out.print("입력 : ");
		int input = scan.nextInt();
		
		for (int i = 0 ; i < o.length ; i++) {  
			if (input == o[i]) {     // i = 2 ( 30 )
				// 앞 
				for (int j = 0 ; j < i ; j++) {
					p[j] = o[j];
				}
				// 뒤 
				for (int k = o.length-2 ; k >= i ; k--) {
					p[k] = o[k+1];
				}
				
			}
		}
		
		System.out.println(Arrays.toString(p));
		System.out.println();
		
		// 문제 17) 아래 배열 q에서 내가 입력한 번호만 빼고 다른 번호와 값을 r 에 저장 
		int[] q = { 1001, 40, 1002, 65, 1003,  70 };
		int[] r = { 0,0,0,0,0,0 };
		// 예) 1002 ==> r = {1001, 40, 1003, 70 , 0, 0};
		
		System.out.print("입력 : ");
		int input2 = scan.nextInt();
		
		for (int i = 0 ; i < q.length ; i+=2) {   // i = 2 
			if (input2 == q[i]){
				
				// 앞 
				for (int j = 0 ; j < i ; j++) {   // j = 0 ,1
					r[j] = q[j]; 
				}
				// 뒤 
				for (int k = o.length-2 ; k >= i ; k--) {
					r[k] = q[k+1];
				}
				
			}
		}
		
		System.out.println(Arrays.toString(r));
		System.out.println();
		
		
		// 문제 18) 
		int[] arr = {10,20,30,40,50};
		int[] s = new int[5];
		
		// 숫자를 5개 입력받고 arr 배열안에 입력한값이 있을때마다 
		// s배열안에 해당 값의 인덱스를 차례대로 저장할려고 한다. 
		// 조건) 만약에 입력한 숫자가 arr에 없으면 인덱스 대신 -1 저장 
		
		// 예) 10, 20, 10, 1, 50
		//  s = { 0, 1, 0, -1, 4}
		
		// 예)  30, 40, 1, 10, 2
		// s = { 2, 3, -1, 0, -1}
		
		int cnt4 = 0;
		
		for (int i = 0 ; i < arr.length ; i++) {
			int minus = -1;
			System.out.print("입력 : ");
			int input3 = scan.nextInt();
			for (int j = 0 ; j <arr.length ; j++) {
				if (input3 == arr[j]) {
					minus = j;
				}
			}
			s[i] = minus;
		}
		System.out.println(Arrays.toString(s));
		System.out.println();
		
		scan.close();
				
		
	}

}
