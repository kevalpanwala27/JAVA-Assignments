import java.util.Scanner;

public class ASSIGNMENT_6 {
    public static void main(String[] args) {
        int vcount = 0, ccount = 0;
        System.out.println("Enter your sentence:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();

        for (int i = 0; i<str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vcount++;
            } else
                ccount++;
        }
        System.out.println("Vowels are: " + vcount);
        System.out.println("Consonants are: " + ccount);
    }
}
