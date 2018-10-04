package methods;
import javax.swing.JOptionPane;

public class votingBooth {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "It's time to vote!");
String age = JOptionPane.showInputDialog("How old are you?");
	int voting = Integer.parseInt(age);
	
	if(voting >= 18) {
		JOptionPane.showInputDialog("Who do you think the next President should be?");
		}
	else {
		JOptionPane.showMessageDialog(null, "No one cares what you think...");
		}
	}
}
