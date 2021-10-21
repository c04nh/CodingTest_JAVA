// 1단계
// [1차] 비밀지도
class Solution211021 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String num = "";
        for(int i = 0; i < n; i++){
            num = Integer.toBinaryString (arr1[i] | arr2[i]);
            num = String.format("%" + n + "s", num);
            num = num.replace('1', '#');
            num = num.replace('0', ' ');
            answer[i] = num;
        }
        return answer;
    }
}