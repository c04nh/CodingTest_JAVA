// 1단계
// 특정 문자 개수 구하기

import java.io.*;
class Solution211114 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String input2 = br.readLine();
		char input3 = input2.charAt(0);
		int count = 0;
		for(int i = 0; i < input.length(); i++){
			if(input.charAt(i) == input3) count++;
		}
		System.out.print(count);
	}
}