// 1단계
// 피라미드

import java.io.*;
class Solution211113 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int a = Integer.parseInt(input);
		for(int i = 0; i < a; i++){
			for(int j = a - 1; j > i; j--){
					System.out.print(" ");
			}
			for(int j = 0 ; j < 2 * i + 1; j++){
				System.out.print("*");
			}
    	System.out.println();
		}
	}
}