package oop;
import javax.swing.JOptionPane;
public class FirstDialog {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello World! How are you?");
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello " + name);
    }
}
