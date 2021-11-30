// 1단계
// 태민이의 취미

import java.io.*;
class Solution211130 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		long num = Integer.parseInt(input);
    long sum = num * (num + 1) / 2 % 1000000007L;
    long result = sum * sum % 1000000007L;
    System.out.println(result);
	}
}