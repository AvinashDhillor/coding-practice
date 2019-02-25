import java.util.Scanner;

/**
 * magicjar
 */
public class magicjar {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        while (test-- > 0) {
            long number = s.nextLong();
            long sum = 0;
            while (number-- > 0) {
                long ing = s.nextInt();
                sum += ing - 1;
            }
            System.out.println(sum + 1);
        }
        s.close();
    }
}