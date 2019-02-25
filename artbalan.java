import java.util.Arrays;
import java.util.Scanner;

/**
 * artbalan
 */
public class artbalan {

    int[] charFreq(String input) {
        int[] array = new int[26];
        int size = 0;
        for (int i = 0; i < input.length(); i++) {
            int val = input.charAt(i) - 65;
            if (array[val] == 0)
                size++;
            array[val]++;
        }
        Arrays.sort(array);
        int[] data = new int[size];
        int k = array.length - 1;
        int i = 0;
        while (array[k] != 0)
            data[i++] = array[k--];
        return data;
    }

    int logic(int[] arr, int len, int fre, int dis) {
        int min = 0;
        int total = len / dis;
        if (fre == dis) {
            for (int a : arr) {
                if (a <= total)
                    break;
                min += (a - total);
            }
        } else if (dis < fre) {
            for (int i = 0; i < dis; i++)
                min += Math.abs(arr[i] - total);
            for (int i = dis; i < fre; i++)
                min += arr[i];
            min >>= 1;
        } else {
            for (int i = 0; i < arr.length; i++)
                min += Math.abs(arr[i] - total);
            min += ((dis - fre) * total);
            min >>= 1;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        while (test-- > 0) {
            String input = s.next();
            int length = input.length();
            if (length <= 2) {
                System.out.println(0);

            } else {
                int[] sorted = new artbalan().charFreq(input);
                int size = sorted.length > 26 ? 26 : sorted.length;
                int min = Integer.MAX_VALUE;
                for (int i = 1; i <= size; i++) {
                    if (length % i == 0) {
                        int ranmin = new artbalan().logic(sorted, length, sorted.length, i);
                        if (min > ranmin)
                            min = ranmin;
                    }
                }
                System.out.println(min);
            }

        }
        s.close();
        System.exit(0);
    }
}