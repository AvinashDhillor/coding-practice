/**
 * isbn
 */
public class isbn {

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        String number = s.next();
        int sum = 0;
        if (number.length() != 10) {
            System.out.println("Illegal ISBN");
            System.exit(0);
        }
        for (int i = 0; i < 10; i++) {
            sum += (number.charAt(i) - 48) * (i + 1);
        }
        if (sum % 11 == 0)
            System.out.println("Legal ISBN");
        else
            System.out.println("Illegal ISBN");
        s.close();
    }
}