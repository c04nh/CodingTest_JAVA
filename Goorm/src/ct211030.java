// 1단계
//3과 5의 배수

import java.io.*;

class Solution211030 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int input_num = Integer.parseInt(input);
		int sum = 0;
		for(int i = 3; i <= input_num; i++){
			if(i % 3 == 0 || i % 5 == 0) sum += i;
		}
		System.out.print(sum);
	}
}