// 1단계
// 리그 경기 횟수 구하기

import java.io.*;

class Solution211031 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int input_num = Integer.parseInt(input);
		int sum = 0;
		for(int i = 1; i < input_num; i++){
				sum += i;
		}
		System.out.print(sum);
	}
}