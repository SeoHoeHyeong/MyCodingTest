package code11_02;

import java.util.LinkedList;

public class 셀프넘버 {

	public static void main(String[] args) {
		
		selfNum();

	}
	public static void selfNum() {
		//최대값
		int max = 10000;
		int [] arr = new int [max];
		boolean [] check = new boolean[max];

		for(int i = 1; i <= max;i++) {
			arr[i-1] = i;
		}
		
		for(int i = 1; i <= max; i++) {
			if(numberOfDigits(i) < 10000) {
			check[numberOfDigits(i)-1] = true;
			}
		}
		
		//배열 출력
		for(int i = 0; i < arr.length; i++) {
			if(check[i] == false && arr[i] != 10000) {
				System.out.println(arr[i]);
			}
		}
		
	}
	//각 자리수를 더한 값을 반환해주는 함수
	public static int numberOfDigits(int n) {
		
		int Num = n;
		String strNum = Integer.toString(Num);
		int Sum = 0;
		for(int i = 0; i < strNum.length();i++) {
			Sum += (int)(strNum.charAt(i)-'0');
		}
		Sum = Sum + Num;
		return Sum;
	}
}
