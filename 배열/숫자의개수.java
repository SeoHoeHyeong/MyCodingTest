package code11_02;

import java.util.Scanner;

public class 숫자의개수 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		
		int [] arr = new int[10];
		int X = A * B * C;
		String strX = Integer.toString(X);
		//int형을 char형으로 바꾸기 위해서는 char형에다 '0'을 더해준다.
		for(int i = 0; i < strX.length(); i++) {
			for(int j = 0; j < 10; j++) {
			if(strX.charAt(i) == (char)(j+'0')) {
			
				arr[j]++;
				}
			}
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
	}

}
