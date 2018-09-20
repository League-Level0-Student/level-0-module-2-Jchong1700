package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
public static void main(String[] args) {
	int ticket1 = new Random().nextInt(101);
	int ticket2 = new Random().nextInt(101);
	int ticket3 = new Random().nextInt(101);
	int ticket4= new Random().nextInt(101);
	int ticket5= new Random().nextInt(101);
	
	JOptionPane.showMessageDialog(null,"Lottery numbers are \n" + ticket1 + "\n" 
			+ ticket2 + "\n" +ticket3 + "\n"+ ticket4 +"\n"+ticket5);
	
	
	
}
}
