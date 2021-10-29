// 1단계
// 하샤드 수

class Solution210922 {
    public boolean solution(int x) {
        boolean answer = true;
        String str_x = Integer.toString(x);
        int sum = 0;
        for(int i = 0; i < str_x.length(); i++){
            sum += Character.getNumericValue(str_x.charAt(i));
        }
        if(x % sum == 0){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}