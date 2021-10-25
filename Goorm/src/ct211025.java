// 1단계
// 비트연산 기본 2

import java.io.*;

class Solution211025 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		System.out.println(a >> b);
		System.out.println(a << b);
	}
}