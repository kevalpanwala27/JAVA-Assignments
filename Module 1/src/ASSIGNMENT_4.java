import java.util.Scanner;

public class ASSIGNMENT_4 {
    public static void main(String[] args) {
        int m1, m2, m3, m4, m5, m6, avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks:");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();
        m6 = sc.nextInt();

        avg = (m1 + m2 + m3 + m4 + m5 + m6)/6;
        System.out.println("Average is: " + avg);
    }
}

