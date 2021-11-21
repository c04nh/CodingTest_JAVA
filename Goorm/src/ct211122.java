// 1단계
// 16진수

import java.io.*;
class Solution211122 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		System.out.print(Integer.toHexString(num));
	}
}