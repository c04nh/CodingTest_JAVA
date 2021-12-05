// 1단계
// 타일 장식물

import java.io.*;
class Solution211205 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		long answer = 0;
		long[] arr = new long[num + 2];
		arr[0] = 0;
		arr[1] = 1;
		for(int i = 0; i <= num - 2; i++){
			arr[i + 2] = arr[i] + arr[i + 1];
		}
		answer = 4 * arr[num] + 2 * arr[num - 1];
		System.out.print(answer);
	}
}