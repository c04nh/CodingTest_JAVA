// 단어 공부

import java.util.Scanner;
 
class Solution220119{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[26];
		String s = scan.next().toUpperCase();
        int max = -1;
		char ch = '?';
		for (int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 65]++;
            if (arr[s.charAt(i) - 65] > max) {
				max = arr[s.charAt(i) - 65];
				ch = s.charAt(i);
			}else if(max == arr[s.charAt(i) - 65]) ch = '?';
		}
		System.out.print(ch);
	}
}