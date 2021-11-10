package code11_10;

import java.util.Scanner;

public class 블랙잭 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//카드의 개수
		int N = input.nextInt();
		//M을 넘지 않아야함
		int M = input.nextInt();
		//정답 
		int answer = 0;
		//숫자를 저장할 배열
		int [] num = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			num[i] = input.nextInt();
		}
		
		for(int i = 0; i < num.length;i++) {
			for(int j = i+1; j < num.length;j++) {
				for(int k = j+1; k < num.length;k++) {
					sum = num[i]+num[j]+num[k];
					//System.out.println("sum: " + sum + " " + num[i] + " " + num[j] + " " + num[k]);
					if(sum > answer && sum <= M) {
						answer = sum;
					}
				}
			}
		}
		System.out.println(answer);
		
	}

}
