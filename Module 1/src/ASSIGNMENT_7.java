import java.util.Scanner;

public class ASSIGNMENT_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter your sentence:");
        String sw[];
        String s;
        String sent = sc.nextLine();
        sw = sent.split(" ");
        char c;
        for (int i = 0; i < sw.length; i++) {
            System.out.println(sw[i]);
            s = sw[i];
            c = s.charAt(0);
            if (c >= 65 && c <= 90) {
                count++;
            }
        }
        System.out.println("Number of capital words: " + count);
    }
}
