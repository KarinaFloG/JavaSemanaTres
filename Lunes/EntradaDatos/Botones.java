import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class Botones{
	public static void main(String[] args){
		
		JFrame frame = new JFrame("Ejemplo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn1 = new JButton("Boton 1");
		JButton btn2 = new JButton("Boton 2");
		JButton btn3 = new JButton("Boton 3");

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);

		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}