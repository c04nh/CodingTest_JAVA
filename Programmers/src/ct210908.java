// 1단계
// 문자열 다루기 기본

class Solution210908 {
    public boolean solution(String s) {
        try{
            int s1 = Integer.parseInt(s);
            if(s.length() == 4 || s.length() == 6){
                return true;
            }
            return false;
        }catch(NumberFormatException e){
            return false;
        }
    }
}