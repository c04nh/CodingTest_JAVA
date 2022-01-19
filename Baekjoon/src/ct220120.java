// 단어의 개수

import java.util.Scanner;
import java.util.StringTokenizer;

class Solution220120{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		scan.close();
		StringTokenizer st = new StringTokenizer(S, " ");
		System.out.println(st.countTokens());	
	}
}