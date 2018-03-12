package test;

import java.util.Scanner;

public class BruteForce1065 {
	
	public static void main(String args[]){
		int input = new Scanner(System.in).nextInt();
		int result = 99;
		if(input < 100) {
			result = input;
		} else {
			for(int i = 100; i<=input; i++) {
				int first = i/100;
				int second = (i%100)/10;
				int third = i%10;
				if((first - second) == (second - third)){
					result++;
				}
			
			}
		}
		System.out.println(result);
	}
}
