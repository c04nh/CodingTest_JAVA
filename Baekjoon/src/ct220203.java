// 큰 수 A+B

import java.io.*;
import java.util.StringTokenizer;
import java.math.BigInteger;

class Solution220203{
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		BigInteger sum = A.add(B);
		System.out.print(sum);
	}
}