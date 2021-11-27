// 1단계
// 가위바위보

import java.io.*;
class Solution211127 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split(" ");
		int[] cnt = {0, 0, 0};
		for(int i = 0; i < 5; i++){
			if(arr[i].equals("1")) cnt[0]++;
			else if(arr[i].equals("2")) cnt[1]++;
			else if(arr[i].equals("3")) cnt[2]++;
		}
		if(cnt[0] > 0 && cnt[1] > 0 && cnt[2] > 0) System.out.print("0");
		else if(cnt[0] == 5 || cnt[1] == 5 || cnt[2] == 5) System.out.print("0");
		else if(cnt[0] == 0) System.out.print(cnt[2]);
		else if(cnt[1] == 0) System.out.print(cnt[0]);
		else System.out.print(cnt[1]);
	}
}