// 1단계
// 앵무새 꼬꼬

import java.io.*;

class Solution211204 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input_num = br.readLine();
		int num = Integer.parseInt(input_num);
		String[] input = new String[num];
		String[] print = new String[num];
		for(int i = 0; i < num; i++){
			input[i] = br.readLine();
			print[i] = "";
			for(int j = 0; j < input[i].length(); j++){
				if(input[i].charAt(j) == 'A' || input[i].charAt(j) == 'a' || input[i].charAt(j) == 'E' || input[i].charAt(j) == 'e' || input[i].charAt(j) == 'I' || input[i].charAt(j) == 'i' || input[i].charAt(j) == 'O' || input[i].charAt(j) == 'o' || input[i].charAt(j) == 'U' || input[i].charAt(j) == 'u') print[i] += input[i].charAt(j);
			}
			if(print[i].length() == 0) print[i] = "???";
			System.out.println(print[i]);
		}
	}
}