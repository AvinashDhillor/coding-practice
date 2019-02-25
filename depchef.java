import java.util.Scanner;

/**
 * depchef
 */
public class depchef {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int test = s.nextInt();
        while (test-- > 0) {
            int noOfSoldiers = s.nextInt();
            int[] attack = new int[noOfSoldiers];
            int[] defense = new int[noOfSoldiers];
            for (int i = 0; i < noOfSoldiers; i++)
                attack[i] = s.nextInt();
            for (int i = 0; i < noOfSoldiers; i++)
                defense[i] = s.nextInt();
            int max = -1;
            if (attack[noOfSoldiers - 1] + attack[1] < defense[0]) {
                if (max < defense[0])
                    max = defense[0];
            }
            if (attack[noOfSoldiers - 2] + attack[0] < defense[noOfSoldiers - 1]) {
                if (max < defense[noOfSoldiers - 1])
                    max = defense[noOfSoldiers - 1];
            }
            for (int i = 1; i < noOfSoldiers - 1; i++) {
                if (attack[i - 1] + attack[i + 1] < defense[i]) {
                    if (defense[i] > max)
                        max = defense[i];
                }
            }
            System.out.println(max);
        }
        s.close();
    }
}