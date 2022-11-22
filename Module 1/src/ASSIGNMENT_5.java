import java.util.Scanner;

public class ASSIGNMENT_5 {
    public static void main(String[] args) {
        int x, y, z, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        if (x > y && x > z) {
            System.out.println("Max number is: " + x);
        } else if (y > z) {
            System.out.println("Max number is: " + y);
        } else
            System.out.println("Max number is: " + z);
    }
}
