// 1단계
// 단어의 개수 세기

import java.io.*;
class Solution211126 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split(" ");
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			if(!arr[i].equals("")) count++;
		}
		System.out.print(count);
	}
}