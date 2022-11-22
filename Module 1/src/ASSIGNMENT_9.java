import java.util.Scanner;

public class ASSIGNMENT_9 {
    public static void main(String[] args) {
        char c;
        int i, j;
        Scanner in = new Scanner(System.in);
        String s; // = new String("STREAM");
        System.out.println("Enter a string:");
        s = in.next();
        int k, d;
        for (i = 0; i<s.length(); i++) {
            for (k = 0; k<s.length() - i; k++) {
                System.out.print(" ");
            }
            for (j = 0; j<=i; j++) {
                c = s.charAt(j);
                System.out.print(c + " ");
            }
            System.out.println(" ");
        }
    }
}
