
/**
 * Aircraft
 */
import java.util.*;

public class Aircraft {

    static long sol(long x) {
        long sol = 0;
        while (true) {
            if (x / 2 == 0)
                return sol;
            if (x % 2 == 0) {
                x = x / 2;
                sol++;
            } else {
                x = x - 1;
                sol++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            long number = s.nextLong();
            System.out.println(sol(number));
        }
        s.close();
        System.exit(0);
    }
}