package methods;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
String heightTest = JOptionPane.showInputDialog("How many inches tall are you?");
	int height = Integer.parseInt(heightTest);
	if(height >= 48) {
		JOptionPane.showMessageDialog(null, "You can go on the Rollercoaster!");
		}
	else {
		JOptionPane.showMessageDialog(null, "Grow some more to ride the Rollercoaster...");
		}
	}
}
