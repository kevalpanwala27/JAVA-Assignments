import java.util.Scanner;

public class ASSIGNMENT_10 {
    public static void main(String[] args) {
        char c;
        int t, i, j;
        Scanner sc = new Scanner(System.in);
        String s;
        int k, d;
        System.out.println("With Which symbol you want to make diamond??(Enter single char):");
        s = sc.next();
        System.out.println("How many max " + s.charAt(0) + " : ");
        t = sc.nextInt();
        t--;
        for (i = 0; i <= t; i++ ) {
            System.out.print("\t\t\t\t");
            for (k = 0; k<t-i; k++) {
                System.out.print(" ");
            }
            for (j = 0; j<=i; j++) {
                System.out.print(s.charAt(0) + " ");
            }
            System.out.println(" ");
        }
        for (i = t; i>=0; i--) {
            System.out.print("\t\t\t\t");
            for (k = t - i; k>0; k--) {
                System.out.print(" ");
            }
            for (j = i; j>=0;j--) {
                System.out.print(s.charAt(0) + " ");
            }
            System.out.println(" ");
        }
    }
}
