// 1단계
// 헷갈리는 짝댁;

import java.io.*;
class Solution211123 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int[] cnt = {0, 0, 0, 0};
		for(int i = 0; i < input.length(); i++){
			if(input.charAt(i) == '1') cnt[0]++;
			else if(input.charAt(i) == 'I') cnt[1]++;
			else if(input.charAt(i) == 'l') cnt[2]++;
			else if(input.charAt(i) == '|') cnt[3]++;
		}
		for(int i = 0; i < 4; i++){
			System.out.println(cnt[i]);
		}
	}
}