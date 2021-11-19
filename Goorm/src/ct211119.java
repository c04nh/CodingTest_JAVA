// 1단계
// Bubble Sort

import java.io.*;
class Solution211119 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String input2 = br.readLine();
		String[] arr = input2.split(" ");
		int[] nums = new int[arr.length];
		int temp;
		for(int i = 0; i < arr.length; i++){
			nums[i] = Integer.parseInt(arr[i]);
		}
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length - i - 1; j++){
				if(nums[j] > nums[j + 1]){
					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) System.out.print(nums[i] + " ");
	}
}