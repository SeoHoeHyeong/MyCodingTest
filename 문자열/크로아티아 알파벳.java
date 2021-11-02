package code11_02;

import java.util.Scanner;

public class 크로베티아알파벳 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String inputStr = input.next();
		
		String answer = inputStr.replaceAll("c=", "c");
		answer = answer.replaceAll("c-", "c");
		answer = answer.replaceAll("dz=", "0");
		answer = answer.replaceAll("d-", "d");
		answer = answer.replaceAll("lj", "0");
		answer = answer.replaceAll("nj", "0");
		answer = answer.replaceAll("s=", "s");
		answer = answer.replaceAll("z=", "z");
		
		
		System.out.println(answer.length());
	}

}
