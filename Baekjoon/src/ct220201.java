// 부녀회장이 될테야

import java.util.Scanner;

class Solution220201{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] APT = new int[15][15];
		for(int i = 0; i < 15; i++) {
			APT[i][1] = 1;
			APT[0][i] = i;
		}
		for(int i = 1; i < 15; i ++) { 
			for(int j = 2; j < 15; j++) {
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
			}
		}	
		int T = scan.nextInt();
		for(int i = 0; i < T; i++) {
			int k = scan.nextInt();
			int n = scan.nextInt();
			System.out.println(APT[k][n]);
		}
	}
 
}