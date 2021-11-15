// 1단계
// Substring

import java.io.*;
class Solution211115 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String input2 = br.readLine();
		String[] arr = input2.split(" ");
		int num1 = Integer.parseInt(arr[0]);
		int num2 = Integer.parseInt(arr[1]);
		for(int i = num1 - 1; i < num1 + num2 - 1; i++) System.out.print(input.charAt(i));
	}
}