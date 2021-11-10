package code11_10;

import java.util.Scanner;

public class 분해합 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int answer = 0;
		for(int i = 1; i <= N; i++) {
			if(func(i) == N) {
				answer = i;
				break;
			}
		}
		System.out.println(answer);
	}
		//생성자를 만들어주는 함수
		static int func(int n) {
		
			int num = n;
			String covert = Integer.toString(num);
			
			int sum = 0; 
			
			for(int i = 0; i < covert.length(); i++) {
				sum += (int)(covert.charAt(i) - '0');
			}
			
			sum += num;
			
		
		return sum;
	}
}
