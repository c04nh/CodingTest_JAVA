// 1단계
// 3의 배수 게임

import java.io.*;

class Solution211106 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		for(int i = 1; i <= Integer.parseInt(input); i++){
			if(i % 3 == 0) System.out.print("X ");
			else System.out.print(i + " ");
		}
	}
}