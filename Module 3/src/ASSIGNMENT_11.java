import java.util.*;
class insufficientFunds extends Exception {
    private String msg;
    public insufficientFunds(String s) { this.msg = s; }
    public String toString() { return this.msg; }
}
public class ASSIGNMENT_11 {
    public static void main(String[] args) throws insufficientFunds {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your balance: ");
        float amt, balance = sc.nextFloat();
        try {
            while(true) {
                System.out.print("Enter withdrawal amount: ");
                amt = sc.nextFloat();
                if(amt > balance)
                    throw new insufficientFunds("Not sufficient funds");
                balance -= amt;
                System.out.println("Updated balance: " + balance);
            }
        }
        catch(insufficientFunds ex) {
            System.out.println(ex);
        }
    }
}


