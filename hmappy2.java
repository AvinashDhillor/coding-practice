
/**
 * hmappy2
 */
import java.util.*;

public class hmappy2 {

    private static long HCF(long a, long b) {
        if (b == 0)
            return a;
        return HCF(b, a % b);
    }

    private static long HCD(long a, long b) {
        return (a * b) / HCF(a, b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        while (test-- > 0) {
            long n = s.nextLong();
            long a = s.nextLong();
            long b = s.nextLong();
            long k = s.nextLong();
            long hcd = HCD(a, b);
            long val = (n / a) + (n / b) - (2 * (n / hcd));
            System.out.println(val >= k ? "Win" : "Lose");
        }
        s.close();
        System.exit(0);
    }
}