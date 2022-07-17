// 2단계
// 최댓값과 최솟값

import java.util.*;

class Solution220717 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i = 0; i < str.length; i++) {
            arr.add(Integer.parseInt(str[i]));
        }

        answer = "" + Collections.min(arr) + " " + Collections.max(arr);
        return answer;
    }
}