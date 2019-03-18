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
                int add;
                if ((v + numericset) / 58 == 0)
                    add = 0;
                else
                    add = 48;
                sol += (char) ((v + numericset) % 58 + add);
            } else if (v >= 65 && v <= 90) {
                int add;
                if ((v + alphaset) / 91 == 0)
                    add = 0;
                else
                    add = 65;
                sol += (char) ((v + alphaset) % 91 + add);
            } else if (v >= 97 && v <= 122) {
                int add;
                if ((v + alphaset) / 123 == 0)
                    add = 0;
                else
                    add = 97;
                sol += (char) ((v + alphaset) % 123 + add);
            } else {
                sol += (char) v;
            }
        }
        System.out.println(sol);
        s.close();
    }
}