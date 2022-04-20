// 구간 합 구하기 4

import java.io.*;
import java.util.*;

class Solution220420{
    static int N, M;
    static int start,end;
    static int [] num, dp;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        num = new int[N + 1];
        dp = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N;i++){
            num[i] = Integer.parseInt(st.nextToken());
            dp[i] = dp[i - 1] + num[i];
        }
        sb = new StringBuilder();
        for (int i = 1; i <= M; i++){
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            sb.append(dp[end] - dp[start - 1]+"\n");

        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
        br.close();
    }
}