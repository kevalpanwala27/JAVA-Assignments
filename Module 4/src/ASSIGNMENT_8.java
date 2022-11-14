import javax.swing.*;
public class ASSIGNMENT_8 {
    public ASSIGNMENT_8() {
        JFrame frame = new JFrame();
        String name = JOptionPane.showInputDialog(frame, "Enter your name: ");
        JOptionPane.showMessageDialog(frame, "Hello " + name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new ASSIGNMENT_8();
        System.exit(0);
    }
}


