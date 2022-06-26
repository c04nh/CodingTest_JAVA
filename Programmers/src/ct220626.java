// 2단계
// 다음 큰 숫자

class Solution220626 {
    public int solution(int n) {
        int bitCount = Integer.bitCount(n);
        for(int i = n + 1; ; i++) {
            if(bitCount == Integer.bitCount(i)) {
                return i;
            }
        }
    }
}