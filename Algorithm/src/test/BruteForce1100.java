package test;
import java.util.Scanner;
public class BruteForce1100 {

	public static void main(String args[]){
		char[][] arr = new char[8][8];
		Scanner input = new Scanner(System.in);
		int answer = 0;
		String tmp;
		for(int i=0; i<8; i++){
			tmp = input.nextLine();
			for(int j=0; j<8; j++){
				arr[i][j] = tmp.charAt(j);
			}
		}
		
		for(int i=0; i<8; i++){
			for(int j=0; j<8; j++){
				if(i%2 == 0 && j%2 == 0 && arr[i][j] == 'F'){
					answer++;
				} else if(i%2 != 0 && j%2 !=0 && arr[i][j] == 'F'){
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
	
}
