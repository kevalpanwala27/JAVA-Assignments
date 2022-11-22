import java.util.Scanner;

public class ASSIGNMENT_8 {
    public static void main(String[] args) {
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        int con = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence:");
        String s1 = sc.nextLine();
        String s2 = s1.toLowerCase();
        int length = s2.length();
        for (int j = 0; j<length; j++) {
            char c = s2.charAt(j);
            if (c == 'a') {
                a++;
            } else if (c == 'e') {
                e++;
            } else if (c == 'i') {
                i++;
            } else if (c == 'o') {
                o++;
            } else if (c == 'u') {
                u++;
            } else if (!s2.equals("quit")) {
                con++;
            } else
                break;
        }
        System.out.println("Number of a is: " + a);
        System.out.println("Number of e is: " + e);
        System.out.println("Number of i is: " + i);
        System.out.println("Number of o is: " + o);
        System.out.println("Number of u is: " + u);
    }
}
