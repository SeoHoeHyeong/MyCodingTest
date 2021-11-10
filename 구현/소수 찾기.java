package code11_10;

import java.util.Scanner;

public class 소수찾기 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		//주어진 숫자의 개수
		int N = input.nextInt();
		int answer = 0;
		int [] store = new int[N];
		for(int i = 0; i < N; i++) {
			store[i] = input.nextInt();
		}
		
		for(int i = 0; i < N;i++ ) {
			if(primeNum(store[i]) == true) {
				answer++;
			}
		}
		System.out.println(answer);
	}
	//소수를 판별하는 메소드
	static boolean primeNum(int n) {
		//소수의 조건은 1이상인 것도 있으니 참고할 것
		if(n == 1) {
			return false;
		}
		for(int i = 2 ; i < n-1; i++) {
			if(n % i == 0 ) {
				return false;
			}
		}
		
		return true;
	}

}
