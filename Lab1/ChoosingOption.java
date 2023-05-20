package lab1;
import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void mani(String[] args){
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change the first class ticket?");
        JOptionPane.showMessageDialog(null, "you've chosen: "+ (option == JOptionPane.YES_OPTION?"Yes":(option == JOptionPane.NO_OPTION?"No":"Cancel")));
        System.exit(0);
    }
}
