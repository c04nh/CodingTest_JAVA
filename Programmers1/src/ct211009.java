// 1단계
// 최소직사각형

class Solution211009 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int temp = 0;
        int[] width = new int[sizes.length];
        int[] height = new int[sizes.length];
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];  
                sizes[i][1] = temp; 
            }
            width[i] = sizes[i][0];
            height[i] = sizes[i][1];
        }
        int maxW = width[0];
        int maxH = height[0];
        for(int i = 1; i < width.length; i++){
            if(maxW < width[i]) maxW = width[i];
            if(maxH < height[i]) maxH = height[i];
        }
        answer = maxW * maxH;
        return answer;
    }
}