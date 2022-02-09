// 골드바흐의 추측

import java.util.Scanner;

class Solution220210{
    public static boolean[] prime = new boolean[10001];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        get_prime();
        int T = scan.nextInt(); 
        while (T-- > 0) {
            int n = scan.nextInt();
            int partition1 = n / 2;
            int partition2 = n / 2;
            while (true) {    // 두 파티션이 모두 소수일 경우
                if (!prime[partition1] && !prime[partition2]) {
                    System.out.println(partition1 + " " + partition2);
                    break;
                }
                partition1--;
                partition2++;
            }
        }
    }
    public static void get_prime() {
        prime[0] = prime[1] = true;
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}