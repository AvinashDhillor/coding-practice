
/**
 * sevenSegment
 */
import java.util.*;

public class sevenSegment {
    final static int[] number = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = s.nextInt();
        while (t-- > 0) {
            String df = s.next();
            int no = 0;
            for (int i = 0; i < df.length(); i++) {
                no += number[df.charAt(i) - 48];
            }

            String sol = "", result = "";
            int a = no / 2;
            if (no % 2 == 1) {
                a = a - 1;
            }
            for (int i = 0; i < a; i++) {
                sol += "1";
            }
            a = no % 2;
            if (a != 0) {
                result = "7" + sol;
            } else {
                result = sol;
            }

            sb.append(result + "\n");
        }
        System.out.println(sb);
        s.close();

    }
}