// 빠른 A+B

import java.io.*;
import java.util.StringTokenizer;

class Solution211225{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
		StringTokenizer st;
 		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}