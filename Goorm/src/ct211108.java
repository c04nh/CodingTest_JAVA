// 1단계
// 모양찍기

import java.io.*;

class Solution211108 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		for(int i = 1; i <= num; i++){
			for(int j = num; j >= i; j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}