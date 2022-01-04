// 더하기 사이클
import java.util.Scanner;

class Solution220104{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = N;
        int cnt = 0;
        while (true) {
            if (cnt != 0 && N == num) {
                break;
            }
            if (num < 10) {
                num = num * 11;
                cnt++;
                continue;
            }
            int sum = (num / 10) + (num % 10);
            num = (num % 10 * 10) + (sum % 10);
            cnt++;
        }
        System.out.println(cnt);
    }
}