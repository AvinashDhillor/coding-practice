import java.util.*;

public class test {

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

    public static void main(String[] args) {
        int[] t = new test().charFreq("AAAAAFFGDFDFGHSSSA");
        for (int k : t)
            System.out.println(k);
    }
}