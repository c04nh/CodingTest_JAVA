// 1단계
// 특정 구간의 합

import java.io.*;

class Solution211026 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String arr_input = br.readLine();
		String[] arr = arr_input.split(" ");
		String tmp_input = br.readLine();
		String[] tmp = tmp_input.split(" ");
		int tmp1 = Integer.parseInt(tmp[0]);
		int tmp2 = Integer.parseInt(tmp[1]);
		int sum = 0;
		for(int i = tmp1 - 1; i < tmp2; i++){
			sum += Integer.parseInt(arr[i]);
		}		
		System.out.print(sum);
	}
}