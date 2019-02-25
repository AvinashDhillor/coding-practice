import java.util.*;

class time {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        while (test-- > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int d = s.nextInt();
            int one = a * 60 + b;
            int two = c * 60 + d;
            int dif = two - one;
            System.out.println(dif / 60 + " " + dif % 60);
        }
        s.close();
    }
}