import javax.swing.JOptionPane;
public class HelloNameDialog{
	public static void main(String[] args) {
		String results;
		results = JOptionPane.showInputDialog("Please enter your name:");
		JOption.showMessageDialog(null, "Hi "+ results + "!");
	}
}
