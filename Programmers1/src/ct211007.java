// 1단계
// 소수 만들기

class Solution211007 {
    public int solution(int[] nums) {
        int answer = 0;
        int sumnum, countnum;
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    sumnum = nums[i] + nums[j] + nums[k];
                    countnum = 0;
                    for(int l = 1; l < sumnum + 1; l++){
                        if(sumnum % l == 0) countnum++;
                    }
                    if(countnum == 2) answer++;
                }
            }
        }
        return answer;
    }
}
