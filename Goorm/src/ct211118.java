// 1단계
// 세로 순서 사각형

import java.io.*;
class Solution211118 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		for(int i = 1; i <= num; i++){
			for(int j = i; j <= i + num * (num - 1); j += num) System.out.print(j + " ");
			System.out.println();
		}
	}
}