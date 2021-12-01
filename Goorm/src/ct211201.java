// 1단계
// 자동문

import java.io.*;
import java.lang.Math;

class Solution211201 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int count = Integer.parseInt(input);
		double[] len = new double[count];
		double[] a = new double[count];
		double[] v = new double[count];
		double time;
		double total;
		for(int i = 0; i < count; i++){
			String input1 = br.readLine();
			String[] arr = input1.split(" ");
			len[i] = Double.parseDouble(arr[0]);
			a[i] = Double.parseDouble(arr[1]);
			v[i] = Double.parseDouble(arr[2]);
		}
		
		for(int i = 0; i < count; i++){
			time = Math.sqrt(len[i] * 2 / a[i]);
			total = v[i] * time;
			System.out.println(String.format("%.2f", total));
		}
	}
}