import java.util.Scanner;

public class ASSIGNMENT_7 {
    public static void main(String[] args) {
//        int a=10, b=0, c; // value taken by us.
        // Trying using scanner.
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        try {
            c = a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be 0, try again"); // This is our own message
            System.out.println(e); // Compiler message. // error message.
        }
    }
}



