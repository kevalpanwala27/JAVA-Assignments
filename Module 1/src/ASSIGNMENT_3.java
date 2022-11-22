import java.util.Scanner;

public class ASSIGNMENT_3 {
    public static void main(String[] args) {
        System.out.println("Enter num1 op nam2:");
        Scanner sc = new Scanner(System.in);
        double d1 = sc.nextDouble();
        char op = sc.next().charAt(0);
        double d2 = sc.nextDouble();

        if (op == '+') {
            System.out.println((int)(d1 + d2));
        } else if (op == '-') {
            System.out.println((int)(d1 - d2));
        } else if (op == '/') {
            System.out.println((d1/d2));
        } else if (op == '*') {
            System.out.println((int)d1*d2);
        }
    }
}
