// 2단계
// 멀쩡한 사각형

class Solution220615 {
    public long solution(long w, long h) {
        long answer = 0;

        for(int i = 0; i < w; i++) {
            answer += h * i / w ;
        }

        return answer * 2;
    }
}