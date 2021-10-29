// 1단계
// 로또의 최고 순위와 최저 순위

class Solution211012 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count_zero = 0;
        int count_num = 0;
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0) count_zero++;
        }
        for(int i = 0; i < lottos.length; i++){
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    count_num++;
                }
            }
        }
        int highest = count_num + count_zero;
        answer[0] = GetRank(highest);
        answer[1] = GetRank(count_num);
        return answer;
    }
    public int GetRank(int num){
        int rank;
        switch(num){
            case 6:
                rank = 1;
                break;
            case 5:
                rank = 2;
                break;
            case 4:
                rank = 3;
                break;
            case 3:
                rank = 4;
                break;
            case 2:
                rank = 5;
                break;
            default:
                rank = 6;
                break;
        }
        return rank;
    }
}