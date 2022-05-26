// 서로 다른 부분 문자열의 개수

import java.util.*;

class Solution220526{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        HashSet<String> list = new HashSet<>();
        for(int i = 0; i <= s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){
                if(!list.contains(s.substring(i, j))){
                    list.add(s.substring(i, j));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(list.size() + "\n");
        System.out.println(sb);
    }
}