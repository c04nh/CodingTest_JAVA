// 1단계
// 공백 없애기

import java.io.*;
class Solution211109 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		for(int i = 0; i < input.length(); i++){
			if(input.charAt(i) != ' ') System.out.print(input.charAt(i));
		}
	}
}