// 1단계
// 네 수의 곱

import java.io.*;

class Solution211107 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		int d = Integer.parseInt(arr[3]);
		System.out.print(mul(mul(a, b), mul(c, d)));
	}
	public static int mul(int a, int b){
		return a * b;
	}
}