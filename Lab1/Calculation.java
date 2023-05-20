package oop;
import javax.swing.JOptionPane;
public class Calculation {
    public static void main(String[] args){
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double sub = num1 - num2;
        double mul = num1 * num2;

        if (num2 !=0) {
            double div = Math.round ((num1 / num2));
            JOptionPane.showMessageDialog(null, "Sum = " + sum + "/nSub = " + sub + "/nMul = " + mul + "/n" + "Div = " + div, "Result", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "the divisor is zero");
            JOptionPane.showMessageDialog(null, "Sum = " + sum + "/nSub = " + sub + "/nMul = " + mul + "/n", "Result", JOptionPane.INFORMATION_MESSAGE);
        }
        }
        
    }

