// 1단계
// 체육복

import java.util.*;

class Solution211019 {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] a = new int[n + 2];
        int answer = 0;
        for(int i = 1; i <= n; i++)
            a[i] = 1;
        for(int i = 0; i < reserve.length; i++)
            a[reserve[i]] = 2;
        for(int i = 0; i < lost.length; i++)
            if(a[lost[i]] == 1) a[lost[i]] = 0;
            else a[lost[i]] = 1;
        for(int i = 1; i <= n ; i++){
            if(a[i] == 0){
                if(a[i - 1] == 2){
                    a[i] = 1;
                    a[i - 1] = 1;
                }else if(a[i + 1] == 2){
                    a[i] = 1;
                    a[i + 1] = 1;
                }
            }
        }
        int count = 0;
        for(int i = 1; i <= n; i++)
            if(a[i] == 0) count++;
        answer = n - count;
        return answer;
    }
}