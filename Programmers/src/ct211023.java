// 1단계
// 폰켓몬

import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = 1;
        int result = nums.length / 2;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]) count++;
        }
        if(count < result) answer = count;
        else answer = result;
        return answer;
    }
}