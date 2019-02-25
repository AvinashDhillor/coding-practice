import java.util.*;

public class cipher {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String val = s.next();
        int key = s.nextInt();
        int alphaset = key % 27;
        int numericset = key % 11;
        String sol = "";
        for (int i = 0; i < val.length(); i++) {
            int v = val.charAt(i);
            if (v >= 48 && v <= 57) {

            }
        }
    }
}