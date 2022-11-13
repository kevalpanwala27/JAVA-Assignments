import java.util.Scanner;
class NotSufficientFundException extends Exception
{
    public String toString() {return "Not sufficient fund";}
}
public class ASSIGNMENT_10 {
    public static void main(String[] args) {
        System.out.print("Enter amount to deposit: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();System.out.print("Enter amount to be withdraw: ");
        int b = s.nextInt();
        int remaining_amount = a - b;
        System.out.println(remaining_amount);System.out.print("Enter amount to be withdraw again: ");
        int c = s.nextInt();
        int remaining_amount2;
        try {
            remaining_amount2 = remaining_amount - c;
            System.out.println(remaining_amount2);
        } catch (Exception e) {throw new RuntimeException(e);}
        System.out.print("Enter amount to be withdraw: ");
        int k = s.nextInt();
        if (remaining_amount2 < k) {
            try {
                throw new NotSufficientFundException();
            } catch (NotSufficientFundException e) {System.out.println(e);}
        }
    }
}



