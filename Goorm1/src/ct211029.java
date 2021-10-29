// 1단계
// 약수 구하기

import java.io.*;

class Solution211029 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int input_num = Integer.parseInt(input);
		for(int i = 1; i <= input_num; i++){
			if(input_num % i == 0) System.out.print(i + " ");
		}
	}
}