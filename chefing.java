import java.util.Scanner;

/**
 * chefing
 */
public class chefing {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        while (test-- > 0) {
            int number = s.nextInt();
            int numberCpy = number;
            int[] alphaArrays = new int[26];
            while (number-- > 0) {
                boolean checkArray[] = new boolean[26];

                String word = s.next();
                for (int i = 0; i < word.length(); i++) {
                    int index = word.charAt(i) - 97;
                    if (!checkArray[index]) {
                        alphaArrays[index]++;
                        checkArray[index] = true;
                    }
                }
            }
            int sol = 0;
            for (int i : alphaArrays) {
                if (i == numberCpy) {
                    sol++;
                }
            }
            System.out.println(sol);
        }
        s.close();
    }
}