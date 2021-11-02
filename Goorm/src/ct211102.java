// 1단계
// 369 게임

import java.io.*;

class Solution211102 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int clap = 0;
		for(int i = 1; i < Integer.parseInt(input); i++){
			for(int j = 0; j < Integer.toString(i).length(); j++){
				if(Integer.toString(i).charAt(j) == '3' || Integer.toString(i).charAt(j) == '6' || Integer.toString(i).charAt(j) == '9') clap++;
			}
		}
		System.out.print(clap);
	}
}