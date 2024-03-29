// 2단계
// 소수 찾기

import java.util.*;

class Solution220629 {
    boolean[] visited;
    Set<Integer> map;

    public int solution(String numbers) {
        visited = new boolean[numbers.length()];
        map = new HashSet<>();

        backTracking(0, numbers, "");
        return map.size();
    }

    public void backTracking(int depth, String numbers, String current) {
        if (depth == numbers.length()) {
            return;
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                String number = current + numbers.charAt(i);

                if (check(number)) {
                    map.add(Integer.parseInt(number));
                }

                backTracking(depth + 1, numbers, number);
                visited[i] = false;
            }
        }
    }

    public boolean check(String number) {
        int num = Integer.parseInt(number);

        for (int i = 2; i <= num; i++) {
            if (i != num && num % i == 0)
                return false;
        }

        if (num <= 1) return false;
        return true;
    }
}