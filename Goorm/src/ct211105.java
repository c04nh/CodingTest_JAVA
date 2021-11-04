// 1단계
// Min 함수

import java.io.*;

class Solution211105 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split(" ");
		int min_num = min(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
		System.out.print(min_num);
	}
	public static int min(int a, int b){
		int min = 0;
		if(a > b) min = b;
		else min = a;
		return min;
	}
}