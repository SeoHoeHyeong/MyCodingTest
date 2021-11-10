package code11_10;

import java.util.Scanner;

public class 덩치합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//전체 사람수 
		int N = input.nextInt();
		int [][] human = new int[N][2];
		
		int[] answer = new int[N];
		
		//처음 모든 사람의 순위를 1로 설정
		for(int i = 0; i < answer.length;i++) {
			answer[i]++;
		}
		int k = 1;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 2; j++) {
				human[i][j] = input.nextInt();
			}
		}
	for(int j = 0; j < N; j++) {
		for(int i = j; i < N; i++) {
			if(human[j][0] < human[i][0] && human[j][1] < human[i][1]) {
				answer[j]++;
			}
			if(human[j][0] > human[i][0] && human[j][1] > human[i][1]) {
				answer[i]++;
			}
		}
	}
		for(int i = 0; i < answer.length;i++) {
		System.out.print(answer[i] + " ");
		}
		
	}

}
