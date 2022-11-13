import java.util.Scanner;
class AgeIsLessException extends Exception
{
    public String toString() {
        return "AgeIsLessException";
    }
}
public class ASSIGNMENT_9 {
    public static void main(String[] args) {
        try {
            System.out.println("Enter age of the person ");
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            if (age <= 0) {
                throw new AgeIsLessException();
            }if (age >= 18) {
                System.out.println("Eligible Voter");
            }else
                System.out.println("Not eligible voter");
        } catch (AgeIsLessException e) {
            System.out.println(e);
        }
    }
}


