// 1단계
// 삼각형의 넓이

import java.io.*;
class Solution211112 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split(" ");
		int width = Integer.parseInt(arr[0]);
		int height = Integer.parseInt(arr[1]);
		double area = width * height / 2.0;
		System.out.printf("%.1f", area);
	}
}