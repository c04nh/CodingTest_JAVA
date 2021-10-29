// 1단계
// 소수 판별

import java.io.*;

class Solution211027 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int input_num = Integer.parseInt(input);
		for(int i = 2; i < input_num; i++){
			if(input_num % i == 0){
				System.out.print("False");
				break;
			}
			if(i == input_num - 1 && input_num % i != 0) System.out.print("True");
		}
	}
}