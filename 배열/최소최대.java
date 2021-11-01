package code11_01;

import java.util.Scanner;

public class 최소최대 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		
		int N = input.nextInt();
		
		int [] arr = new int [N];
		

		
		int X ;
		for(int i = 0; i < N; i++) {
			arr[i] = input.nextInt();
		}
		int max = arr[0];
		
		int min = arr[0];
		
		for(int i = 0; i < N; i++) {
			if(max <= arr[i]) {
				max = arr[i];
			}
			else if(min >= arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min + " " + max);
	} 
}
