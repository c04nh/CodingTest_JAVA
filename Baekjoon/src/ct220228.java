// 수 정렬하기 2

import java.util.*;
 
class Solution220228{	
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(scan.nextInt());
		}
		Collections.sort(list);
		for(int value : list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
	}
}