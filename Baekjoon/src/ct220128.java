// 달팽이는 올라가고 싶다

import java.io.*;
import java.util.StringTokenizer;
 
class Solution220128{
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
 
		int cnt = (V - B) / (A - B);
		if ((V - B) % (A - B) != 0)
			cnt++;
 
		System.out.println(cnt);
	}
}