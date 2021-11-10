package code11_10;

import java.util.Scanner;

public class 영화감독숌 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//제목넘버링 N<=10000
		int N = input.nextInt();
		
		int answer = 0;
		
		//i조건을 어디까지 생각해야하는건지 잘모르겠음 아마 666 세자리 + 입력받은 자리의숫자이지 않을까싶음
		for(int i = 0; i < 10000000; i++) {
			if(Integer.toString(i).contains("666")) {
				answer++;
				if(answer == N) {
					System.out.println(i);
					break;
				}
			}
		}
 
	}

}
