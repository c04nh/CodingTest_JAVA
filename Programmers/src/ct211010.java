// 1단계
// 2016년

class Solution211010 {
    public String solution(int a, int b) {
        String answer = "";
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int count_day = 0;
        for(int i = 0; i < a - 1; i++){
            count_day += month[i];
        }
        count_day += b;
        answer = day[count_day % 7];
        return answer;
    }
}