// 1단계
// 막대기

import java.io.*;
class Solution211125 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int cnt = Integer.parseInt(input);
		int[] stick = new int[cnt];
		int count = 1;
		for(int i = 0; i < cnt; i++){
			stick[i] = Integer.parseInt(br.readLine());
		}
		int long_stick = stick[cnt - 1];
		for(int i = cnt - 2; i >= 0; i--){
			if(stick[i] > long_stick){
				count++;
				long_stick = stick[i];
			}
		}
		System.out.print(count);
	}
}