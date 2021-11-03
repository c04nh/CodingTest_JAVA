// 1단계
// 최소값

import java.io.*;

class Solution211103 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1 = br.readLine();
		String input2 = br.readLine();
		String[] arr = input2.split(" ");
		int min = Integer.parseInt(arr[0]);
		for(int i = 1; i < arr.length; i++){
			if(min > Integer.parseInt(arr[i])) min = Integer.parseInt(arr[i]);
		}
		System.out.println(min);
	}
}