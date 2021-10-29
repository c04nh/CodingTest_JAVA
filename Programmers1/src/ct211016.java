// 1단계
// 실패율

import java.util.*;

class Solution211016 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] stage_user = new double[N + 1];
        for(int i : stages){
            if(i == N+1){
                continue;
            }
            stage_user[i]++;
        }
        ArrayList<Double> fail = new ArrayList<Double>();
        double user = stages.length;
        double count;
        for(int i = 1; i < stage_user.length; i++){
            count = stage_user[i];
            if(user == 0){
                stage_user[i] = 0;
            }else{
                stage_user[i] = stage_user[i]/user;
                user = user - count;
            }
            fail.add(stage_user[i]);
        }
         Collections.sort(fail, Collections.reverseOrder());
        for(int i = 0; i < fail.size(); i++){
            for(int j = 1; j < stage_user.length; j++){
                if(fail.get(i) == stage_user[j]){
                    answer[i] = j;
                    stage_user[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}