// 미림 마이스터고 코딩테스트 대비반
// 파트 01. 그리디(Greedy)_Java
// Step 2. 가장 큰 수

import java.util.*;

class Solution220712 {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                return (b + a).compareTo(a + b);
            }
        });

        if(str[0].equals("0")) return "0";

        for(String s: str) answer += s;

        return answer;
    }
}