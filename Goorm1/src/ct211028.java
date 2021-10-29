// 1단계
// 홀짝 판별

import java.io.*;

class Solution211028 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int input_num = Integer.parseInt(input);
		if(input_num % 2 == 1) System.out.print("odd");
		else System.out.print("even");
	}
}