// 1단계
// 정사각형의 개수

import java.io.*;
class Solution211203 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		long total = 0;
		for(int i = 1; i <= num; i++) total += (long) i * i;
		System.out.println(total);
	}
}