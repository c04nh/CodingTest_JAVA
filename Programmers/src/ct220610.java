// 2단계
// 더 맵게

import java.util.PriorityQueue;

class Solution220610 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue();

        for (int scov : scoville) {
            heap.offer(scov);
        }

        while (heap.peek() <= K) {
            if (heap.size() == 1) {
                return -1;
            }

            int a = heap.poll();
            int b = heap.poll();

            int result = a + (b * 2);

            heap.offer(result);
            answer ++;
        }
        return answer;
    }
}
