// 1단계
// 서울에서 경산까지

import java.io.*;
import java.lang.Math;
class Solution211202 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split(" ");
		int num = Integer.parseInt(arr[0]);
		int K = Integer.parseInt(arr[1]);
		int answer = 0;
		int[][] travel = new int[num][4];
		for(int i = 0; i < num; i++){
			String input1 = br.readLine();
			String[] arr1 = input1.split(" ");
			travel[i][0] = Integer.parseInt(arr1[0]);
			travel[i][1] = Integer.parseInt(arr1[1]);
			travel[i][2] = Integer.parseInt(arr1[2]);
			travel[i][3] = Integer.parseInt(arr1[3]);
		}
		int[][] dp = new int[num][K + 1]; 
		dp[0][travel[0][0]] = travel[0][1];
		dp[0][travel[0][2]] = travel[0][3];
		for (int i = 1; i < travel.length; i++) {
			for (int j = travel[i][2]; j <= K; j++) { 
				if (j - travel[i][0] < 0) { //array index out of bounds exception handling
					if (dp[i-1][j - travel[i][2]] != 0) {
						dp[i][j] = dp[i-1][j - travel[i][2]] + travel[i][3]; 
					}
					continue;
				}
				if (dp[i-1][j - travel[i][0]] == 0 && dp[i-1][j - travel[i][2]] == 0) {
					continue;
				}else if (dp[i-1][j - travel[i][2]] == 0) {
					dp[i][j] = dp[i-1][j - travel[i][0]] + travel[i][1]; 
					continue;
				}
				dp[i][j] = Math.max(dp[i-1][j - travel[i][0]] + travel[i][1], dp[i-1][j - travel[i][2]] + travel[i][3]);
			} 
		}
		for (int i = 0; i <= K; i++) {
			answer = Math.max(answer, dp[travel.length - 1][i]);
		}
		System.out.print(answer);
	}
}