// 요세푸스 문제 0

import java.util.*;

class Solution220430{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int N = scan.nextInt();
        int K = scan.nextInt();
        for(int i = 1; i <= N; i++) {
            q.add(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        while(q.size() > 1) {
            for(int i = 0; i < K - 1; i++) {
                int val = q.poll();
                q.offer(val);
            }
            sb.append(q.poll()).append(", ");
        }
        sb.append(q.poll()).append('>');
        System.out.println(sb);
    }
}