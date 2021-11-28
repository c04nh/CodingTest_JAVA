// 1단계
// 고장난 컴퓨터

import java.io.*;
class Solution211128 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String input2 = br.readLine();
		String[] arr = input.split(" ");
		String[] arr2 = input2.split(" ");
		int num1 = Integer.parseInt(arr[0]);
		int num2 = Integer.parseInt(arr[1]);
		int[] array = new int[num1];
		for(int i = 0; i < array.length; i++){
			array[i] = Integer.parseInt(arr2[i]);
		}
		int cnt = 1;
		for(int i = 0; i < num1 - 1; i++){
			if((array[i + 1] - array[i]) > num2) cnt = 1;
			else cnt++;
		}
		System.out.print(cnt);
	}
}