// 좌표 압축

import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
 
class Solution220308{
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] origin = new int[N];
		int[] sorted = new int[N];
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();	// rank를 매길 HashMap
 		for(int i = 0; i < N; i++) {
			sorted[i] = origin[i] = scan.nextInt();
		}
		Arrays.sort(sorted);
		int rank = 0;
		for(int v : sorted) {
			if(!rankingMap.containsKey(v)) {
				rankingMap.put(v, rank);
				rank++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int key : origin) {
			int ranking = rankingMap.get(key);
			sb.append(ranking).append(' ');
		}
		System.out.println(sb);
	}
}